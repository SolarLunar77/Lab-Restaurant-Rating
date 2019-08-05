package co.grandcircus.RestaurantRating.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurants")
public class Restaurant {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name;
	Double rating;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Restaurant(Long id, String name, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	public Restaurant() {
		super();
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
	
	
//	public void setId(Long id) {
//		this.id = id;
//	}
	
	
	
	
	
	
}

