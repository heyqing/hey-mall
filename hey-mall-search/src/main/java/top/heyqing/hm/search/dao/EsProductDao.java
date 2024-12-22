package top.heyqing.hm.search.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.search.domain.EsProduct;

import java.util.List;

/**
 * ClassName:EsProductDao
 * Package:top.heyqing.hm.search.dao
 * Description:
 * 搜索商品管理自定义Dao
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
public interface EsProductDao {
    /**
     * 获取指定ID的搜索商品
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
