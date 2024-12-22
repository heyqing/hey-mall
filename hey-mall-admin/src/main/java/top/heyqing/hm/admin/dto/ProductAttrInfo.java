package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName:ProductAttrInfo
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 商品分类对应属性信息
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Data
@EqualsAndHashCode
public class ProductAttrInfo {
    @ApiModelProperty("商品属性ID")
    private Long attributeId;
    @ApiModelProperty("商品属性分类ID")
    private Long attributeCategoryId;
}
