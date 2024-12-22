package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.OmsOrderOperateHistory;

import java.util.List;

/**
 * ClassName:OmsOrderOperateHistoryDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 订单操作记录自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface OmsOrderOperateHistoryDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
