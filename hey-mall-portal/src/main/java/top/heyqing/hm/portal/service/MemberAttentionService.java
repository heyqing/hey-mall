package top.heyqing.hm.portal.service;

import org.springframework.data.domain.Page;
import top.heyqing.hm.portal.domain.MemberBrandAttention;

/**
 * ClassName:MemberAttentionService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 会员品牌关注管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface MemberAttentionService {
    /**
     * 添加关注
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 取消关注
     */
    int delete(Long brandId);

    /**
     * 分页获取会员关注列表
     */
    Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize);

    /**
     * 获取会员关注详情
     */
    MemberBrandAttention detail(Long brandId);

    /**
     * 清空关注列表
     */
    void clear();
}

