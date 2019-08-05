package co.grandcircus.RestaurantRating.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Restaurants")
public class Restaurant {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name;
	String description;
	Double price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Restaurant(Long id, String name, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Restaurant() {
		super();
	}
	
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	

	
	
	
	
}
