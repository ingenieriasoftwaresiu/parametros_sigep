/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dto.Actividad;
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
public class ActividadDAOImplTest {
    
    public ActividadDAOImplTest() {
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
     * Test of obtenerPorCodigo method, of class ActividadDAOImpl.
     */
    @Test
    public void testObtenerPorCodigo() throws Exception {
        System.out.println("obtenerPorCodigo");
        Integer strIdActividad = 2;
        ActividadDAOImpl instance = new ActividadDAOImpl();
        Actividad result = instance.obtenerPorCodigo(strIdActividad);
        System.out.println("Descripción: " + result.getDescripcion());       
    }

    /**
     * Test of obtenerTodas method, of class ActividadDAOImpl.
     */
    @Test
    public void testObtenerTodas() throws Exception {
        System.out.println("obtenerTodas");
        ActividadDAOImpl instance = new ActividadDAOImpl();
        List<Actividad> result = instance.obtenerTodas();
        System.out.println("Total elementos: " + result.size());
    }
    
}
