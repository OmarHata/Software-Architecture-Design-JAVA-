/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_code;

/**
 *
 * @author 124774
 */
public class hp_comp extends Computer{

    
     public hp_comp() 
     {
        this.m=new hp_mem();
     }
    @Override
   public void start() 
   {
       m.setup();
       m.check();
   }
    
}
