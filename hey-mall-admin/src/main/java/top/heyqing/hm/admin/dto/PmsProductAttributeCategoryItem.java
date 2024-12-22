package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.PmsProductAttribute;
import top.heyqing.hm.mbg.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * ClassName:PmsProductAttributeCategoryItem
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 带有属性的商品属性分类
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}
