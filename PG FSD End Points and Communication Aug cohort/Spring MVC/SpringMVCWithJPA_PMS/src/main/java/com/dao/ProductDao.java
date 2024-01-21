package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int storeProduct(Product product) {
		try {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		manager.persist(product);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Product> findAllProduct() {
		EntityManager manager = emf.createEntityManager();
		Query qry  = manager.createQuery("select p from Product p");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
}
