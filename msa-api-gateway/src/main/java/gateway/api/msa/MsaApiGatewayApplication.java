package gateway.api.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication(proxyBeanMethods = false)
public class MsaApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaApiGatewayApplication.class, args);
    }

}