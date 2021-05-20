package com;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MenuAndCuisineRepository extends CrudRepository<Menu, Integer> {
	//@Query(value="select * from menu  where menu_name like '%Biryani%' and join cuisine on m.cuisine_id=cuisine.cuisine_id", nativeQuery=true)
		
	

}
