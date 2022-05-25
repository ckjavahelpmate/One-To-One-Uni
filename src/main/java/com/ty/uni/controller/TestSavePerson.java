package com.ty.uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.uni.dto.Pan;
import com.ty.uni.dto.Person;

public class TestSavePerson {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction  entityTransaction = entityManager.getTransaction() ;

		Pan pan = new Pan() ;
		pan.setPanNumber("AQDG456KAM");
		pan.setAddress("bangalore");

		Person person = new Person() ;
		person.setName("Kamala");
		person.setEmail("kamalu@mailcom");
		person.setPhone(78945786);
		person.setPan(pan);


		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
		
		System.out.println("***************** Done **********************");



	}

}
