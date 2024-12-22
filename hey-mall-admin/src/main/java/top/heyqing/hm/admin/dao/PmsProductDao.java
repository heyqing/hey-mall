package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.admin.dto.PmsProductResult;

/**
 * ClassName:PmsProductDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
