package com.example.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BikeRepo extends JpaRepository<BikeEntity,Integer>{
	@Query(value = "select * from Bike b join car1 c on b.nooftyres=c.nooftyres",nativeQuery = true)
	List<BikeEntity> findallsamenooftyres();

}
