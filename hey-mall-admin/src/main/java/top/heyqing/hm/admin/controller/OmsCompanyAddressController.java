package top.heyqing.hm.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.heyqing.hm.admin.service.OmsCompanyAddressService;
import top.heyqing.hm.common.responce.CommonResult;
import top.heyqing.hm.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * ClassName:OmsCompanyAddressController
 * Package:top.heyqing.hm.admin.controller
 * Description:
 * 收货地址管理Controller
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
@Controller
@Api(tags = "OmsCompanyAddressController")
@Tag(name = "OmsCompanyAddressController", description = "收货地址管理")
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {
    @Autowired
    private OmsCompanyAddressService companyAddressService;

    @ApiOperation("获取所有收货地址")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<OmsCompanyAddress>> list() {
        List<OmsCompanyAddress> companyAddressList = companyAddressService.list();
        return CommonResult.success(companyAddressList);
    }
}
