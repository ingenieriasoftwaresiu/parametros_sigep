/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dto.Proyecto;
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
public class ProyectoDAOImplTest {
    
    public ProyectoDAOImplTest() {
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
     * Test of obtenerTodos method, of class ProyectoDAOImpl.
     */
    @Test
    public void testObtenerTodos() throws Exception {
        System.out.println("obtenerTodos");
        ProyectoDAOImpl instance = new ProyectoDAOImpl();
        List<Proyecto> result = instance.obtenerTodos();
        System.out.println("Total proyectos recuperados: " + result.size());
        assertTrue(true);
    }

    /**
     * Test of obtenerUno method, of class ProyectoDAOImpl.
     */
    @Test
    public void testObtenerUno() throws Exception {
        System.out.println("obtenerUno");
        String strCodigo = "4-311084";
        ProyectoDAOImpl instance = new ProyectoDAOImpl();
        Proyecto result = instance.obtenerUno(strCodigo);
        System.out.println("Nombre: " + result.getNombre());
        System.out.println("Estado: " + result.getEstado());
        System.out.println("Descripción: " + result.getDescripcion());
        assertTrue(true);
    }
    
}
