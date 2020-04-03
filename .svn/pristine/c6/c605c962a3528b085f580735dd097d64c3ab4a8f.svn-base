/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.jobs;

import co.edu.udea.parametrossigep.exception.GIDaoException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Web application lifecycle listener.
 *
 * @author jorge.correa
 */
public class ArrancarJobs implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try{
            new ProgramacionNotificarVencimientoProyectos().crearProgramacion();
            //new ProgramacionNotificarRegalias().crearProgramacion(); // 2018-02-13: Se desactiva a petición de Felipe Medina.
            new ProgramacionNotificarActividades().crearProgramacion();
            new ProgramacionNotificarReservas().crearProgramacion();
        }catch (Exception ex) {
            new GIDaoException("Se generó un error al arrancar los jobs de la aplicación", ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
         try{
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.shutdown(false);
        } catch (Exception ex) {
            new GIDaoException("Se generó un error al detener los jobs de la aplicación", ex);
        }
    }
}
