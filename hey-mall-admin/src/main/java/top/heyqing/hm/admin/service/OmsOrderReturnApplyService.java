package top.heyqing.hm.admin.service;

import top.heyqing.hm.admin.dto.OmsOrderReturnApplyResult;
import top.heyqing.hm.admin.dto.OmsReturnApplyQueryParam;
import top.heyqing.hm.admin.dto.OmsUpdateStatusParam;
import top.heyqing.hm.mbg.model.OmsOrderReturnApply;

import java.util.List;

/**
 * ClassName:OmsOrderReturnApplyService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 退货申请管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改指定申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}

