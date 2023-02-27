/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarthread;
import java.util.Random;
/**
 *
 * @author 124774
 */
public class OmarThread extends Thread {
    private int s=0;
    public int getSum(){
        return s;
    }
    @Override
    public void run(){
        Random random = new Random();
        int int_random = random.nextInt(100);
        for(int i=1;i<=int_random;i++){
            s=s+i;
        }
    }

    /**
     * @param args the command line arguments
     */
 
    
}
