/*
 * Copyright 2016 Marcio Alexandre P. Silva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.marcio.hibernatemaven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.GenericGenerator;



/**
 *
 * @author Marcio Alexandre P. da Silva <email: marcio.alexandre83@gmail.com>
 */
@Entity
@Table( name = "car" )
public class Car {
    @Id 
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Integer car_id;
    
    @Column    
    private String name;
    
    @Column 
    private String year;
    
    @ManyToOne(targetEntity = com.marcio.hibernatemaven.Factory.class)
    @JoinColumn(name = "factory_id", nullable=false)
    private Factory factory;
    
    public Car(){}
    
    public Car(String name,String year, Factory factory){
        this.name = name;
        this.year = year;
        this.factory = factory;
    }

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }


    
    public void save(SessionFactory factory){

      Session session = factory.openSession();
      Transaction tx = null;
      Long id = null;
      try{
         tx = session.beginTransaction();
         id = (Long) session.save(this); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      System.out.println("***********************");
      System.out.println(id);
    }
}

