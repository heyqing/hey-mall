package top.heyqing.hm.mbg.mapper;


import org.apache.ibatis.annotations.Param;
import top.heyqing.hm.mbg.model.CmsMemberReport;
import top.heyqing.hm.mbg.model.CmsMemberReportExample;

import java.util.List;

public interface CmsMemberReportMapper {
    long countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}