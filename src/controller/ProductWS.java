package controller;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductWS {
	
	public Product find(){
		return new Product("1", "name1", 1000);
	}
	
	public List<Product> findAll(){
		List<Product> results = new ArrayList<Product>();
		results.add(new Product("1", "name1", 1000));
		results.add(new Product("2", "name2", 2000));
		results.add(new Product("3", "name3", 3000));
		return results;
	}

}
