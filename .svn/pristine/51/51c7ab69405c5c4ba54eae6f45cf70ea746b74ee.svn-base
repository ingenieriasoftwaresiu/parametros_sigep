/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.jobs;

import co.edu.udea.parametrossigep.dao.NotificacionMailDAO;
import co.edu.udea.parametrossigep.dao.NotificarRegaliasDAO;
import co.edu.udea.parametrossigep.dao.impl.NotificacionMailDAOImpl;
import co.edu.udea.parametrossigep.dao.impl.NotificarRegaliasDAOImpl;
import co.edu.udea.parametrossigep.dto.ParticipanteRegalias;
import co.edu.udea.parametrossigep.exception.GIDaoException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge.correa
 */
public class PruebaNotificarRegalias {
    
    private static final String CODIGO_ESTADO_ACTIVO = "A";
    
    public static void main(String[] args){
        new GIDaoException("Iniciando tarea NotificarRegalias");
        
        List<String> destinatarios = new ArrayList<String>();
                      
        NotificarRegaliasDAO notificarRegaliasDAO = new NotificarRegaliasDAOImpl();
        List<ParticipanteRegalias> participantes = null;
        
        NotificacionMailDAO notificacionMailDAO = new NotificacionMailDAOImpl();
        
        try{       
            participantes = notificarRegaliasDAO.obtenerPorEstado(CODIGO_ESTADO_ACTIVO);
        }catch(GIDaoException e){
            new GIDaoException("Se generó un error recuperando los destinatarios", e);
        }
        
        if (participantes != null){
            
            for (ParticipanteRegalias participante : participantes){
                destinatarios.add(participante.getCorreo());
                participante = null;
            }
            
            if (destinatarios.size() > 0){
                try{
                    notificacionMailDAO.notificarRegalias(destinatarios);                
                }catch(GIDaoException e){
                    new GIDaoException("Se generó un error enviando la notificación", e);
                }
            }
        }
        
        new GIDaoException("Total personas notificadas: " + destinatarios.size());            
        new GIDaoException("Finalizando tarea NotificarRegalias");
    }
}
