/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dto.Notificacion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorge.correaj
 */
public class NotificacionDAOImplTest {
    
    public NotificacionDAOImplTest() {
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
     * Test of obtenerUna method, of class NotificacionDAOImpl.
     */
    @Test
    public void testObtenerUna() throws Exception {
        System.out.println("obtenerUna");
        String strCodigo = "NOTIFRESERVAS";
        NotificacionDAOImpl instance = new NotificacionDAOImpl();
        Notificacion result = instance.obtenerUna(strCodigo);
        
        if (result != null){
            System.out.println("Nombre: " + result.getNombre());
        }else{
            fail("The test case is a prototype.");
        }                    
    }
    
}
