package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.SmsCoupon;
import top.heyqing.hm.mbg.model.SmsCouponProductCategoryRelation;
import top.heyqing.hm.mbg.model.SmsCouponProductRelation;

import java.util.List;

/**
 * ClassName:SmsCouponParam
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 优惠券信息封装，包括绑定商品和分类
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class SmsCouponParam extends SmsCoupon {
    @Getter
    @Setter
    @ApiModelProperty("优惠券绑定的商品")
    private List<SmsCouponProductRelation> productRelationList;
    @Getter
    @Setter
    @ApiModelProperty("优惠券绑定的商品分类")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}