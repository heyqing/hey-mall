package top.heyqing.hm.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.heyqing.hm.mbg.mapper.PmsProductMapper;
import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.mbg.model.UmsMember;
import top.heyqing.hm.portal.domain.MemberReadHistory;
import top.heyqing.hm.portal.repo.MemberReadHistoryRepository;
import top.heyqing.hm.portal.service.MemberReadHistoryService;
import top.heyqing.hm.portal.service.UmsMemberService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName:MemberReadHistoryServiceImpl
 * Package:top.heyqing.hm.portal.service.impl
 * Description:
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {

    @Value("${mongo.insert.sqlEnable}")
    private Boolean sqlEnable;
    @Autowired
    private PmsProductMapper productMapper;
    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;
    @Autowired
    private UmsMemberService memberService;
    @Override
    public int create(MemberReadHistory memberReadHistory) {
        if (memberReadHistory.getProductId() == null) {
            return 0;
        }
        UmsMember member = memberService.getCurrentMember();
        memberReadHistory.setMemberId(member.getId());
        memberReadHistory.setMemberNickname(member.getNickname());
        memberReadHistory.setMemberIcon(member.getIcon());
        memberReadHistory.setId(null);
        memberReadHistory.setCreateTime(new Date());
        if (sqlEnable) {
            PmsProduct product = productMapper.selectByPrimaryKey(memberReadHistory.getProductId());
            if (product == null || product.getDeleteStatus() == 1) {
                return 0;
            }
            memberReadHistory.setProductName(product.getName());
            memberReadHistory.setProductSubTitle(product.getSubTitle());
            memberReadHistory.setProductPrice(product.getPrice() + "");
            memberReadHistory.setProductPic(product.getPic());
        }
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        List<MemberReadHistory> deleteList = new ArrayList<>();
        for(String id:ids){
            MemberReadHistory memberReadHistory = new MemberReadHistory();
            memberReadHistory.setId(id);
            deleteList.add(memberReadHistory);
        }
        memberReadHistoryRepository.deleteAll(deleteList);
        return ids.size();
    }

    @Override
    public Page<MemberReadHistory> list(Integer pageNum, Integer pageSize) {
        UmsMember member = memberService.getCurrentMember();
        Pageable pageable = PageRequest.of(pageNum-1, pageSize);
        return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(member.getId(),pageable);
    }

    @Override
    public void clear() {
        UmsMember member = memberService.getCurrentMember();
        memberReadHistoryRepository.deleteAllByMemberId(member.getId());
    }
}

