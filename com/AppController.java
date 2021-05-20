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
import com.Menu;
import com.MenuAndCuisine;

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
	
	@Autowired
	UserRepository userRepository;

	
	@PostMapping("/signin")
	public User signIn(@RequestBody User user) {
		User temp = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		return temp;
	}

	@PostMapping("/signup")
	public User signUp(@RequestBody User user) {
		User temp;
		try {
			temp = userRepository.save(user);
			return temp;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
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
	/*@GetMapping("/getMenuItem/{menuId}")
	public Status getMenuItem(@PathVariable Integer menuId) {
		menuRepository.findById(menuId);
		return new Status(true);
	}*/
	@GetMapping("/getMenuItem/{menuId}")
	public List<Menu> getMenuById(@PathVariable Integer menuId) {

//		 System.out.println(repo.findByPlaceContaining("a"));
		List <Menu> foods = new ArrayList<Menu>();
		Iterable<Menu> iterable = menuRepository.findAllByMenuId(menuId);
		for (Menu food : iterable) {
			foods.add(food);
		}
		return foods;
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
	
	@GetMapping("/getCuisineItem/{cuisineName}")
	public List<Cuisine> getCuisineByName(@PathVariable String cuisineName) {

//		 System.out.println(repo.findByPlaceContaining("a"));
		List <Cuisine> foods = new ArrayList<Cuisine>();
		Iterable<Cuisine> iterable = cuisineRepository.findAllByCuisineName(cuisineName);
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
	
	
	
	
	@GetMapping("/menuItems/join")
	public List<MenuAndCuisine> joinCuisineAndMenu()
	{
		Object[][] o =menuRepository.joinCuisineAndMenu();
//		for(int i=0;i< o.length;i++)
//		{
//			System.out.println(o[i].getClass());
//		}
//		List<Object> list =new ArrayList<Object>();
//		for(int i=0;i<o.length;i++)
//		{
//			list.add(o[i]);
//		}
//		return list;
		List<MenuAndCuisine> list = new ArrayList<>();
		for(int i=0;i<o.length;i++)
		{
			list.add(new MenuAndCuisine(((int)o[i][0]),((String)o[i][1]),((double)o[i][2]),((String)o[i][3]),((String)o[i][4]),((int)o[i][5]),((int)o[i][6]),((String)o[i][7])));
		}
		return list;
	}
	
	
	@GetMapping("/menuItems/biryani")
	public List<MenuAndCuisine> findByBiryani()
	{
		Object[][] o =menuRepository.findByBiryani();
//		for(int i=0;i< o.length;i++)
//		{
//			System.out.println(o[i].getClass());
//		}
//		List<Object> list =new ArrayList<Object>();
//		for(int i=0;i<o.length;i++)
//		{
//			list.add(o[i]);
//		}
//		return list;
		List<MenuAndCuisine> list = new ArrayList<>();
		for(int i=0;i<o.length;i++)
		{
			list.add(new MenuAndCuisine(((int)o[i][0]),((String)o[i][1]),((double)o[i][2]),((String)o[i][3]),((String)o[i][4]),((int)o[i][5]),((int)o[i][6]),((String)o[i][7])));
		}
		return list;
	}
	
	
	
	
	
}
