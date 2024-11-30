package top.heyqing.hm.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ClassName:MyBatisConfig
 * Package:top.heyqing.hm.portal.config
 * Description:
 * MyBatis相关配置
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"top.heyqing.hm.mapper", "top.heyqing.hm.portal.dao"})
public class MyBatisConfig {
}
