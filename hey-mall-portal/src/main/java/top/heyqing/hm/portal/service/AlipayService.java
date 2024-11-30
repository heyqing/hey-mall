package top.heyqing.hm.portal.service;

import top.heyqing.hm.portal.domain.AliPayParam;

import java.util.Map;

/**
 * ClassName:AlipayService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 支付宝支付Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface AlipayService {
    /**
     * 根据提交参数生成电脑支付页面
     */
    String pay(AliPayParam aliPayParam);

    /**
     * 支付宝异步回调处理
     */
    String notify(Map<String, String> params);

    /**
     * 查询支付宝交易状态
     * @param outTradeNo 商户订单编号
     * @param tradeNo 支付宝交易编号
     * @return 支付宝交易状态
     */
    String query(String outTradeNo, String tradeNo);

    /**
     * 根据提交参数生成手机支付页面
     */
    String webPay(AliPayParam aliPayParam);
}
