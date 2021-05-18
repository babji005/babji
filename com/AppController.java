package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class AppController {
	@Autowired
	MenuRepository menuRepository;
	
	@Autowired
	CuisineRepository cuisineRepository;
	
	@Autowired
	RestaurantRepository restaurantRepository;
	
	
	@PostMapping("/upload")
	public Menu signUp(@RequestBody Menu menu) {
		Menu temp;
		try {
			temp = menuRepository.save(menu);
			return temp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	@GetMapping("/allMenuItem")
	public List<Menu> getMenuItems() {

//		 System.out.println(repo.findByPlaceContaining("a"));
		List <Menu> foods = new ArrayList<Menu>();
		Iterable<Menu> iterable = menuRepository.findAll();
		for (Menu food : iterable) {
			foods.add(food);
		}
		return foods;
	}
	
	@PostMapping("/addMenuItems")
	public Menu addMenuItems(@RequestBody Menu menu)
	{
		try {
		Menu temp=menuRepository.save(menu);
		return temp;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@DeleteMapping("/deleteMenuItem/{menuId}")
	public Status deleteMenuItem(@PathVariable Integer menuId) {
		menuRepository.deleteById(menuId);
		return new Status(true);
	}

	@PutMapping("/editMenuItem")
	public Menu editMenuItem(@RequestBody Menu food) {
		food = menuRepository.save(food);
		return food;
	}

	
	
	@PostMapping("/upload1")
	public Cuisine save(@RequestBody Cuisine cuisine) {
		Cuisine temp;
		try {
			temp = cuisineRepository.save(cuisine);
			return temp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	@GetMapping("/allCuisineItem")
	public List<Cuisine> getCuisineItems() {

//		 System.out.println(repo.findByPlaceContaining("a"));
		List <Cuisine> foods = new ArrayList<Cuisine>();
		Iterable<Cuisine> iterable = cuisineRepository.findAll();
		for (Cuisine food : iterable) {
			foods.add(food);
		}
		return foods;
	}
	
	@PostMapping("/addCuisineItems")
	public Cuisine addCuisineItems(@RequestBody Cuisine cuisine)
	{
		try {
		Cuisine temp=cuisineRepository.save(cuisine);
		return temp;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@DeleteMapping("/deleteCuisineItem/{CuisineId}")
	public Status deleteCuisineItem(@PathVariable Integer cuisineId) {
		cuisineRepository.deleteById(cuisineId);
		return new Status(true);
	}

	@PutMapping("/editCuisineItem")
	public Cuisine editCuisineItem(@RequestBody Cuisine food) {
		food = cuisineRepository.save(food);
		return food;
	}

	
	
	
	@PostMapping("/upload2")
	public Restaurant save(@RequestBody Restaurant restaurant) {
		Restaurant temp;
		try {
			temp = restaurantRepository.save(restaurant);
			return temp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("/allRestaurantItem")
	public List<Restaurant> getRestaurantItems() {

//		 System.out.println(repo.findByPlaceContaining("a"));
		List <Restaurant> foods = new ArrayList<Restaurant>();
		Iterable<Restaurant> iterable = restaurantRepository.findAll();
		for (Restaurant food : iterable) {
			foods.add(food);
		}
		return foods;
	}
	
	@DeleteMapping("/deleteRestautrantItem/{RestaurantId}")
	public Status deleteRestaurantItem(@PathVariable Integer restaurantId) {
		restaurantRepository.deleteById(restaurantId);
		return new Status(true);
	}
	@PutMapping("/editRestaurantItem")
	public Restaurant editRestaurantItem(@RequestBody Restaurant food) {
		food = restaurantRepository.save(food);
		return food;
	}
}
