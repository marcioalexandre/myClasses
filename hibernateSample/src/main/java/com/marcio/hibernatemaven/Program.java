/*
 * Copyright 2016 Marcio Alexandre P. Silva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.marcio.hibernatemaven;

import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 *
 * @author Marcio Alexandre P. da Silva <email: marcio.alexandre83@gmail.com>
 */
public class Program {
    private static SessionFactory factory; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;
        try{
            factory = new AnnotationConfiguration().
                configure().
                addPackage("com.marcio.hibernatemaven"). //add package if used.
                addAnnotatedClass(Car.class).
                addAnnotatedClass(Factory.class).
                buildSessionFactory();
        }catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }
        
        Factory f = new Factory ("Audio","1270 Antonio Andrade st, coroa do meio");
        Car c = new Car("A1","2016",f);
        Car c1 = new Car("A8", "2010", f);
        ArrayList<Car> cList = new ArrayList<>();
        cList.add(c);
        cList.add(c1);
        f.setCarList(cList);
        Program p = new Program();
        p.saveData(f,cList);
    }
    
    public void saveData(Factory f, ArrayList<Car> cList){
      Session session = factory.openSession();
      Transaction tx = null;
      Long factoryID = null;
      ArrayList<Integer> carID = new ArrayList<>();
      Boolean result = false;
      try{
         tx = session.beginTransaction();
         factoryID = (Long) session.save(f); 
         System.out.println("Factory ID: "+factoryID);
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
      if (factoryID != null){
          for (Car c: cList){
              try{
                  tx = session.beginTransaction();
                  Integer id = (Integer) session.save(c);
                  carID.add(id); 
                  System.out.println("Car ID: "+id);
                  tx.commit();
              }catch (HibernateException e) {
                  if (tx!=null) tx.rollback();
                  e.printStackTrace(); 
              }
          }
      }
    }
    
}
