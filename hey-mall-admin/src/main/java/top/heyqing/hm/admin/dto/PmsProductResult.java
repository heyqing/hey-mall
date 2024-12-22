package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:PmsProductResult
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 查询单个商品修改后返回的结果
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public class PmsProductResult extends PmsProductParam {
    @Getter
    @Setter
    @ApiModelProperty("商品所选分类的父id")
    private Long cateParentId;
}
