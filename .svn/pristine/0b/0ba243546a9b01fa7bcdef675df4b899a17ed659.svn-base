/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao.impl;

import co.edu.udea.parametrossigep.dao.GrupoProyectoDAO;
import co.edu.udea.parametrossigep.dao.cnf.JDBCConnectionPool;
import co.edu.udea.parametrossigep.dto.GrupoProyecto;
import co.edu.udea.parametrossigep.exception.GIDaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorge.correa
 */
public class GrupoProyectoDAOImpl extends JDBCConnectionPool implements GrupoProyectoDAO{
    
    private static final String OBTENER_POR_PROYECTO = "SELECT * FROM sigap.sigap_gruposproyectos WHERE Proyecto = ? LIMIT 1";
    private static final String COLUMNA_GRUPO = "Grupo";
    private static final String COLUMNA_PROYECTO = "Proyecto";

    @Override
    public GrupoProyecto obtenerPorProyecto(String strIdProyecto) throws GIDaoException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        GrupoProyecto grupoProyecto = null;
        
        try{
            con = getConexion();
            ps = con.prepareCall(OBTENER_POR_PROYECTO);
            ps.setString(1, strIdProyecto);
            
            rs = ps.executeQuery();
            
            if (rs.next()){           
                    grupoProyecto = new GrupoProyecto();                    
                    grupoProyecto.setGrupo(rs.getInt(COLUMNA_GRUPO));
                    grupoProyecto.setProyecto(rs.getString(COLUMNA_PROYECTO));                            
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
        
        return grupoProyecto;
    }
    
}
