package top.heyqing.hm.search.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import top.heyqing.hm.common.config.BaseSwaggerConfig;
import top.heyqing.hm.common.domain.SwaggerProperties;

/**
 * ClassName:SwaggerConfig
 * Package:top.heyqing.hm.search.config
 * Description:
 * Swagger API文档相关配置
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("top.heyqing.hm.search.controller")
                .title("hey-mall搜索系统")
                .description("hey-mall搜索相关接口文档")
                .contactName("heyqing")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }
}

