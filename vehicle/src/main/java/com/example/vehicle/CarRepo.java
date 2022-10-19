package com.example.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepo extends JpaRepository<CarEntity,Integer>{
@Query(value = " select * from car1 where nooftyres in(select nooftyres from truck)",nativeQuery = true)
List<CarEntity> findallsamenooftyres();
}
