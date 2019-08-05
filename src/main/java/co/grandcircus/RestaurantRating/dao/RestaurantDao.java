package co.grandcircus.RestaurantRating.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import co.grandcircus.RestaurantRating.entity.Restaurant;


@Repository
@Transactional
public class RestaurantDao {

	@PersistenceContext
	EntityManager em;
		
	public List<Restaurant> findAll(){
		List<Restaurant> restaurants = em.createQuery("FROM Restaurant", Restaurant.class)
		.getResultList();
		return restaurants;
	}
	
//	public List<Restaurant> findAll(){
//		return em.createQuery("FROM Restaurant", Restaurant.class).getResultList();
//	}
	
	//find specific Product with its unique ID
	public void create(Restaurant restaurant) {
		em.persist(restaurant);
	}
	
	public void update(Restaurant restaurant) {
		em.merge(restaurant);
	}
	
	public void delete(Long id) {
		Restaurant restaurant = em.getReference(Restaurant.class, id);
		em.remove(restaurant);
	}
	
	
	
}


