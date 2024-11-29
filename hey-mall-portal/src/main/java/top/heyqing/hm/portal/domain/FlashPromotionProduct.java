package top.heyqing.hm.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.PmsProduct;

import java.math.BigDecimal;

/**
 * ClassName:FlashPromotionProduct
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 秒杀信息和商品对象封装
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct {
    @ApiModelProperty("秒杀价格")
    private BigDecimal flashPromotionPrice;
    @ApiModelProperty("用于秒杀到数量")
    private Integer flashPromotionCount;
    @ApiModelProperty("秒杀限购数量")
    private Integer flashPromotionLimit;
}
