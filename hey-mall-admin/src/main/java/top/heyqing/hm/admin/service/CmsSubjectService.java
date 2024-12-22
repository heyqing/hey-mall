package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.CmsSubject;

import java.util.List;

/**
 * ClassName:CmsSubjectService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 商品专题管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
