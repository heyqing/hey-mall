package top.heyqing.hm.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:MyBatisConfig
 * Package:top.heyqing.hm.search.config
 * Description:
 * MyBatis相关配置
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
@Configuration
@MapperScan({"top.heyqing.hm.mbg.mapper", "top.heyqing.hm.search.dao"})
public class MyBatisConfig {
}
