package top.heyqing.hm.admin.service;

import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.admin.dto.PmsBrandParam;
import top.heyqing.hm.mbg.model.PmsBrand;

import java.util.List;

/**
 * ClassName:PmsBrandService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 商品品牌管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsBrandService {
    /**
     * 获取所有品牌
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     */
    int createBrand(PmsBrandParam pmsBrandParam);

    /**
     * 修改品牌
     */
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    /**
     * 删除品牌
     */
    int deleteBrand(Long id);

    /**
     * 批量删除品牌
     */
    int deleteBrand(List<Long> ids);

    /**
     * 分页查询品牌
     */
    List<PmsBrand> listBrand(String keyword, Integer showStatus, int pageNum, int pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand getBrand(Long id);

    /**
     * 修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改厂家制造商状态
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
