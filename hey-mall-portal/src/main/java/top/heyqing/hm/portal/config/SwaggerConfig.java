package top.heyqing.hm.portal.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import top.heyqing.hm.common.config.BaseSwaggerConfig;
import top.heyqing.hm.common.domain.SwaggerProperties;

/**
 * ClassName:SwaggerConfig
 * Package:top.heyqing.hm.portal.config
 * Description:
 * Swagger相关配置
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("top.heyqing.hm.portal.controller")
                .title("Hey-Mall前台系统")
                .description("Hey-Mall前台相关接口文档")
                .contactName("Heyqing")
                .version("v1.0.0")
                .enableSecurity(true)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }
}
