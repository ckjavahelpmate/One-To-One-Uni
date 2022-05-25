package com.ty.uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.uni.dto.Address;
import com.ty.uni.dto.Branch;

public class TestSaveBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Address address = new Address() ;
		address.setStreet("mount joy road");
		address.setArea("Basavanagudi");
		
		Branch branch = new Branch() ;
		branch.setName("QSP");
		branch.setState("Karnataka");
		branch.setCountry("Country");
		branch.setAddress(address);
		
		entityTransaction.begin();
		
		entityManager.persist(branch);
		entityManager.persist(address);
		
		entityTransaction.commit();
		

	}

}
