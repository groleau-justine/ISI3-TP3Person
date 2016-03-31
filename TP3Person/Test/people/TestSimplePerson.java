/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persons.TestAbstPerson;

/**
 *
 * @author Epulapp
 */
public class TestSimplePerson extends TestAbstPerson{
    
    public TestSimplePerson() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        super.setUp();
        person = new SimplePerson("Toto", "LastNameToto", 1994, 07, 27);
    }
    
    @After
    public void tearDown() {
    }

}
