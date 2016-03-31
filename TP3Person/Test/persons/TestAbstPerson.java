/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persons;

import java.util.Calendar;
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

    protected GregorianCalendar jourMoisAvantNaissance;
    protected GregorianCalendar moisAvantNaissance;
    protected GregorianCalendar jourApresNaissance;
    protected GregorianCalendar jourAvantNaissance;
    protected GregorianCalendar dateNaissance;
    protected GregorianCalendar jourAvantMoisApresNaissance;
    protected GregorianCalendar moisApresNaissance;
    protected GregorianCalendar jourMoisApresNaissance;
    protected GregorianCalendar jourApresMoisAvantNaissance;
    
    protected GregorianCalendar jourMoisAnneeAvantNaissance;
    protected GregorianCalendar moisAnneeAvantNaissance;
    protected GregorianCalendar jourApresMoisAnneeAvantNaissance;
    protected GregorianCalendar jourAnneeAvantNaissance;
    protected GregorianCalendar anneeAvantNaissance;
    protected GregorianCalendar anneeAvantJourApres;
    protected GregorianCalendar anneeJourAvantMoisApres;
    protected GregorianCalendar anneeAvantMoisApres;
    protected GregorianCalendar anneeAvantJourMoisApres;
    
    protected GregorianCalendar anneeApresMoisJourAvant;
    protected GregorianCalendar anneeApresMoisAvant;
    protected GregorianCalendar anneeJourApresMoisAvant;
    protected GregorianCalendar anneeApresJourAvant;
    protected GregorianCalendar anneeApres;
    protected GregorianCalendar anneeJourApres;
    protected GregorianCalendar anneeMoisApresJourAvant;
    protected GregorianCalendar anneeMoisApres;
    protected GregorianCalendar anneeMoisJourApres;    
      
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
        jourMoisAvantNaissance = new GregorianCalendar(1994, Calendar.JUNE, 26);
        moisAvantNaissance = new GregorianCalendar(1994, Calendar.JUNE, 27);
        jourApresMoisAvantNaissance = new GregorianCalendar(1994, Calendar.JUNE, 28);
        jourAvantNaissance = new GregorianCalendar(1994, Calendar.JULY, 26);
        dateNaissance = new GregorianCalendar(1994, Calendar.JULY, 27);
        jourApresNaissance = new GregorianCalendar(1994, Calendar.JULY, 28);
        jourAvantMoisApresNaissance = new GregorianCalendar(1994, Calendar.AUGUST, 26);
        moisApresNaissance = new GregorianCalendar(1994, Calendar.AUGUST, 27);
        jourMoisApresNaissance = new GregorianCalendar(1994, Calendar.AUGUST, 28);

        jourMoisAnneeAvantNaissance = new GregorianCalendar(1993, Calendar.JUNE, 26);
        moisAnneeAvantNaissance = new GregorianCalendar(1993, Calendar.JUNE, 27);
        jourApresMoisAnneeAvantNaissance = new GregorianCalendar(1993, Calendar.JUNE, 28);
        jourAnneeAvantNaissance = new GregorianCalendar(1993, Calendar.JULY, 26);
        anneeAvantNaissance = new GregorianCalendar(1993, Calendar.JULY, 27);
        anneeAvantJourApres = new GregorianCalendar(1993, Calendar.JULY, 28);
        anneeJourAvantMoisApres = new GregorianCalendar(1993, Calendar.AUGUST, 26);
        anneeAvantMoisApres = new GregorianCalendar(1993, Calendar.AUGUST, 27);
        anneeAvantJourMoisApres = new GregorianCalendar(1993, Calendar.AUGUST, 28);

        anneeApresMoisJourAvant = new GregorianCalendar(1995, Calendar.JUNE, 26);
        anneeApresMoisAvant = new GregorianCalendar(1995, Calendar.JUNE, 27);
        anneeJourApresMoisAvant = new GregorianCalendar(1995, Calendar.JUNE, 28);
        anneeApresJourAvant = new GregorianCalendar(1995, Calendar.JULY, 26);
        anneeApres = new GregorianCalendar(1995, Calendar.JULY, 27);
        anneeJourApres = new GregorianCalendar(1995, Calendar.JULY, 28);
        anneeMoisApresJourAvant = new GregorianCalendar(1995, Calendar.AUGUST, 26);
        anneeMoisApres = new GregorianCalendar(1995, Calendar.AUGUST, 27);
        anneeMoisJourApres = new GregorianCalendar(1995, Calendar.AUGUST, 28);

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testWasBorn() {
        boolean test;

        test = person.wasBorn(jourApresNaissance);
        assertTrue(test);

        test = person.wasBorn(jourMoisApresNaissance);
        assertTrue(test);

        test = person.wasBorn(jourAvantMoisApresNaissance);
        assertTrue(test);

        test = person.wasBorn(moisApresNaissance);
        assertTrue(test);

        test = person.wasBorn(anneeApresMoisJourAvant);
        assertTrue(test);

        test = person.wasBorn(anneeApresMoisAvant);
        assertTrue(test);
        
        test = person.wasBorn(anneeJourApresMoisAvant);
        assertTrue(test);
        
        test = person.wasBorn(anneeApresJourAvant);
        assertTrue(test);
        
        test = person.wasBorn(anneeApres);
        assertTrue(test);
        
        test = person.wasBorn(anneeJourApres);
        assertTrue(test);
        
        test = person.wasBorn(anneeMoisApresJourAvant);
        assertTrue(test);
        
        test = person.wasBorn(anneeMoisApres);
        assertTrue(test);
        
        test = person.wasBorn(anneeMoisJourApres);
        assertTrue(test);
        
        test = person.wasBorn(dateNaissance);
        assertTrue(test);

    }

    @Test
    public void testGetAge() {
        int age;

        age = person.getAge(jourApresNaissance);
        assertTrue(age==0);

        age = person.getAge(jourMoisApresNaissance);
        assertTrue(age==0);

        age = person.getAge(jourAvantMoisApresNaissance);
        assertTrue(age==0);

        age = person.getAge(moisApresNaissance);
        assertTrue(age==0);

        age = person.getAge(anneeApresMoisJourAvant);
        assertTrue(age==0);

        age = person.getAge(anneeApresMoisAvant);
        assertTrue(age==0);
        
        age = person.getAge(anneeJourApresMoisAvant);
        assertTrue(age==0);
        
        age = person.getAge(anneeApresJourAvant);
        assertTrue(age==0);
        
        age = person.getAge(anneeApres);
        assertTrue(age==1);
        
        age = person.getAge(anneeJourApres);
        assertTrue(age==1);
        
        age = person.getAge(anneeMoisApresJourAvant);
        assertTrue(age==1);
        
        age = person.getAge(anneeMoisApres);
        assertTrue(age==1);
        
        age = person.getAge(anneeMoisJourApres);
        assertTrue(age==1);
        
        age = person.getAge(dateNaissance);
        assertTrue(age==0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeJourAvantNaissance() {
        person.getAge(jourAvantNaissance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeJourMoisAvantNaissance() {
        person.getAge(jourMoisAvantNaissance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeJourMoisAnneeAvantNaissance() {
        person.getAge(jourMoisAnneeAvantNaissance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeMoisAvantNaissance() {
        person.getAge(moisAvantNaissance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeMoisAnneeAvantNaissance() {
        person.getAge(moisAnneeAvantNaissance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeAnneeAvantNaissance() {
        person.getAge(anneeAvantNaissance);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeJourAnneeAvantNaissance() {
        person.getAge(jourAnneeAvantNaissance);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeJourApresMoisAvantNaissance() {
        person.getAge(jourApresMoisAvantNaissance);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeJourApresMoisAnneeAvantNaissance() {
        person.getAge(jourApresMoisAnneeAvantNaissance);
    }   
    
    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeAnneeAvantJourApres() {
        person.getAge(anneeAvantJourApres);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeAnneeJourAvantMoisApres() {
        person.getAge(anneeJourAvantMoisApres);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeAnneeAvantMoisApres() {
        person.getAge(anneeAvantMoisApres);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testgetAgeAnneeAvantJourMoisApres() {
        person.getAge(anneeAvantJourMoisApres);
    }
}
