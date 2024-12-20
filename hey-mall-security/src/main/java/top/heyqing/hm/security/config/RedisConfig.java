package top.heyqing.hm.security.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import top.heyqing.hm.common.config.BaseRedisConfig;

/**
 * ClassName:RedisConfig
 * Package:top.heyqing.hm.security.config
 * Description:
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}
