package com.ty.uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.uni.dto.Company;
import com.ty.uni.dto.Gst;

public class TestSaveCompany {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Company company = new Company() ;
		company.setName("Maruthi");
		company.setPhone(789456);
		company.setWeb("www.maruthi.com");
		
		Gst gst = new Gst() ;
		gst.setGstNumber("GSTMARU123");
		gst.setState("Karnataka");
		gst.setCountry("India");
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
		System.out.println("*************** Done ********************"); 
		

	}

}
