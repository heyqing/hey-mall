package top.heyqing.hm.admin.dao;

import top.heyqing.hm.admin.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * ClassName:PmsProductCategoryDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品分类自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductCategoryDao {
    /**
     * 获取商品分类及其子分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}