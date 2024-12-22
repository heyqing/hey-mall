package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.SmsCouponHistory;

import java.util.List;

/**
 * ClassName:SmsCouponHistoryService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 优惠券领取记录管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsCouponHistoryService {
    /**
     * 分页查询优惠券领取记录
     *
     * @param couponId  优惠券id
     * @param useStatus 使用状态
     * @param orderSn   使用订单号码
     */
    List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}