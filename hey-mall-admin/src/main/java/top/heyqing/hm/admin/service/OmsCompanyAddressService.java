package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * ClassName:OmsCompanyAddressService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 收货地址管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
