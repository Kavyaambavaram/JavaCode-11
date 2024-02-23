package com.hibernateCrud;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductUtility {
   private static SessionFactory factory = null;
   
   private static SessionFactory getSessionFactory(){
	   if(factory==null){
		   factory = new Configuration().configure().buildSessionFactory();
	   }
	   return factory;
   }
   
   
   public static String addProduct(Product p){
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   session.save(p);
	   session.getTransaction().commit();
	   session.close();
	   return "Product added successfully";
   }
   
   
   public static List<Product> getProducts(){
	   Session session = getSessionFactory().openSession();
	   @SuppressWarnings({ "unchecked", "deprecation" })
	   Query<Product> query = session.createQuery("from Product");
	   List<Product> productList = query.list();
	   session.close();
	   return productList;
	   
   }
   
   public static Product getByid(int id){
	   Session session = getSessionFactory().openSession();
	   Product product = session.get(Product.class, id);
	   return product;
	   
   }
   
   public static Product updateProduct(int id,Product newProduct){
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   Product savedProduct = session.get(Product.class, id);
	   if(savedProduct!=null){
		   savedProduct.setProductName(newProduct.getProductName());
		   savedProduct.setCategoryName(newProduct.getCategoryName());
		   savedProduct.setProductPrice(newProduct.getProductPrice());
		   session.save(savedProduct);
		   session.getTransaction().commit();
	   }
	   return savedProduct;
   }
   
   
   public static String deleteProduct(int productId){
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   Product savedProduct = session.get(Product.class, productId);
	   if(savedProduct!=null){
		   session.remove(savedProduct);
		   session.getTransaction().commit();
		   return "Product deleted successfully";
	   }
	   return "Product not found";
   }
   
   
}
