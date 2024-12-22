package top.heyqing.hm.admin.service;

import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.mbg.model.SmsHomeRecommendSubject;

import java.util.List;

/**
 * ClassName:SmsHomeRecommendSubjectService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 首页专题推荐管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsHomeRecommendSubjectService {
    /**
     * 添加首页推荐
     */
    @Transactional
    int create(List<SmsHomeRecommendSubject> recommendSubjectList);

    /**
     * 修改推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除推荐
     */
    int delete(List<Long> ids);

    /**
     * 批量更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询推荐
     */
    List<SmsHomeRecommendSubject> list(String subjectName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
