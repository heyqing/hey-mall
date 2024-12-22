package top.heyqing.hm.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.heyqing.hm.search.config.LogoConfig;

/**
 * ClassName:SearchApplication
 * Package:top.heyqing.hm.search
 * Description:
 *
 * @Date:2024/12/22
 * @Author:Heyqing
 */
@SpringBootApplication(scanBasePackages = "top.heyqing.hm.search")
public class SearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
        LogoConfig.logo();
    }
}
