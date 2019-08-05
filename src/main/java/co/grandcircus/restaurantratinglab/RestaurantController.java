package co.grandcircus.restaurantratinglab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.RestaurantRating.dao.RestaurantDao;
import co.grandcircus.RestaurantRating.entity.Restaurant;


@Controller
public class RestaurantController {

@Autowired
private RestaurantDao dao;


@RequestMapping("/")
public ModelAndView list() {
	List<Restaurant> listOfRestaurants = dao.findAll();
	//return new ModelAndView("index", "products", listOfProducts);
	
	//value must match name of JSP
	ModelAndView mav = new ModelAndView("index");
	
	//key(list) - value(List of Products), pair
	mav.addObject("Restaurants", listOfRestaurants);
	return mav;
	}
	




}

