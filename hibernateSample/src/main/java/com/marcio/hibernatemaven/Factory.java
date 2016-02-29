/*
 * Copyright 2016 Marcio Alexandre P. Silva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.marcio.hibernatemaven;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Entity //this is a table in database
@Table( name = "factory" )

public class Factory {
    @Id @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long factory_id;
    @Column
    private String name;
    @Column
    private String address;
    @OneToMany (cascade = {CascadeType.ALL},mappedBy = "factory",
            targetEntity = com.marcio.hibernatemaven.Car.class)
    private List<Car> carList;
    
    public Factory(){ }
    
    public Factory(String name, String address){
        this.name = name;
        this.address = address;
    }

    public Long getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Long factory_id) {
        this.factory_id = factory_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
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
