/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarthreadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author 124774
 */
public class HatamlehThreadPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ThreadPoolExecutor exe=(ThreadPoolExecutor)Executors.newFixedThreadPool(2);
        for (int i=1;i<=100;i++)
        {
            OmarTasks task =new OmarTasks("Task "+i);
            System.out.print("Created Worker Thread instance "+task.getName());
            exe.execute(task);
            
        }
        exe.shutdown();
    }
    
}
