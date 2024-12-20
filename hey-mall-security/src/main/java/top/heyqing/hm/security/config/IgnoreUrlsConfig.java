package top.heyqing.hm.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:IgnoreUrlsConfig
 * Package:top.heyqing.hm.security.config
 * Description:
 * SpringSecurity白名单资源路径配置
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}
