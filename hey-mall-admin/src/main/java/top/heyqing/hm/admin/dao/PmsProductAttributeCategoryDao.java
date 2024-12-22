package top.heyqing.hm.admin.dao;

import top.heyqing.hm.admin.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * ClassName:PmsProductAttributeCategoryDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品属性分类管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
