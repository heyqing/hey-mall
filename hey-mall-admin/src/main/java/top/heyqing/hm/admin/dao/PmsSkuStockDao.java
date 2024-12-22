package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.PmsSkuStock;

import java.util.List;

/**
 * ClassName:PmsSkuStockDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品SKU管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsSkuStockDao {
    /**
     * 批量插入操作
     */
    int insertList(@Param("list") List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替换操作
     */
    int replaceList(@Param("list") List<PmsSkuStock> skuStockList);
}