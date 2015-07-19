package com.bplow.netconn.newcms.intercaptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.bplow.netconn.newcms.annotation.AccessRequired;

public class RequestStatisIntercaptor extends HandlerInterceptorAdapter{
	
	Logger log = LoggerFactory.getLogger(RequestStatisIntercaptor.class);

	public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
		log.info("用户权限判读：@AccessRequired");
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        AccessRequired annotation = method.getAnnotation(AccessRequired.class);
        if (annotation != null) {
           log.info("你遇到了：@AccessRequired");
           String accessToken = request.getParameter("access_token");
            /**
             * Do something
             */
            response.getWriter().write("没有通过拦截，accessToken的值为：" + accessToken);
        }
        // 没有注解通过拦截
        return true;
    }
	
	
}
