package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.OmsOrder;
import top.heyqing.hm.mbg.model.OmsOrderItem;
import top.heyqing.hm.mbg.model.OmsOrderOperateHistory;

import java.util.List;

/**
 * ClassName:OmsOrderDetail
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 订单详情信息
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    @ApiModelProperty("订单操作记录列表")
    private List<OmsOrderOperateHistory> historyList;
}