package top.heyqing.hm.portal.service;

import top.heyqing.hm.common.responce.CommonPage;
import top.heyqing.hm.mbg.model.PmsBrand;
import top.heyqing.hm.mbg.model.PmsProduct;

import java.util.List;

/**
 * ClassName:PmsPortalBrandService
 * Package:top.heyqing.hm.portal.service
 * Description:
 * 前台品牌管理Service
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface PmsPortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}

