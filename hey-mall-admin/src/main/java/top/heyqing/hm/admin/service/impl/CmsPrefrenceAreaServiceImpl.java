package top.heyqing.hm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heyqing.hm.admin.service.CmsPrefrenceAreaService;
import top.heyqing.hm.mbg.mapper.CmsPrefrenceAreaMapper;
import top.heyqing.hm.mbg.model.CmsPrefrenceArea;
import top.heyqing.hm.mbg.model.CmsPrefrenceAreaExample;

import java.util.List;

/**
 * ClassName:CmsPrefrenceAreaServiceImpl
 * Package:top.heyqing.hm.admin.service.impl
 * Description:
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
