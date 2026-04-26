package com.unir.orders.model.pojo;

import lombok.Data;

@Data
public class Product {
	private Long id;
	private String name;
	private String country;
	private String description;
	private Boolean visible;
}

