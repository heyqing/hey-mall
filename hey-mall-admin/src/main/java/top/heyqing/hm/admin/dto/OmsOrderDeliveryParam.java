package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:OmsOrderDeliveryParam
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 订单发货参数
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {
    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("物流公司")
    private String deliveryCompany;
    @ApiModelProperty("物流单号")
    private String deliverySn;
}
