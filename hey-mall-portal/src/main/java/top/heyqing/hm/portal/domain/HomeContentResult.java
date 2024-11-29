package top.heyqing.hm.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.CmsSubject;
import top.heyqing.hm.mbg.model.PmsBrand;
import top.heyqing.hm.mbg.model.PmsProduct;
import top.heyqing.hm.mbg.model.SmsHomeAdvertise;

import java.util.List;

/**
 * ClassName:HomeContentResult
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 首页内容返回信息封装
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class HomeContentResult {
    @ApiModelProperty("轮播广告")
    private List<SmsHomeAdvertise> advertiseList;
    @ApiModelProperty("推荐品牌")
    private List<PmsBrand> brandList;
    @ApiModelProperty("当前秒杀场次")
    private HomeFlashPromotion homeFlashPromotion;
    @ApiModelProperty("新品推荐")
    private List<PmsProduct> newProductList;
    @ApiModelProperty("人气推荐")
    private List<PmsProduct> hotProductList;
    @ApiModelProperty("推荐专题")
    private List<CmsSubject> subjectList;
}