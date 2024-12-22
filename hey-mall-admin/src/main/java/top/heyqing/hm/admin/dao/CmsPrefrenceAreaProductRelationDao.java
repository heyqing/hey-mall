package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.CmsPrefrenceAreaProductRelation;

import java.util.List;

/**
 * ClassName:CmsPrefrenceAreaProductRelationDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 优选和商品关系自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface CmsPrefrenceAreaProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);
}

