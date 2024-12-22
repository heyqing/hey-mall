package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.admin.dto.ProductAttrInfo;

import java.util.List;

/**
 * ClassName:PmsProductAttributeDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品属性管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductAttributeDao {
    /**
     * 获取商品属性信息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
