package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.PmsProductLadder;

import java.util.List;

/**
 * ClassName:PmsProductLadderDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 会员阶梯价格自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductLadderDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
