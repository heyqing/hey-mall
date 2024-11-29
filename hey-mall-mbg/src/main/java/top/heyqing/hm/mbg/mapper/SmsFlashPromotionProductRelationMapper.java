package top.heyqing.hm.mbg.mapper;


import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.SmsFlashPromotionProductRelation;
import top.heyqing.hm.mbg.model.SmsFlashPromotionProductRelationExample;

import java.util.List;

public interface SmsFlashPromotionProductRelationMapper {
    long countByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    int insertSelective(SmsFlashPromotionProductRelation record);

    List<SmsFlashPromotionProductRelation> selectByExample(SmsFlashPromotionProductRelationExample example);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionProductRelation record, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByExample(@Param("record") SmsFlashPromotionProductRelation record, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);
}