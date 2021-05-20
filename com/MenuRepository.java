package com;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

	Iterable<Menu> findAllByMenuId(Integer menuId);
	
    @Query(value="select m.menu_id,menu_name,menu_price,menu_image,menu_status,m.restaurant_id,m.cuisine_id,cuisine.cuisine_name from menu m join cuisine  on m.cuisine_id= cuisine.cuisine_id",nativeQuery = true)
	
			//List<Menu...rep> findByBiryani(@Param("biryani")  ;
	Object[][] joinCuisineAndMenu(); 
	@Query(value="select m.menu_id,menu_name,menu_price,menu_image,menu_status,m.restaurant_id,m.cuisine_id,cuisine.cuisine_name from menu m join cuisine  on m.cuisine_id= cuisine.cuisine_id where m.menu_name like  '%Biryani%'", nativeQuery=true)
	Object[][] findByBiryani(); 
	

	
	

}
