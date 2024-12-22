package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.SmsFlashPromotionSession;

/**
 * ClassName:SmsFlashPromotionSessionDetail
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 包含商品数量的场次信息
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    @ApiModelProperty("商品数量")
    private Long productCount;
}

