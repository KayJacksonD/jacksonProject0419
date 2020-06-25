package com.itheima.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName TokenFilter
 * @Description 判断用户是否登录
 * GlobalFilter：全局过滤器的接口
 * Ordered：指定过滤的执行顺序，值越小，优先级越高
 **/
//@Component
public class TokenFilter implements GlobalFilter, Ordered {

    /**
     * @param exchange 包含了请求与响应
     * @param chain    过滤链
     **/
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 登录：url?token=xxx
        // 判断用户是否登录
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if ("Welcome_To_Jackson_Service".equals(token)) {
            // 没有登录
            System.out.println("token is empty, please login...");
            // 不能放行
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);  // 设置响应的状态码
            return exchange.getResponse().setComplete();    // 不放行
        }
        // 登录，放行
        return chain.filter(exchange);
    }

    /**
     * @param
     * @return int
     * @author 栗子
     * @Description 指定过滤器的执行顺序
     * @Date 11:21 2019/10/8
     **/
    @Override
    public int getOrder() {
        return 0;
    }
}
