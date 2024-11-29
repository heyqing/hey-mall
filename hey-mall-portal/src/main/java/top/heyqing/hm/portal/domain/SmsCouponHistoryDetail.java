package top.heyqing.hm.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.SmsCoupon;
import top.heyqing.hm.mbg.model.SmsCouponHistory;
import top.heyqing.hm.mbg.model.SmsCouponProductCategoryRelation;
import top.heyqing.hm.mbg.model.SmsCouponProductRelation;

import java.util.List;

/**
 * ClassName:SmsCouponHistoryDetail
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 优惠券领取历史详情（包括优惠券信息和关联关系）
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class SmsCouponHistoryDetail extends SmsCouponHistory {
    @ApiModelProperty("相关优惠券信息")
    private SmsCoupon coupon;
    @ApiModelProperty("优惠券关联商品")
    private List<SmsCouponProductRelation> productRelationList;
    @ApiModelProperty("优惠券关联商品分类")
    private List<SmsCouponProductCategoryRelation> categoryRelationList;
}