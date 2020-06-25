package com.itheima.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ForbiddenGatewayFilterFactory
 * @Description 自定义局部过滤器
 **/
//@Component
public class ForbiddenGatewayFilterFactory extends AbstractGatewayFilterFactory<ForbiddenGatewayFilterFactory.Config> {

    public ForbiddenGatewayFilterFactory() {
        super(Config.class);
    }

    /**
     * @author 栗子
     * @Description 指定属性加载的优先级
     **/

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("forbidden");
    }

    /**
     * @author 栗子
     * @Description 处理的业务规则
     * @Date 11:39 2019/10/8
     * @param config
     * @return org.springframework.cloud.gateway.filter.GatewayFilter
     **/
    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            // 获取请求的ip地址
            String ip = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
            System.out.println("ip:" + ip);
            if (ip.equals(config.getForbidden())){
                // 同一个网段，放行
                return chain.filter(exchange);
            }
            // 不是同一个网段，不放行
            exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN); // 403
            return exchange.getResponse().setComplete();
        };
    }

    public static class Config {
        //Put the configuration properties for your filter here
        private String forbidden;   // 属性：在yml文件中配置的ip地址

        public String getForbidden() {
            return forbidden;
        }

        public void setForbidden(String forbidden) {
            this.forbidden = forbidden;
        }
    }

}
