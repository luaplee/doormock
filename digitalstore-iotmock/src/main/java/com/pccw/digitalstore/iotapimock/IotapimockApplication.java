package com.pccw.digitalstore.iotapimock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IotapimockApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotapimockApplication.class, args);
		
//        DispatcherServlet dispatcherServlet = (DispatcherServlet)ctx.getBean("dispatcherServlet");
//        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
	}
}
