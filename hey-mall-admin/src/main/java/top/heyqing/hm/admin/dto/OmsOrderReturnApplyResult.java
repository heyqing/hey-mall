package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.OmsCompanyAddress;
import top.heyqing.hm.mbg.model.OmsOrderReturnApply;

/**
 * ClassName:OmsOrderReturnApplyResult
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 申请信息封装
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
