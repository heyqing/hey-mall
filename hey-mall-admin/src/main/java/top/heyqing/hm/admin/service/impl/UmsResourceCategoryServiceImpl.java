package top.heyqing.hm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heyqing.hm.admin.service.UmsResourceCategoryService;
import top.heyqing.hm.mbg.mapper.UmsResourceCategoryMapper;
import top.heyqing.hm.mbg.model.UmsResourceCategory;
import top.heyqing.hm.mbg.model.UmsResourceCategoryExample;

import java.util.Date;
import java.util.List;

/**
 * ClassName:UmsResourceCategoryServiceImpl
 * Package:top.heyqing.hm.admin.service.impl
 * Description:
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Service
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Autowired
    private UmsResourceCategoryMapper resourceCategoryMapper;

    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.setOrderByClause("sort desc");
        return resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(new Date());
        return resourceCategoryMapper.insert(umsResourceCategory);
    }

    @Override
    public int update(Long id, UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setId(id);
        return resourceCategoryMapper.updateByPrimaryKeySelective(umsResourceCategory);
    }

    @Override
    public int delete(Long id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }
}
