package top.heyqing.hm.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.*;

import java.util.List;

/**
 * ClassName:PmsPortalProductDetail
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 前台商品详情
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class PmsPortalProductDetail {
    @ApiModelProperty("商品信息")
    private PmsProduct product;
    @ApiModelProperty("商品品牌")
    private PmsBrand brand;
    @ApiModelProperty("商品属性与参数")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("手动录入的商品属性与参数值")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("商品的sku库存信息")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品阶梯价格设置")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("商品满减价格设置")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("商品可用优惠券")
    private List<SmsCoupon> couponList;
}

