package top.heyqing.hm.portal.service;

import top.heyqing.hm.mbg.model.OmsCartItem;
import top.heyqing.hm.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * ClassName:OmsPromotionService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 促销管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     *
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
