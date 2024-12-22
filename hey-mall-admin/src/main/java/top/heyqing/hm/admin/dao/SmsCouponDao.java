package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.admin.dto.SmsCouponParam;

/**
 * ClassName:SmsCouponDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 优惠券管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsCouponDao {
    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}