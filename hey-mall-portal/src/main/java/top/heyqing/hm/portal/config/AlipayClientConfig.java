package top.heyqing.hm.portal.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:AlipayClientConfig
 * Package:top.heyqing.hm.portal.config
 * Description:
 * 支付宝请求客户端配置
 *
 * @Date:2024/11/30
 * @Author:Heyqing
 */
@Configuration
public class AlipayClientConfig {

    @Bean
    public AlipayClient alipayClient(AlipayConfig config){
        return new DefaultAlipayClient(config.getGatewayUrl(),config.getAppId(),config.getAppPrivateKey(), config.getFormat(),config.getCharset(),config.getAlipayPublicKey(),config.getSignType());
    }
}
