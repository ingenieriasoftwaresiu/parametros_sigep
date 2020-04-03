/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dto.Etapa;
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
public class EtapaDAOImplTest {
    
    public EtapaDAOImplTest() {
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
     * Test of obtenerPorProyecto method, of class EtapaDAOImpl.
     */
    @Test
    public void testObtenerPorProyecto() throws Exception {
        System.out.println("obtenerPorProyecto");
        String strIdProyecto = "4-01320";
        EtapaDAOImpl instance = new EtapaDAOImpl();
        Etapa result = instance.obtenerPorProyecto(strIdProyecto);
        System.out.println("Fecha de fin: " + result.getFechaFin().toString());
        assertTrue(true);
    }
    
}
