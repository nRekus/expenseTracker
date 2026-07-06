package com.example.introduction;

// import java.util.Map;
// import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.event.ContextRefreshedEvent;
// import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
// import org.springframework.context.event.EventListener;
// import org.springframework.web.method.HandlerMethod;
// import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
// import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication()//(exclude = {DataSourceAutoConfiguration.class})
public class IntroductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
	}

	// @EventListener
	// public void handleContextRefresh(ContextRefreshedEvent event) {
    // ApplicationContext applicationContext = event.getApplicationContext();
    // RequestMappingHandlerMapping requestMappingHandlerMapping = applicationContext
    //     .getBean("requestMappingHandlerMapping", RequestMappingHandlerMapping.class);
    // Map<RequestMappingInfo, HandlerMethod> map = requestMappingHandlerMapping
    //     .getHandlerMethods();
    // 	map.forEach((key, value) -> Logger.getGlobal().info(key.toString()));
	// }

}
