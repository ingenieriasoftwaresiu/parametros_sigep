/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dto.Movimiento;
import java.util.List;
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
public class MovimientoDAOImplTest {
    
    public MovimientoDAOImplTest() {
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
     * Test of obtenerUno method, of class MovimientoDAOImpl.
     */

    public void testObtenerUno() throws Exception {
        System.out.println("obtenerUno");
        String strCodigo = "275425";
        MovimientoDAOImpl instance = new MovimientoDAOImpl();
        Movimiento result = instance.obtenerUno(strCodigo);
        
       if (result != null){
           System.out.println("Proyecto: " + result.getCodProyecto());
       }else{
           fail("The test case is a prototype.");
       }
        
    }

    /**
     * Test of obtenerMovimientosFechaActualXTipoSoporte method, of class MovimientoDAOImpl.
     */
    @Test
    public void testObtenerMovimientosFechaActualXTipoSoporte() throws Exception {
        System.out.println("obtenerMovimientosFechaActualXTipoSoporte");
        String strTipoMovimiento = "Reserva";
        String strTipoSoporte1 = "Orden de pedido";
        String strTipoSoporte2 = "Importación";
        MovimientoDAOImpl instance = new MovimientoDAOImpl();
        List<Movimiento> result = instance.obtenerMovimientosFechaActualXTipoSoporte(strTipoMovimiento, strTipoSoporte1, strTipoSoporte2);
        
        if (result != null){
            for (Movimiento movimiento : result){
                System.out.println("Código: " + movimiento.getCodigoMov());
            }
        }else{
            fail("The test case is a prototype.");
        }   
    }               
}
