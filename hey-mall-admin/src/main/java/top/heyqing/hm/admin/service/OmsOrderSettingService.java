package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.OmsOrderSetting;

/**
 * ClassName:OmsOrderSettingService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 订单设置管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}

