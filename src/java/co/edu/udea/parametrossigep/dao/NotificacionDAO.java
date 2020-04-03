/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao;

import co.edu.udea.parametrossigep.dto.Notificacion;
import co.edu.udea.parametrossigep.exception.GIDaoException;

/**
 *
 * @author jorge.correaj
 */
public interface NotificacionDAO {
    public Notificacion obtenerUna(String strCodigo) throws GIDaoException;
}
