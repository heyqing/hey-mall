package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.admin.dto.OmsOrderReturnApplyResult;
import top.heyqing.hm.admin.dto.OmsReturnApplyQueryParam;
import top.heyqing.hm.mbg.model.OmsOrderReturnApply;

import java.util.List;

/**
 * ClassName:OmsOrderReturnApplyDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 订单退货申请管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id") Long id);
}
