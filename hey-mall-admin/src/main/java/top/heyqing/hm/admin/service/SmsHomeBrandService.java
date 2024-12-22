package top.heyqing.hm.admin.service;

import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.mbg.model.SmsHomeBrand;

import java.util.List;

/**
 * ClassName:SmsHomeBrandService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 首页品牌管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsHomeBrandService {
    /**
     * 添加首页品牌推荐
     */
    @Transactional
    int create(List<SmsHomeBrand> homeBrandList);

    /**
     * 修改品牌推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除品牌推荐
     */
    int delete(List<Long> ids);

    /**
     * 批量更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询品牌推荐
     */
    List<SmsHomeBrand> list(String brandName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
