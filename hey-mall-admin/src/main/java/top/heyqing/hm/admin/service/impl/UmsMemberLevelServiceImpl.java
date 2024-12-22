package top.heyqing.hm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heyqing.hm.admin.service.UmsMemberLevelService;
import top.heyqing.hm.mbg.mapper.UmsMemberLevelMapper;
import top.heyqing.hm.mbg.model.UmsMemberLevel;
import top.heyqing.hm.mbg.model.UmsMemberLevelExample;

import java.util.List;

/**
 * ClassName:UmsMemberLevelServiceImpl
 * Package:top.heyqing.hm.admin.service.impl
 * Description:
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;

    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}

