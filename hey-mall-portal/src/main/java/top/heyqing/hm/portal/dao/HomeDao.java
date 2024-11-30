package top.heyqing.hm.portal.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.CmsSubject;
import top.heyqing.hm.mbg.model.PmsBrand;
import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.portal.domain.FlashPromotionProduct;

import java.util.List;

/**
 * ClassName:HomeDao
 * Package:top.heyqing.hm.portal.dao
 * Description:
 * 首页内容管理自定义Dao
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
public interface HomeDao {

    /**
     * 获取推荐品牌
     */
    List<PmsBrand> getRecommendBrandList(@Param("offset") Integer offset, @Param("limit") Integer limit);

    /**
     * 获取秒杀商品
     */
    List<FlashPromotionProduct> getFlashProductList(@Param("flashPromotionId") Long flashPromotionId, @Param("sessionId") Long sessionId);

    /**
     * 获取新品推荐
     */
    List<PmsProduct> getNewProductList(@Param("offset") Integer offset, @Param("limit") Integer limit);
    /**
     * 获取人气推荐
     */
    List<PmsProduct> getHotProductList(@Param("offset") Integer offset,@Param("limit") Integer limit);

    /**
     * 获取推荐专题
     */
    List<CmsSubject> getRecommendSubjectList(@Param("offset") Integer offset, @Param("limit") Integer limit);
}
