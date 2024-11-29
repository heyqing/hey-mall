package top.heyqing.hm.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * ClassName:HomeFlashPromotion
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 首页秒杀场次信息封装
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class HomeFlashPromotion {
    @ApiModelProperty("本场开始时间")
    private Date startTime;
    @ApiModelProperty("本场结束时间")
    private Date endTime;
    @ApiModelProperty("下场开始时间")
    private Date nextStartTime;
    @ApiModelProperty("下场结束时间")
    private Date nextEndTime;
    @ApiModelProperty("属于该秒杀活动的商品")
    private List<FlashPromotionProduct> productList;
}
