package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.UmsMemberLevel;

import java.util.List;

/**
 * ClassName:UmsMemberLevelService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 会员等级管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员等级
     *
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}