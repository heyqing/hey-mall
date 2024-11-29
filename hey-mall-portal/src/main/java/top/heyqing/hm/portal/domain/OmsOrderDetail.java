package top.heyqing.hm.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.OmsOrder;
import top.heyqing.hm.mbg.model.OmsOrderItem;

import java.util.List;

/**
 * ClassName:OmsOrderDetail
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 包含商品信息的订单详情
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class OmsOrderDetail extends OmsOrder {
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;
}
