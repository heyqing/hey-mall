package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.UmsResourceCategory;

import java.util.List;

/**
 * ClassName:UmsResourceCategoryService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 后台资源分类管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface UmsResourceCategoryService {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);
}
