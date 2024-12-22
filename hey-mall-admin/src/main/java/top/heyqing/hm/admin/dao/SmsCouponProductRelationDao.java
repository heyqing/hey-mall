package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.SmsCouponProductRelation;

import java.util.List;

/**
 * ClassName:SmsCouponProductRelationDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 优惠券和商品关系自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsCouponProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<SmsCouponProductRelation> productRelationList);
}

