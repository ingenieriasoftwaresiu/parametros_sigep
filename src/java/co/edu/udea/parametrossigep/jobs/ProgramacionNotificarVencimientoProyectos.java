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
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.TriggerUtils;

/**
 *
 * @author jorge.correa
 */
public class ProgramacionNotificarVencimientoProyectos {
    
    public void crearProgramacion(){
        
        Integer intError=0;
        
        try {
            
            new GIDaoException("Inicio la programación de la tarea NotificarVencimientoProyectos");
                                        
            intError = 1;
            
            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start(); 
            
            // Creación de una instancia de JobDetail.
            //JobDetail jobDetail = new JobDetail("NotificarVencimientoProyectosJob", Scheduler.DEFAULT_GROUP, NotificarVencimientoProyectos.class);
            JobDetail jobDetail = new JobDetail("NotificarVencimientoProyectosJob", scheduler.DEFAULT_GROUP, NotificarVencimientoProyectos.class);
            //JobDetail jobDetail = JobBuilder.newJob(NotificarVencimientoProyectos.class).withIdentity("NotificarVencimientoProyectosJob", "group1").build();

             intError = 2;
            
            // Se crea el trigger para ejecución todos los días.            
             //Trigger trigger = TriggerBuilder.newTrigger().withIdentity("NotificarVencimientoProyectosTrigger", "group1").withSchedule(CronScheduleBuilder.cronSchedule("0 55 10 * * ?")).build();
             //Trigger trigger = TriggerBuilder.newTrigger().withIdentity("NotificarVencimientoProyectosTrigger", "group1").withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInHours(24).repeatForever()).build();
            //Trigger trigger = new CronTrigger("NotificarVencimientoProyectosTrigger", Scheduler.DEFAULT_GROUP, "0 15 10 * * ?");
             Trigger trigger = TriggerUtils.makeDailyTrigger(07, 00);
             //trigger.setStartTime(new Date());
             trigger.setName("tgNotificarVencimientoProyectos");
             trigger.setGroup("grupoSIU");
             trigger.setPriority(1);
             /*SimpleTrigger trigger = new SimpleTrigger();
             trigger.setStartTime(new Date());
             trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
             trigger.setRepeatInterval(24L * 60L * 60L * 1000L);
             trigger.setName("NotificarVencimientoProyectosTrigger");
             trigger.setGroup(scheduler.DEFAULT_GROUP);*/
             //SimpleTrigger trigger=new SimpleTrigger("NotificarVencimientoProyectosTrigger",scheduler.DEFAULT_GROUP,new Date(),null,SimpleTrigger.REPEAT_INDEFINITELY,60L*1000L);
                                                  
             intError = 3;

            // Registro dentro del Scheduler.            
            scheduler.scheduleJob(jobDetail, trigger);
            
             intError = 4;

            // Damos tiempo a que el Trigger registrado termine su periodo de vida dentro del scheduler.
            //Thread.sleep(60000);
            
             intError = 5;

            // Detenemos la ejecución de la instancia de Scheduler.
            //scheduler.shutdown();
            
             intError = 6;
             
             new GIDaoException("Finalizó la programación de la tarea NotificarVencimientoProyectos.");

        } catch(Exception e) {
            new GIDaoException("Se generó un error al ejecutar la tarea NotificarVencimientoProyectos. Variable error = " +  intError, e);
        }
    } 
}
