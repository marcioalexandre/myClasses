/*
 * Copyright 2016 Marcio Alexandre P. Silva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.marcio.hibernatemaven;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcio Alexandre P. da Silva <email: marcio.alexandre83@gmail.com>
 */
public class CarTest {
    
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCar_id method, of class Car.
     */
    @Test
    public void testGetCar_id() {
        System.out.println("getCar_id");
        Car instance = new Car();
        Integer expResult = null;
        Integer result = instance.getCar_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCar_id method, of class Car.
     */
    @Test
    public void testSetCar_id() {
        System.out.println("setCar_id");
        Integer car_id = null;
        Car instance = new Car();
        instance.setCar_id(car_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Car instance = new Car();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Car.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Car.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        String year = "";
        Car instance = new Car();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactory method, of class Car.
     */
    @Test
    public void testGetFactory() {
        System.out.println("getFactory");
        Car instance = new Car();
        Factory expResult = null;
        Factory result = instance.getFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFactory method, of class Car.
     */
    @Test
    public void testSetFactory() {
        System.out.println("setFactory");
        Factory factory = null;
        Car instance = new Car();
        instance.setFactory(factory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Car.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        SessionFactory factory = null;
        Car instance = new Car();
        instance.save(factory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
