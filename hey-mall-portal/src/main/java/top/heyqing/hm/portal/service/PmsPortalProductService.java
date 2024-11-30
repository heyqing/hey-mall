package top.heyqing.hm.portal.service;

import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.portal.domain.PmsPortalProductDetail;
import top.heyqing.hm.portal.domain.PmsProductCategoryNode;

import java.util.List;

/**
 * ClassName:PmsPortalProductService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 前台商品管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface PmsPortalProductService {
    /**
     * 综合搜索商品
     */
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 以树形结构获取所有商品分类
     */
    List<PmsProductCategoryNode> categoryTreeList();

    /**
     * 获取前台商品详情
     */
    PmsPortalProductDetail detail(Long id);
}
