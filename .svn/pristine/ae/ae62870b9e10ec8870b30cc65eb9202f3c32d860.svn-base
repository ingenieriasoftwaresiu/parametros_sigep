/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dto.Persona;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorge.correa
 */
public class PersonaDAOImplTest {
    
    public PersonaDAOImplTest() {
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
     * Test of obtenerPorNivel method, of class PersonaDAOImpl.
     */
    @Test
    public void testObtenerPorNivel() throws Exception {
        System.out.println("obtenerPorNivel");
        Integer intNivel = 2;
        PersonaDAOImpl instance = new PersonaDAOImpl();
        List<Persona> result = instance.obtenerPorNivel(intNivel);
        for (Persona persona : result){
            System.out.println("Nombre: " + persona.getNombre());
        }
        assertTrue(true);
    }

    /**
     * Test of obtenerUna method, of class PersonaDAOImpl.
     */
    @Test
    public void testObtenerUna() throws Exception {
        System.out.println("obtenerUna");
        String strIdPersona = "8103401";
        PersonaDAOImpl instance = new PersonaDAOImpl();
        Persona result = instance.obtenerUna(strIdPersona);
        System.out.println("Nombre: " + result.getNombre());
        assertTrue(true);
    }
    
}
