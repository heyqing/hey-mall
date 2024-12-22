package top.heyqing.hm.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ClassName:MyBatisConfig
 * Package:top.heyqing.hm.admin.config
 * Description:
 * MyBatis相关配置
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"top.heyqing.hm.mbg.mapper","top.heyqing.hm.admin.dao"})
public class MyBatisConfig {
}

