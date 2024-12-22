package top.heyqing.hm.admin.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heyqing.hm.admin.service.CmsSubjectService;
import top.heyqing.hm.mbg.mapper.CmsSubjectMapper;
import top.heyqing.hm.mbg.model.CmsSubject;
import top.heyqing.hm.mbg.model.CmsSubjectExample;

import java.util.List;

/**
 * ClassName:CmsSubjectServiceImpl
 * Package:top.heyqing.hm.admin.service.impl
 * Description:
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper subjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        return subjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if (!StrUtil.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
