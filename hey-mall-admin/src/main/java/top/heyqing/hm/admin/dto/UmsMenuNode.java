package top.heyqing.hm.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.heyqing.hm.mbg.model.UmsMenu;

import java.util.List;

/**
 * ClassName:UmsMenuNode
 * Package:top.heyqing.hm.admin.dto
 * Description:
 * 后台菜单节点封装
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Getter
@Setter
public class UmsMenuNode extends UmsMenu {
    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;
}