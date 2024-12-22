package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.CmsSubjectProductRelation;

import java.util.List;

/**
 * ClassName:CmsSubjectProductRelationDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 商品和专题关系自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface CmsSubjectProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
