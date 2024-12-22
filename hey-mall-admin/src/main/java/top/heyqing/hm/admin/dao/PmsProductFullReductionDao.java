package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.PmsProductFullReduction;

import java.util.List;

/**
 * ClassName:PmsProductFullReductionDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品满减自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductFullReductionDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
