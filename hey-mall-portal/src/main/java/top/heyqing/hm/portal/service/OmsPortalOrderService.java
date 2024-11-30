package top.heyqing.hm.portal.service;

import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.common.responce.CommonPage;
import top.heyqing.hm.portal.domain.ConfirmOrderResult;
import top.heyqing.hm.portal.domain.OmsOrderDetail;
import top.heyqing.hm.portal.domain.OrderParam;

import java.util.List;
import java.util.Map;

/**
 * ClassName:OmsPortalOrderService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 前台订单管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface OmsPortalOrderService {
    /**
     * 根据用户购物车信息生成确认单信息
     */
    ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * 支付成功后的回调
     */
    @Transactional
    Integer paySuccess(Long orderId, Integer payType);

    /**
     * 自动取消超时订单
     */
    @Transactional
    Integer cancelTimeOutOrder();

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * 发送延迟消息取消订单
     */
    void sendDelayMessageCancelOrder(Long orderId);

    /**
     * 确认收货
     */
    void confirmReceiveOrder(Long orderId);

    /**
     * 分页获取用户订单
     */
    CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize);

    /**
     * 根据订单ID获取订单详情
     */
    OmsOrderDetail detail(Long orderId);

    /**
     * 用户根据订单ID删除订单
     */
    void deleteOrder(Long orderId);

    /**
     * 根据orderSn来实现的支付成功逻辑
     */
    @Transactional
    void paySuccessByOrderSn(String orderSn, Integer payType);
}