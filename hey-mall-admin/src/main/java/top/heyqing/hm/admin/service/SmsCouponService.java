package top.heyqing.hm.admin.service;

import org.springframework.transaction.annotation.Transactional;
import top.heyqing.hm.admin.dto.SmsCouponParam;
import top.heyqing.hm.mbg.model.SmsCoupon;

import java.util.List;

/**
 * ClassName:SmsCouponService
 * Package:top.heyqing.hm.admin.service
 * Description:
 * 优惠券管理Service
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsCouponService {
    /**
     * 添加优惠券
     */
    @Transactional
    int create(SmsCouponParam couponParam);

    /**
     * 根据优惠券id删除优惠券
     */
    @Transactional
    int delete(Long id);

    /**
     * 根据优惠券id更新优惠券信息
     */
    @Transactional
    int update(Long id, SmsCouponParam couponParam);

    /**
     * 分页获取优惠券列表
     */
    List<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 获取优惠券详情
     * @param id 优惠券表id
     */
    SmsCouponParam getItem(Long id);
}
