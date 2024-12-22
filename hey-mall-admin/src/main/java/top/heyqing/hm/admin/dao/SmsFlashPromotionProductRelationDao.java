package top.heyqing.hm.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.admin.dto.SmsFlashPromotionProduct;

import java.util.List;

/**
 * ClassName:SmsFlashPromotionProductRelationDao
 * Package:top.heyqing.hm.admin.dao
 * Description:
 * 限时购商品关系管理自定义Dao
 *
 * @Date:2024/12/21
 * @Author:Heyqing
 */
public interface SmsFlashPromotionProductRelationDao {
    /**
     * 获取限时购及相关商品信息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}

