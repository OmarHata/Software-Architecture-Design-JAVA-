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
public class Robot {
        private Hand hand;
    private Head head;
    private Leg leg;
    
 public Robot(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }
     @Override
 public String toString() {
        return "Robot=" + "Hand: " + hand.name() + ", Head: " + head.name() + ", Leg: " + leg.name();
    }
    
}
