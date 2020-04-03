/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dao.NotificacionDAO;
import co.edu.udea.parametrossigep.dao.cnf.JDBCConnectionPool;
import co.edu.udea.parametrossigep.dto.Notificacion;
import co.edu.udea.parametrossigep.exception.GIDaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorge.correaj
 */
public class NotificacionDAOImpl extends JDBCConnectionPool implements NotificacionDAO{
    
    private static final String OBTENER_UNO = "SELECT * from sigap.sigap_notificaciones WHERE codigo = ?";
    private static final String COLUMNA_CODIGO = "codigo";
    private static final String COLUMNA_NOMBRE = "nombre";
    private static final String COLUMNA_NOMBRE_DESTINATARIO = "nombreDestinatario";
    private static final String COLUMNA_EMAIL_DESTINATARIO = "emailDestinatario";
    private static final String COLUMNA_DIAS_PREVIOS_NOTIFICACION = "diasPreviosNotificacion";
    
    @Override
    public Notificacion obtenerUna(String strCodigo) throws GIDaoException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Notificacion notificacion = null;
        
        try{
            con = getConexion();
            ps = con.prepareCall(OBTENER_UNO);
            ps.setString(1, strCodigo);
            
            rs = ps.executeQuery();
            
            if (rs.next()){                
                    notificacion = new Notificacion();                    
                    notificacion.setCodigo(rs.getString(COLUMNA_CODIGO));
                    notificacion.setNombre(rs.getString(COLUMNA_NOMBRE));
                    notificacion.setNombreDestinatario(rs.getString(COLUMNA_NOMBRE_DESTINATARIO));
                    notificacion.setEmailDestinatario(rs.getString(COLUMNA_EMAIL_DESTINATARIO));
                    notificacion.setDiasPreviosNotificacion(rs.getInt(COLUMNA_DIAS_PREVIOS_NOTIFICACION));                    
            }
            
        }catch(SQLException e){
            throw new GIDaoException(e);
        }finally{
            try{
                
                if (rs != null){
                    rs.close();
                }
                
                 if (ps != null){
                    ps.close();
                }
                 
                  if (con != null){
                    con.close();
                }
                  
            }catch(SQLException e){
                throw new GIDaoException(e);
            }
        }
        
        return notificacion;
    }
            
}
