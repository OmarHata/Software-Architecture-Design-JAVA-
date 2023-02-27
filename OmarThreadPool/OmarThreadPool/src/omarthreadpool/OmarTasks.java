/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarthreadpool;

import java.util.concurrent.TimeUnit;



/**
 *
 * @author 124774
 */
public class OmarTasks implements Runnable{
    
    private final String name;
    
    public OmarTasks(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    @Override
    public void run(){
       
        try{
            Long duration =(long)(Math.random()*10);
            System.out.println("Created Worker Thread instance  "+name);
            TimeUnit.SECONDS.sleep(duration);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
