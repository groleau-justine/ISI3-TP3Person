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
import persons.TestAbstPerson;

/**
 *
 * @author Epulapp
 */
public class TestAnotherPerson extends TestAbstPerson{
      
    public TestAnotherPerson() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() {
        super.setUp();
        person = new AnotherPerson("Toto", "LastNameToto", 1994, 07, 27);
    }
    
    @After
    @Override
    public void tearDown() {
        
    }
}
