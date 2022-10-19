package com.example.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TruckRepo extends CrudRepository<TruckEntity,Integer> {
	@Query(value = "select * from truck where nooftyres in(select nooftyres from car1);",nativeQuery = true)
	List<TruckEntity> findallsamenooftyres();
}
