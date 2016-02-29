/*
 * Copyright 2016 Marcio Alexandre P. Silva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package com.marcio.hibernatemaven;

import java.util.List;
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
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of getFactory_id method, of class Factory.
     */
    @Test
    public void testGetFactory_id() {
        System.out.println("getFactory_id");
        Factory instance = new Factory();
        Long expResult = null;
        Long result = instance.getFactory_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFactory_id method, of class Factory.
     */
    @Test
    public void testSetFactory_id() {
        System.out.println("setFactory_id");
        Long factory_id = null;
        Factory instance = new Factory();
        instance.setFactory_id(factory_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Factory.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Factory instance = new Factory();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Factory.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Factory instance = new Factory();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Factory.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Factory instance = new Factory();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Factory.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Factory instance = new Factory();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarList method, of class Factory.
     */
    @Test
    public void testGetCarList() {
        System.out.println("getCarList");
        Factory instance = new Factory();
        List<Car> expResult = null;
        List<Car> result = instance.getCarList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarList method, of class Factory.
     */
    @Test
    public void testSetCarList() {
        System.out.println("setCarList");
        List<Car> carList = null;
        Factory instance = new Factory();
        instance.setCarList(carList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Factory.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        SessionFactory factory = null;
        Factory instance = new Factory();
        instance.save(factory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
