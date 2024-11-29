package top.heyqing.hm.portal.domain;

import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.mbg.model.PmsProductFullReduction;
import top.heyqing.hm.mbg.model.PmsProductLadder;
import top.heyqing.hm.mbg.model.PmsSkuStock;

import java.util.List;

/**
 * ClassName:PromotionProduct
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 促销商品信息，包括sku、打折优惠、满减优惠
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class PromotionProduct extends PmsProduct {
    //商品库存信息
    private List<PmsSkuStock> skuStockList;
    //商品打折信息
    private List<PmsProductLadder> productLadderList;
    //商品满减信息
    private List<PmsProductFullReduction> productFullReductionList;
}
