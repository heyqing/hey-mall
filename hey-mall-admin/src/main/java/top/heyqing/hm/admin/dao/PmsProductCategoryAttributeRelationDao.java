package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.PmsProductCategoryAttributeRelation;

import java.util.List;

/**
 * ClassName:PmsProductCategoryAttributeRelationDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品分类和属性关系自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductCategoryAttributeRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}

