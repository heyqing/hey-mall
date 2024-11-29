package top.heyqing.hm.portal.domain;

import lombok.Getter;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;
import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.mbg.model.PmsProductAttribute;
import top.heyqing.hm.mbg.model.PmsSkuStock;

import java.util.List;

/**
 * ClassName:CartProduct
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 购物车中带规格和SKU的商品信息
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class CartProduct extends PmsProduct {
    @ApiModelProperty("商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("商品SKU库存列表")
    private List<PmsSkuStock> skuStockList;
}
