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
public class Robot_Parts {
    private  Hand hand;
    private  Head head;
    private  Leg leg;
    public  Robot bulid(){
        return  new Robot(hand, head, leg);
    }

    public Robot_Parts setH(Hand hand) {
        this.hand = hand;
        return  this;
    }

    public Robot_Parts setHe(Head head) {
        this.head = head;
        return  this;
    }

    public Robot_Parts setL(Leg leg) {
        this.leg = leg;
        return  this;

}

    Object setHand(Hand_X hand_X) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}