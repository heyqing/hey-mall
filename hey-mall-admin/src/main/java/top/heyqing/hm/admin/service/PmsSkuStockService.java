package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.PmsSkuStock;

import java.util.List;

/**
 * ClassName:PmsSkuStockService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 商品SKU库存管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsSkuStockService {
    /**
     * 根据商品id和skuCode关键字模糊搜索
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
