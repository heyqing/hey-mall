package top.heyqing.hm.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.heyqing.hm.admin.config.LogoConfig;

/**
 * ClassName:AdminApplication
 * Package:top.heyqing.hm.admin
 * Description:
 *
 * @Date:2024/12/20
 * @Author:Heyqing
 */
@SpringBootApplication
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        LogoConfig.logo();
    }
}
