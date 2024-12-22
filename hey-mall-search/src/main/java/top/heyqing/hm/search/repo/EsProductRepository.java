package top.heyqing.hm.search.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import top.heyqing.hm.search.domain.EsProduct;

/**
 * ClassName:EsProductRepository
 * Package:top.heyqing.hm.search.repo
 * Description:
 * 搜索商品ES操作类
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {
    /**
     * 搜索查询
     *
     * @param name     商品名称
     * @param subTitle 商品标题
     * @param keywords 商品关键字
     * @param page     分页信息
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);

}

