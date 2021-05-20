package com;

import org.springframework.data.repository.CrudRepository;

public interface CuisineRepository extends CrudRepository<Cuisine, Integer> {
	
	
	Iterable<Cuisine> findAllByCuisineName(String cuisineName);

}
