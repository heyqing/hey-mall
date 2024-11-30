package top.heyqing.hm.portal.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.OmsOrderItem;

import java.util.List;

/**
 * ClassName:PortalOrderItemDao
 * Package:top.heyqing.hm.portal.dao
 * Description:
 * 订单商品信息管理自定义Dao
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface PortalOrderItemDao {
    /**
     * 批量插入
     */
    int insertList(@Param("list") List<OmsOrderItem> list);
}
