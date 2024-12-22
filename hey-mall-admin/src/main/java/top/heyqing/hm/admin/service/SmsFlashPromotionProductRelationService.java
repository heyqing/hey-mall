package top.heyqing.hm.admin.service;

import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.admin.dto.SmsFlashPromotionProduct;
import top.heyqing.hm.mbg.model.SmsFlashPromotionProductRelation;

import java.util.List;

/**
 * ClassName:SmsFlashPromotionProductRelationService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 限时购商品关联管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsFlashPromotionProductRelationService {
    /**
     * 批量添加关联
     */
    @Transactional
    int create(List<SmsFlashPromotionProductRelation> relationList);

    /**
     * 修改关联信息
     */
    int update(Long id, SmsFlashPromotionProductRelation relation);

    /**
     * 删除关联
     */
    int delete(Long id);

    /**
     * 获取关联详情
     */
    SmsFlashPromotionProductRelation getItem(Long id);

    /**
     * 分页查询相关商品及限时购促销信息
     *
     * @param flashPromotionId        限时购id
     * @param flashPromotionSessionId 限时购场次id
     */
    List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);

    /**
     * 根据活动和场次id获取商品关系数量
     * @param flashPromotionId        限时购id
     * @param flashPromotionSessionId 限时购场次id
     */
    long getCount(Long flashPromotionId,Long flashPromotionSessionId);
}