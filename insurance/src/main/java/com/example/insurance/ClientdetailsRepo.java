package com.example.insurance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientdetailsRepo extends JpaRepository<ClientdetailsEntity,Integer>{
	@Query(value = "select * from client where id =1",nativeQuery=true)
	List<ClientdetailsEntity> findalldetails();
	@Query(value = "select * from client where id =2",nativeQuery=true)
	List<ClientdetailsEntity> findalldetails2();

}
