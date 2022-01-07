package com.projectreactor.webflux.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.projectreactor.webflux.entity.EmployeeEntity;
import com.projectreactor.webflux.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeHandler {
	
	@Autowired
	EmployeeService employeeService;
	
	public Mono<ServerResponse> employeeDetails(ServerRequest request){
		 Flux<EmployeeEntity> abc = Flux.range(1, 1000000).doOnNext(s->System.out.println(s))
				 .map(s-> new EmployeeEntity(s, "Name"+s)).log();
		return ServerResponse.ok()
				.contentType(MediaType.TEXT_EVENT_STREAM)
				.body(abc,EmployeeEntity.class);
		
		
	}
	
}
