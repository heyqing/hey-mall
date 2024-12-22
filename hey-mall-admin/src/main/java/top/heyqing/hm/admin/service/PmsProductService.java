package top.heyqing.hm.admin.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.admin.dto.PmsProductParam;
import top.heyqing.hm.admin.dto.PmsProductQueryParam;
import top.heyqing.hm.admin.dto.PmsProductResult;
import top.heyqing.hm.mbg.model.PmsProduct;

import java.util.List;

/**
 * ClassName:PmsProductService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 商品管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface PmsProductService {
    /**
     * 创建商品
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int create(PmsProductParam productParam);

    /**
     * 根据商品ID获取商品信息（用于更新商品）
     */
    PmsProductResult getUpdateInfo(Long id);

    /**
     * 更新商品
     */
    @Transactional
    int update(Long id, PmsProductParam productParam);

    /**
     * 分页查询商品
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量修改审核状态
     * @param ids 商品ID列表
     * @param verifyStatus 审核状态
     * @param detail 审核详情
     */
    @Transactional
    int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail);

    /**
     * 批量修改商品上架状态
     */
    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    /**
     * 批量修改商品推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 批量修改新品状态
     */
    int updateNewStatus(List<Long> ids, Integer newStatus);

    /**
     * 批量删除商品
     */
    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    /**
     * 根据商品名称或者货号模糊查询
     */
    List<PmsProduct> list(String keyword);
}
