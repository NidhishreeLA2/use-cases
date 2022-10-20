package com.example.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ManagerRepo extends JpaRepository<ManagerEntity,Integer> {
	@Query(value = "  select * from manager m join employee e where m.location = 'Bangalore' and e.location = 'Bangalore'",nativeQuery = true)
	List<ManagerEntity> findlocation();

}
