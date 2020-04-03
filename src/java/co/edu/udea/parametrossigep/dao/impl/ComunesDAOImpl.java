/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dao.ComunesDAO;
import co.edu.udea.parametrossigep.dao.GrupoDAO;
import co.edu.udea.parametrossigep.dao.GrupoProyectoDAO;
import co.edu.udea.parametrossigep.dao.ParticipanteDAO;
import co.edu.udea.parametrossigep.dao.PersonaDAO;
import co.edu.udea.parametrossigep.dao.cnf.JDBCConnectionPool;
import co.edu.udea.parametrossigep.dto.Grupo;
import co.edu.udea.parametrossigep.dto.GrupoProyecto;
import co.edu.udea.parametrossigep.dto.Participante;
import co.edu.udea.parametrossigep.dto.Persona;
import co.edu.udea.parametrossigep.exception.GIDaoException;

/**
 *
 * @author jorge.correa
 */
public class ComunesDAOImpl extends JDBCConnectionPool implements ComunesDAO{

    @Override
    public Persona obtenerParticipanteProyecto(String strIdProyecto, Integer intCodigoRol) throws GIDaoException {
        
        ParticipanteDAO participanteDAO = new ParticipanteDAOImpl();
        Participante participante = null;
        
        PersonaDAO personaDAO = new PersonaDAOImpl();
        Persona persona = null;
        
        participante = participanteDAO.obtenerPorProyectoYRol(strIdProyecto, intCodigoRol);
        
        if (participante != null){
            persona = personaDAO.obtenerUna(participante.getPersona());             
        }else{
            intCodigoRol = 2;
            participante = participanteDAO.obtenerPorProyectoYRol(strIdProyecto, intCodigoRol);
            
            if (participante != null){
                persona = personaDAO.obtenerUna(participante.getPersona());             
            }
        }        
                                
        return persona;        
    }

    @Override
    public Persona obtenerGestorGrupo(String strIdProyecto) throws GIDaoException {
        
        GrupoProyectoDAO grupoProyectoDAO = new GrupoProyectoDAOImpl();
        GrupoProyecto grupoProyecto = null;
        
        GrupoDAO grupoDAO = new GrupoDAOImpl();
        Grupo grupo = null;
        
        PersonaDAO personaDAO = new PersonaDAOImpl();
        Persona persona = null;
        
        grupoProyecto = grupoProyectoDAO.obtenerPorProyecto(strIdProyecto);                        
        
        if (grupoProyecto != null){
            grupo = grupoDAO.obtenerUno(grupoProyecto.getGrupo());
            
            if (grupo != null){
                persona = personaDAO.obtenerUna(grupo.getAdministrador());                    
            }
        }
                        
        return persona;
    }    
}
