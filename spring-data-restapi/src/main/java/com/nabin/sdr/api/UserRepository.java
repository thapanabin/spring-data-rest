package com.nabin.sdr.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users",path = "users")//for making the path users before it is loca.../ApplicationUser
public interface UserRepository extends PagingAndSortingRepository<ApplicationUser, Integer> {
	//for finding based on email
	public ApplicationUser findByEmail(@Param("email") String email);
	//for testing url http://localhost:9090/users/search/findByEmail?email=u@gmail.com
}
