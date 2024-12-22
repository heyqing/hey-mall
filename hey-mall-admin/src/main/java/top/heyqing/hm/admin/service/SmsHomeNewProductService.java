package top.heyqing.hm.admin.service;

import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.mbg.model.SmsHomeNewProduct;

import java.util.List;

/**
 * ClassName:SmsHomeNewProductService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 首页新品推荐管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsHomeNewProductService {
    /**
     * 添加首页推荐
     */
    @Transactional
    int create(List<SmsHomeNewProduct> homeNewProductList);

    /**
     * 修改推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除推荐
     */
    int delete(List<Long> ids);

    /**
     * 批量更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询推荐
     */
    List<SmsHomeNewProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
