/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persons;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


/**
 *
 * @author Epulapp
 */
public class TestPerson extends TestAbstPerson {
   
    
    public TestPerson() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        person = new Person("Toto", "LastNameToto", 1994, 07, 27);
    }
    
    @After
    public void tearDown() {
    }
   
   
}