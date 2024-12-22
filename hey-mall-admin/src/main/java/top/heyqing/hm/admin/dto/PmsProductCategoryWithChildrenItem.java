package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.PmsProductCategory;

import java.util.List;

/**
 * ClassName:PmsProductCategoryWithChildrenItem
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 包含子级分类的商品分类
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    @Getter
    @Setter
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;
}

