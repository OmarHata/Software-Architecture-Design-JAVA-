/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarlab;

/**
 *
 * @author seexam
 */
public class OmarLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Robot R1=new Robot_Parts().setHand(new Hand_X()).setHead(new Head_X()).setLeg(new Leg_X()).bulid();
        System.out.println(R1);
         Robot R2=new Robot_Parts().setHand(new Hand_Y()).setHead(new Head_Y()).setLeg(new Leg_Y()).bulid();
        System.out.println(R2);
         Robot R3=new Robot_Parts().setHand(new Hand_X()).setHead(new Head_Y()).setL(new Leg_Y()).bulid();
        System.out.println(R3);
         Robot R4=new Robot_Parts().setHand(new Hand_X()).setHead(new Head_Y()).bulid();
        System.out.println(R4);
    }
    
}
