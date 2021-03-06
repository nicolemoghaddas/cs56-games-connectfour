package edu.ucsb.cs56.projects.games.connectfour;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

// A JPanel to Layout the Buttons in Start Menu

/**
   Panel for the main menu screen
 */
public class StartScreenButtonsPanel extends JPanel{
    
    private JButton MPButton; // Multi Player Button
    private JButton SPButton; // Single Player Button
    private JButton ExitButton; // Exit Button
    private JButton ruleButton; // Button to show rules
    private JButton settingsButton;
    
    /**
       Constructor for the panel
       @param ss startScreen2
     */
    public StartScreenButtonsPanel(startScreen2 ss){
        super();
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        Font BFont = new Font("Comic Sans MS", Font.BOLD, 22);
        
        MPButton = new JButton ("Multiplayer");
        MPButton.addActionListener(new MPButtonListener(ss));
        MPButton.setFont(BFont);
        
        SPButton = new JButton ("Single Player");
        SPButton.addActionListener(new SPButtonListener(ss));
        SPButton.setFont(BFont);

	settingsButton = new JButton("Settings");
	settingsButton.addActionListener(new settingsButtonListener(ss));
	settingsButton.setFont(BFont);

        ruleButton = new JButton ("Rules");
        ruleButton.addActionListener(new ruleButtonListener(ss));
        ruleButton.setFont(BFont);
        
        ExitButton = new JButton ("Exit");
        ExitButton.addActionListener(new ExitButtonListener(ss));
        ExitButton.setFont(BFont);
        
        
        
        this.add(SPButton);
        this.add(MPButton);
	this.add(settingsButton);
        this.add(ruleButton);
        this.add(ExitButton);
        
    }
    
    /*
     public void displayRules(Graphics g){
     g.setColor(Color.BLACK);
     g.setFont(new Font("Times", font.REGULAR, 18));
     g.drawString("1.Choose a Column to Place a Circle in.\n2. Try to get Four identical circles in a row.");
     
     }
 
    */

    /**
       Listener for the multiplayer button
     */
    class MPButtonListener implements ActionListener {
        private startScreen2 ss1;
        
        MPButtonListener(final startScreen2 ss){
            ss1 = ss;
        }
        public void actionPerformed(ActionEvent event) {
            ss1.setGameMode(1);
            ss1.launchPlayer1ColorSelectScreen();
        }
    }
    
    /**
       Listener for the single player button
     */
    class SPButtonListener implements ActionListener {
        private startScreen2 ss1;
        
        SPButtonListener(final startScreen2 ss){
            ss1 = ss;
        }
        public void actionPerformed(ActionEvent event) {
            System.out.println("Single Player Mode!");
            ss1.loadSinglePlayerMenu();
            
        }
    }
    
    /**
       Listener for the rules button
     */
    class ruleButtonListener implements ActionListener {
	private startScreen2 ss1;
	
	ruleButtonListener(final startScreen2 ss) {
	    ss1 = ss;
	}
	public void actionPerformed(ActionEvent event){
            ss1.loadRulesPage();
        }
    }
    
    /**
       Listener for the exit button
     */
    class ExitButtonListener implements ActionListener {
        private startScreen2 ss1;
        ExitButtonListener(final startScreen2 ss){
            ss1 = ss;
        }
        public void actionPerformed(ActionEvent event) {
            
            ss1.setVisible(false);
            ss1.dispose();
        }
        
    }

     /**
       Listener for the settings button
     */
    class settingsButtonListener implements ActionListener {
        private startScreen2 ss1;
        settingsButtonListener(final startScreen2 ss){
            ss1 = ss;
        }
        public void actionPerformed(ActionEvent event) {
            
            ss1.loadSettingsPage();
        }
        
    }
}
