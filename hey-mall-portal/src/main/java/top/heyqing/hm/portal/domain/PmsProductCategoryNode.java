package top.heyqing.hm.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.PmsProductCategory;

import java.util.List;

/**
 * ClassName:PmsProductCategoryNode
 * Package:top.heyqing.hm.portal.domain
 * Description:
 * 包含子分类的商品分类
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@Getter
@Setter
public class PmsProductCategoryNode extends PmsProductCategory {
    @ApiModelProperty("子分类集合")
    private List<PmsProductCategoryNode> children;
}
