package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name = "cuisine")
public class Cuisine {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		Integer cuisineId;
		
		String cuisineName;

		public Cuisine() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Cuisine(Integer cuisineId, String cuisineName) {
			super();
			this.cuisineId = cuisineId;
			this.cuisineName = cuisineName;
		}

		public Integer getCuisineId() {
			return cuisineId;
		}

		public void setCuisineId(Integer cuisineId) {
			this.cuisineId = cuisineId;
		}

		public String getCuisineName() {
			return cuisineName;
		}

		public void setCuisineName(String cuisineName) {
			this.cuisineName = cuisineName;
		}

		@Override
		public String toString() {
			return "Cuisine [cuisineId=" + cuisineId + ", cuisineName=" + cuisineName + "]";
		}
		
		
}
