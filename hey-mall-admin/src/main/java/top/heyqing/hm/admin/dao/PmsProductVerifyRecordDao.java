package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.PmsProductVertifyRecord;

import java.util.List;

/**
 * ClassName:PmsProductVerifyRecordDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品审核日志管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductVerifyRecordDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
