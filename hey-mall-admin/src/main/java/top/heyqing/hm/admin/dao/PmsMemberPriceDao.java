package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.PmsMemberPrice;

import java.util.List;

/**
 * ClassName:PmsMemberPriceDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 会员价格管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsMemberPriceDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}

