package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.admin.dto.OmsOrderDeliveryParam;
import top.heyqing.hm.admin.dto.OmsOrderDetail;
import top.heyqing.hm.admin.dto.OmsOrderQueryParam;
import top.heyqing.hm.mbg.model.OmsOrder;

import java.util.List;

/**
 * ClassName:OmsOrderDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 订单查询自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}