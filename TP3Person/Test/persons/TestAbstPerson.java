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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Epulapp
 */
public abstract class TestAbstPerson {
    protected IPerson person;
    
    public TestAbstPerson() {
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

    @Test
    public void testWasBorn(){       
        boolean test;
        GregorianCalendar dateInfDateNaissance = new GregorianCalendar(1980, 02, 05);
        test = person.wasBorn(dateInfDateNaissance);
        assertFalse(test);
    
        GregorianCalendar dateSupDateNaissance = new GregorianCalendar(2010, 02, 05);
        test = person.wasBorn(dateSupDateNaissance);
        assertTrue(test);
        
        GregorianCalendar dateNaissance = new GregorianCalendar(1994, 07, 27);
        test = person.wasBorn(dateNaissance);
        assertTrue(test); 
    }
    
    @Test
    public void testGetAge(){
        int age;
        
        GregorianCalendar dateInYear = new GregorianCalendar(1994, 9, 30);
        age=person.getAge(dateInYear);
        assertTrue(age==0);
        
        GregorianCalendar dateOk = new GregorianCalendar(1994, 7, 27);
        age=person.getAge(dateOk);
        assertTrue(age==0);
        
        GregorianCalendar dateAfterYear = new GregorianCalendar(2016, 7, 27);
        age=person.getAge(dateAfterYear);
        assertTrue(age==22);  
        
    }
}
