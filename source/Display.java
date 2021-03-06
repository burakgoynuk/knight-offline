//package pkg443.hw1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font                 ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel            ;
import java.awt.geom.AffineTransform ;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.Timer;



//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : 443-Hw1
//  @ File Name : Display.java
//  @ Date : 08.04.2015
//  @ Author : Burak Goynuk
//
//


public class Display extends JPanel{
        
    /* Fields */
    
    public static Simulation basicSimulation;
    public Timer displayTimer;
    
    
    /* Methods */
    public  Display(Simulation dSimulation)
    {
        this.setLayout(null);
        basicSimulation = dSimulation ;
        setBackground( Color.WHITE ) ;
        
        
        ActionListener speedUpListener = new AbstractAction() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
              if ( basicSimulation.deltaTime < 2 )  
                basicSimulation.deltaTime += 0.05; 
            }
        };
        
        ActionListener speedDownListener = new AbstractAction() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
               if ( basicSimulation.deltaTime > 0.1 ) 
                basicSimulation.deltaTime -= 0.05; 
            }
        };
        
        ActionListener speedNormalListener = new AbstractAction() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                basicSimulation.deltaTime = 0.4; 
            }
        };
        
        JButton speedUp = new JButton("+");
        speedUp.setBackground(Color.LIGHT_GRAY);
        speedUp.setBounds(205, 250, 80, 40);
        this.add(speedUp);
        speedUp.addActionListener( speedUpListener );

        JButton speedDown = new JButton("-");
        speedDown.setBackground(Color.LIGHT_GRAY);
        speedDown.setBounds(25, 250, 80, 40);
        this.add(speedDown);
        speedDown.addActionListener( speedDownListener );
        
        JButton speedNormal = new JButton("Normal");
        speedNormal.setBackground(Color.LIGHT_GRAY);
        speedNormal.setBounds(115, 250, 80, 40);
        this.add(speedNormal);
        speedNormal.addActionListener( speedNormalListener );
        
        this.setVisible(true);
        
        
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(Simulation.windowWidth , Simulation.windowHeight) ;
    }


    @Override
    public void paintComponent(Graphics g) {
            super.paintComponent( g ) ;
    	   Graphics2D g2d = (Graphics2D) g ;
    	
            g2d.drawLine( basicSimulation.infoPanelWidth, 0, basicSimulation.infoPanelWidth, basicSimulation.windowHeight ) ;  
    	   
	      int x = 10  ;
	      int y = 30  ;
              
            Font defaultFont = g2d.getFont()                     ;  // Save default font
	    Font newFont     = new Font("Times New Roman", Font.BOLD, 15 ) ;
	    
	    
	    g2d.setFont(newFont) ; 
            
            g2d.drawString( "                    El Morad               Kaurus     " , x , y ) ;
            
            y += 30 ;
            
            g2d.drawString( "Score:               " + basicSimulation.eScore + "                            " + basicSimulation.kScore  , x , y ) ;
            
            y += 30;
            
            g2d.drawString( "Kills:                   " + basicSimulation.eKills + "                             " + basicSimulation.kKills  , x , y ) ;
              
            y += 30;
              
            g2d.drawString( "T. Damage:        " + basicSimulation.eDamage + "                     " + basicSimulation.kDamage  , x , y ) ;
            
            
            x = 110;
            y = 240;
            g2d.drawString("Speed Control", x, y);
	    x = 35;
	    y = 320;	
	    g.drawImage( basicSimulation.logoKnight , x, y, basicSimulation.logoKnight.getWidth() , basicSimulation.logoKnight.getHeight() , null ) ;	

	      
	    x = basicSimulation.infoPanelWidth ;
	    y = 0;
	
	    g.drawImage( basicSimulation.background , x, y, basicSimulation.background.getWidth() , basicSimulation.background.getHeight() , null ) ;

	     
             
	    for (int i=0; i < basicSimulation.knightList.size(); i++)
            {
                basicSimulation.knightList.get(i).draw(g);
            }
                     
    
    }

   
   }
