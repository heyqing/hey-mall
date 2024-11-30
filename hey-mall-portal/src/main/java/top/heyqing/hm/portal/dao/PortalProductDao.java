package top.heyqing.hm.portal.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.SmsCoupon;
import top.heyqing.hm.portal.domain.CartProduct;
import top.heyqing.hm.portal.domain.PromotionProduct;

import java.util.List;

/**
 * ClassName:PortalProductDao
 * Package:top.heyqing.hm.portal.dao
 * Description:
 * 前台购物车商品管理自定义Dao
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface PortalProductDao {
    /**
     * 获取购物车商品信息
     */
    CartProduct getCartProduct(@Param("id") Long id);

    /**
     * 获取促销商品信息列表
     */
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);

    /**
     * 获取可用优惠券列表
     */
    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId") Long productCategoryId);
}
