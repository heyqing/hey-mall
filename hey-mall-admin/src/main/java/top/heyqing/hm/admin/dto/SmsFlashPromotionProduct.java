package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.mbg.model.SmsFlashPromotionProductRelation;

/**
 * ClassName:SmsFlashPromotionProduct
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 限时购商品信息封装
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    @ApiModelProperty("关联商品")
    private PmsProduct product;
}

