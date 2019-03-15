package org.gw.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @DATA 2019-03-01 15:11
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@Component
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        //pre:可以在请求被路由之前调用，拿到请求，再转发给对应的服务
        //route:在路由请求时候调用，把请求转发给微服务之后的拦截
        //post:在被代理的微服务返回结果后的阶段
        //error:被代理的微服务发生异常的阶段
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //为true代表拦截器启动
        return true;
    }

    @Override
    public Object run() {
        //拦截后干嘛
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            //设置成false后，请求的转发就会结束
            ctx.setSendZuulResponse(false);
            //返回给客户一个状态码，401表示身份验证失败，或者没有权限
            ctx.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
