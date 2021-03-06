/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.parametrossigep.jobs;

import co.edu.udea.parametrossigep.exception.GIDaoException;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author jorge.correaj
 */
public class ProgramacionNotificarReservas {
    
    public void crearProgramacion(){
        
        Integer intError=0;
        
        try {
            
            new GIDaoException("Inicio la programación de la tarea NotificarReservas");
                                        
            intError = 1;
            
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start(); 
            
            // Creación de una instancia de JobDetail.
            JobDetail jobDetail1 = new JobDetail("NotificarReservasJob1", scheduler.DEFAULT_GROUP, NotificarReservas.class);
            JobDetail jobDetail2 = new JobDetail("NotificarReservasJob2", scheduler.DEFAULT_GROUP, NotificarReservas.class);
            
             intError = 2;
            
            // Se crea el trigger para ejecución en la mañana.
             Trigger trigger1 = TriggerUtils.makeDailyTrigger(11, 59);
             trigger1.setName("tgNotificarReservas1");
             trigger1.setGroup("grupoSIU");
             trigger1.setPriority(2);     
             
              intError = 3;
             
             // Se crea el trigger para ejecución en la tarde.
             Trigger trigger2 = TriggerUtils.makeDailyTrigger(20,30);
             trigger2.setName("tgNotificarReservas2");
             trigger2.setGroup("grupoSIU");
             trigger2.setPriority(2); 
                                                  
             intError = 4;

            // Registro dentro del Scheduler.            
            scheduler.scheduleJob(jobDetail1, trigger1);
            scheduler.scheduleJob(jobDetail2, trigger2);
            
             intError = 5;

             new GIDaoException("Finalizó la programación de la tarea NotificarReservas.");

        } catch(Exception e) {
            new GIDaoException("Se generó un error al ejecutar la tarea NotificarReservas. Variable error = " +  intError, e);
        }        
    }
}
