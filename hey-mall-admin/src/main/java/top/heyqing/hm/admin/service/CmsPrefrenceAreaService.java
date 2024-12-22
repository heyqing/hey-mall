package top.heyqing.hm.admin.service;

import top.heyqing.hm.mbg.model.CmsPrefrenceArea;

import java.util.List;

/**
 * ClassName:CmsPrefrenceAreaService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 优选专区管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
