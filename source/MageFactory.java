//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : 443-Hw1
//  @ File Name : MageFactory.java
//  @ Date : 08.04.2015
//  @ Author : Burak Goynuk
//
//

//package pkg443.hw1;

import javax.swing.Timer;


public class MageFactory extends SoldierFactory {
        public MageFactory(){
            super();
        }    
    
        public void MageFactory() {
	
	}
	
        @Override
	public Knight produce( int iHitPoint, Timer iCoolDown, int iScore, double iXPos, double iYPos, double iSpeed, int iHealth, int iNormalAttack, int iSpecAttack, Simulation iSimulation ) {
            
            
            
            Mage m1 = new Mage(iHitPoint, iCoolDown, iScore, iXPos, iYPos, iSpeed, iHealth, iNormalAttack, iSpecAttack, iSimulation);
            return m1;
	}
}