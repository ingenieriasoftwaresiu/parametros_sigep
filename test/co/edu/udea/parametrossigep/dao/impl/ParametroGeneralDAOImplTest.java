/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dto.ParametroGeneral;
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
public class ParametroGeneralDAOImplTest {
    
    public ParametroGeneralDAOImplTest() {
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
     * Test of obtenerParametrosGenerales method, of class ParametroGeneralDAOImpl.
     */
    @Test
    public void testObtenerParametrosGenerales() throws Exception {
        System.out.println("obtenerParametrosGenerales");
        ParametroGeneralDAOImpl instance = new ParametroGeneralDAOImpl();
        ParametroGeneral result = instance.obtenerParametrosGenerales();
        System.out.println("Código: " + result.getCodigo());
        System.out.println("Servidor: " + result.getNombreServidor());
        System.out.println("Puerto: " + result.getNumeroPuerto());
        System.out.println("Usuario: " + result.getUsuarioConexion());
        System.out.println("Clave: " + result.getClaveConexion());
        assertTrue(true);
    }
    
}
