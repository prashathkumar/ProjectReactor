package com.projectreactor.webflux.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.projectreactor.webflux.handler.EmployeeHandler;

@Configuration
public class EmployeeRouter {
	
	@Autowired
	EmployeeHandler employeeHandler;
	
	@Bean
	public RouterFunction<ServerResponse> routerFunction(){
		return RouterFunctions.route()
				.GET("/router/EmployeeDetails",employeeHandler::employeeDetails)
				.build();
		
	}

}
