package top.heyqing.hm.portal.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.SmsCoupon;
import top.heyqing.hm.portal.domain.SmsCouponHistoryDetail;

import java.util.List;

/**
 * ClassName:SmsCouponHistoryDao
 * Package:top.heyqing.hm.portal.dao
 * Description:
 * 会员优惠券领取记录管理自定义Dao
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
public interface SmsCouponHistoryDao {
    /**
     * 获取优惠券历史详情
     */
    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);

    /**
     * 获取指定会员优惠券列表
     */
    List<SmsCoupon> getCouponList(@Param("memberId") Long memberId, @Param("useStatus") Integer useStatus);
}
