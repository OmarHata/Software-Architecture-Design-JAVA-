/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 124774
 */
public class OmarThreadPoolExample implements Runnable {
    private String name;
    public OmarThreadPoolExample(String name){
        this.name=name;
    }
public String getName(){
    return name;
 
    }
    public void run(){
        try{
            Long duration=(long) (Math.random()*10);
        }
    }
    
}
