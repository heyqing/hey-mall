package top.heyqing.hm.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.heyqing.hm.admin.service.OmsCompanyAddressService;
import top.heyqing.hm.mbg.mapper.OmsCompanyAddressMapper;
import top.heyqing.hm.mbg.model.OmsCompanyAddress;
import top.heyqing.hm.mbg.model.OmsCompanyAddressExample;

import java.util.List;

/**
 * ClassName:OmsCompanyAddressServiceImpl
 * Package:top.heyqing.hm.admin.service.impl
 * Description:
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
