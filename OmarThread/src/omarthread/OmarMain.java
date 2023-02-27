/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarthread;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author 124774
 */
public class OmarMain {
     public static void main(String args[]) {
        List<OmarThread> omarThreads =new ArrayList<>();
        for(int i=0;i<100;i++){
    OmarThread Su= new OmarThread();
    Su.start();
    omarThreads.add(Su);
}
        for(OmarThread Su :omarThreads){
            try{
                Su.join();
            }catch(InterruptedException E){
                E.printStackTrace();
            }
        }
        int Total =0;
        for(OmarThread Su :omarThreads){
            Total = Total + Su.getSum();
        }
        System.out.println("Total sum :"+Total);
}
}
