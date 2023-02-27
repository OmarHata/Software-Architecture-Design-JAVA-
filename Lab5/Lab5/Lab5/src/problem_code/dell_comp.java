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
public class dell_comp extends Computer{

    public dell_comp() 
    {
        this.m=new dell_mem();
    }
    @Override
   public void start() 
   {
     m.setup();
     m.check();
   }

}
    

