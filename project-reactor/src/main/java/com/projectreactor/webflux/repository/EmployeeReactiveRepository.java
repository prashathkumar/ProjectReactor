package com.projectreactor.webflux.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.projectreactor.webflux.entity.EmployeeEntity;

import reactor.core.publisher.Flux;

public interface EmployeeReactiveRepository extends ReactiveCrudRepository<EmployeeEntity, Integer> {
	
	@Query("SELECT * FROM public.\"Employee\" ORDER BY \"Emp_id\" ASC ")
    Flux<EmployeeEntity> findAllEmployee();

}
