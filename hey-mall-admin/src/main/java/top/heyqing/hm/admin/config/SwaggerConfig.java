package top.heyqing.hm.admin.config;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import top.heyqing.hm.common.config.BaseSwaggerConfig;
import top.heyqing.hm.common.domain.SwaggerProperties;

/**
 * ClassName:SwaggerConfig
 * Package:top.heyqing.hm.admin.config
 * Description:
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("top.heyqing.hm.admin.controller")
                .title("hey-mall后台系统")
                .description("hey-mall后台相关接口文档")
                .contactName("heyqing")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }

}
