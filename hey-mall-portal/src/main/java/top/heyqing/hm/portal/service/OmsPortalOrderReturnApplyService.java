package top.heyqing.hm.portal.service;

import top.heyqing.hm.portal.domain.OmsOrderReturnApplyParam;

/**
 * ClassName:OmsPortalOrderReturnApplyService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 前台订单退货管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
