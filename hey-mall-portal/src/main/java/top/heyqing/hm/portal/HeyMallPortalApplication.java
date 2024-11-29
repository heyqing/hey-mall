package top.heyqing.hm.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.heyqing.hm.portal.config.LogoConfig;

/**
 * ClassName:HeyMallPortalApplication
 * Package:top.heyqing.hm.portal
 * Description:
 *
 * @Date:2024/11/29
 * @Author:Heyqing
 */
@SpringBootApplication(scanBasePackages = "top.heyqing.hm")
public class HeyMallPortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeyMallPortalApplication.class, args);
        LogoConfig.logo();
    }
}
