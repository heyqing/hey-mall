package top.heyqing.hm.search.service;

import org.springframework.data.domain.Page;
import top.heyqing.hm.search.domain.EsProduct;
import top.heyqing.hm.search.domain.EsProductRelatedInfo;

import java.util.List;

/**
 * ClassName:EsProductService
 * Package:top.heyqing.hm.search.service
 * Description:
 * 搜索商品管理Service
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
public interface EsProductService {
    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();

    /**
     * 根据id删除商品
     */
    void delete(Long id);

    /**
     * 根据id创建商品
     */
    EsProduct create(Long id);

    /**
     * 批量删除商品
     */
    void delete(List<Long> ids);

    /**
     * 根据关键字通过名称或副标题查询商品
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 根据关键字通过名称或副标题复合查询商品
     */
    Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 根据商品id推荐相关商品
     */
    Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize);

    /**
     * 搜索关键字相关品牌、分类、属性
     */
    EsProductRelatedInfo searchRelatedInfo(String keyword);
}
