package top.heyqing.hm.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.heyqing.hm.admin.service.UmsMemberLevelService;
import top.heyqing.hm.common.responce.CommonResult;
import top.heyqing.hm.mbg.model.UmsMemberLevel;

import java.util.List;

/**
 * ClassName:UmsMemberLevelController
 * Package:top.heyqing.hm.admin.controller
 * Description:
 * 会员等级管理Controller
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
@Controller
@Api(tags = "UmsMemberLevelController")
@Tag(name = "UmsMemberLevelController", description = "会员等级管理")
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {
    @Autowired
    private UmsMemberLevelService memberLevelService;

    @ApiOperation("查询所有会员等级")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsMemberLevel>> list(@RequestParam("defaultStatus") Integer defaultStatus) {
        List<UmsMemberLevel> memberLevelList = memberLevelService.list(defaultStatus);
        return CommonResult.success(memberLevelList);
    }
}

