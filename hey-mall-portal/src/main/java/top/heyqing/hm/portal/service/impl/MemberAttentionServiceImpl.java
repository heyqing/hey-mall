package top.heyqing.hm.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.heyqing.hm.mbg.mapper.PmsBrandMapper;
import top.heyqing.hm.mbg.model.PmsBrand;
import top.heyqing.hm.mbg.model.UmsMember;
import top.heyqing.hm.portal.domain.MemberBrandAttention;
import top.heyqing.hm.portal.repo.MemberBrandAttentionRepository;
import top.heyqing.hm.portal.service.MemberAttentionService;
import top.heyqing.hm.portal.service.UmsMemberService;

import java.util.Date;

/**
 * ClassName:MemberAttentionServiceImpl
 * Package:top.heyqing.hm.portal.service.impl
 * Description:
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
@Service
public class MemberAttentionServiceImpl implements MemberAttentionService {
    @Value("${mongo.insert.sqlEnable}")
    private Boolean sqlEnable;
    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private MemberBrandAttentionRepository memberBrandAttentionRepository;
    @Autowired
    private UmsMemberService memberService;

    @Override
    public int add(MemberBrandAttention memberBrandAttention) {
        int count = 0;
        if(memberBrandAttention.getBrandId()==null){
            return 0;
        }
        UmsMember member = memberService.getCurrentMember();
        memberBrandAttention.setMemberId(member.getId());
        memberBrandAttention.setMemberNickname(member.getNickname());
        memberBrandAttention.setMemberIcon(member.getIcon());
        memberBrandAttention.setCreateTime(new Date());
        MemberBrandAttention findAttention = memberBrandAttentionRepository.findByMemberIdAndBrandId(memberBrandAttention.getMemberId(), memberBrandAttention.getBrandId());
        if (findAttention == null) {
            if(sqlEnable){
                PmsBrand brand = brandMapper.selectByPrimaryKey(memberBrandAttention.getBrandId());
                if(brand==null){
                    return 0;
                }else{
                    memberBrandAttention.setBrandCity(null);
                    memberBrandAttention.setBrandName(brand.getName());
                    memberBrandAttention.setBrandLogo(brand.getLogo());
                }
            }
            memberBrandAttentionRepository.save(memberBrandAttention);
            count = 1;
        }
        return count;
    }

    @Override
    public int delete(Long brandId) {
        UmsMember member = memberService.getCurrentMember();
        return memberBrandAttentionRepository.deleteByMemberIdAndBrandId(member.getId(),brandId);
    }

    @Override
    public Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize) {
        UmsMember member = memberService.getCurrentMember();
        Pageable pageable = PageRequest.of(pageNum-1,pageSize);
        return memberBrandAttentionRepository.findByMemberId(member.getId(),pageable);
    }

    @Override
    public MemberBrandAttention detail(Long brandId) {
        UmsMember member = memberService.getCurrentMember();
        return memberBrandAttentionRepository.findByMemberIdAndBrandId(member.getId(), brandId);
    }

    @Override
    public void clear() {
        UmsMember member = memberService.getCurrentMember();
        memberBrandAttentionRepository.deleteAllByMemberId(member.getId());
    }
}
