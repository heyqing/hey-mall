package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.PmsProductAttributeValue;

import java.util.List;

/**
 * ClassName:PmsProductAttributeValueDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品属性值管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductAttributeValueDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}