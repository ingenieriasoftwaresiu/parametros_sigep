/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao;

import co.edu.udea.parametrossigep.dto.Persona;
import co.edu.udea.parametrossigep.exception.GIDaoException;
import java.util.List;

/**
 *
 * @author jorge.correa
 */
public interface PersonaDAO {
    public List<Persona> obtenerPorNivel(Integer intNivel) throws GIDaoException;
    public Persona obtenerUna(String strIdPersona) throws GIDaoException;    
}
