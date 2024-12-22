package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.UmsMenu;
import top.heyqing.hm.mbg.model.UmsResource;

import java.util.List;

/**
 * ClassName:UmsRoleDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 后台角色管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);

    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}

