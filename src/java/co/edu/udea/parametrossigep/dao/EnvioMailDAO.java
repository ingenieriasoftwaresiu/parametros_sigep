/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.dao;

import co.edu.udea.parametrossigep.dto.ParametroMail;
import co.edu.udea.parametrossigep.exception.GIDaoException;
import java.util.List;

/**
 *
 * @author jorge.correa
 */
public interface EnvioMailDAO {
    public void sendMail(ParametroMail parametroMail) throws GIDaoException;
    public void sendMailHTML(ParametroMail parametroMail) throws GIDaoException;
    public void sendMailAttach(ParametroMail parametroMail) throws GIDaoException;
    public void sendBCCMultiple(ParametroMail parametroMail, List<String> destinatarios) throws GIDaoException;
}
