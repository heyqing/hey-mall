package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.SmsCouponProductCategoryRelation;

import java.util.List;

/**
 * ClassName:SmsCouponProductCategoryRelationDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 优惠券和商品分类关系管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsCouponProductCategoryRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}