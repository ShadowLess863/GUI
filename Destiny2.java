/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guidestiny2;

/**
 *
 * @author ldkep
 */
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.StrokeBorder;


    /**
     * @param args the command line arguments
     */
    public class Destiny2 extends JFrame implements ActionListener {
    private static JPanel attacklist;
    private static JPanel Character;
    private static JPanel ArmorList;
    private static JPanel SuperPanel = new JPanel();
    
   
    //Making the labels a constant and setting the values to change to once button is pressed 
    private static String superChoiceText = "Super Choice";
    private static JLabel superChoiceLabel = new JLabel(superChoiceText);
    
    private static String kineticChoiceText = "Kinetic Weapon Choice: ";
    private static JLabel kineticChoiceLabel = new JLabel(kineticChoiceText);
    
    private static String energyChoiceText = "Energy Weapon Choice: ";
    private static JLabel energyChoiceLabel = new JLabel(energyChoiceText);
    
    private static String HeavyChoiceText = "Heavy Weapon Choice: ";
    private static JLabel HeavyChoiceLabel = new JLabel(HeavyChoiceText);
    
    private static String GhostChoiceText = "Ghost Choice: ";
    private static JLabel GhostChoiceLabel = new JLabel(GhostChoiceText);
    
    private static String HeadChoiceText = "Ghost Choice: ";
    private static JLabel HeadChoiceLabel = new JLabel(HeadChoiceText);
    
    private static String ArmChoiceText = "Gauntlet Choice: ";
    private static JLabel ArmChoiceLabel = new JLabel(ArmChoiceText);
    
    private static String ChestChoiceText = "Chest Plate Choice: ";
    private static JLabel ChestChoiceLabel = new JLabel(ChestChoiceText);
    
    private static String LegChoiceText = "Leg Armor Choice: ";
    private static JLabel LegChoiceLabel = new JLabel(LegChoiceText);
    
    private static String ClassChoiceText = "Class Item Choice: ";
    private static JLabel ClassChoiceLabel = new JLabel(ClassChoiceText);
    
    //Provides the buttons to change the middle panel using a actionlistener
    private static ActionListener SuperActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                superChoiceLabel.setText(superChoiceText + ": " + button.getText());
            }
        }
    };
    
    private static ActionListener KineticChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                kineticChoiceLabel.setText(kineticChoiceText + button.getText());
            }
        }
    };
     private static ActionListener EnergyChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                energyChoiceLabel.setText(energyChoiceText + ": " + button.getText());
            }
        }
    };
     private static ActionListener HeavyChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                HeavyChoiceLabel.setText(HeavyChoiceText + ": " + button.getText());
            }
        }
    };
      private static ActionListener GhostChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                GhostChoiceLabel.setText(GhostChoiceText + ": " + button.getText());
            }
        }
    };
      private static ActionListener HeadChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                HeadChoiceLabel.setText(HeadChoiceText + ": " + button.getText());
            }
        }
    };
       private static ActionListener ArmChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                ArmChoiceLabel.setText(ArmChoiceText + ": " + button.getText());
            }
        }
    };
        private static ActionListener ChestChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                ChestChoiceLabel.setText(ChestChoiceText + ": " + button.getText());
            }
        }
    };
         private static ActionListener LegChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                LegChoiceLabel.setText(LegChoiceText + ": " + button.getText());
            }
        }
    };
          private static ActionListener ClassChoiceActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JButton) {
                JButton button = (JButton)e.getSource();
                ClassChoiceLabel.setText(ClassChoiceText + ": " + button.getText());
            }
        }
    };
    
    public static void main(String[] args){
        // TODO code application logic here
   
    
   
        // Make an instance of our very own class--THIS CLASS
        // and by making an instance of this class, 
        // the constructor will get called, in which we'll
        // setup our key GUI components from the very first
        // line!
      JFrame frame = new JFrame("Example Program");

        frame.setMinimumSize(new Dimension(500, 500));
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new GridLayout(1, 3));

        JPanel left = new JPanel();
        left.setLayout(new GridLayout(5, 1));
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(5, 1));
        JPanel right = new JPanel();
        right.setLayout(new GridLayout(5, 1));

        //left panel for attack choices 
        //super energy choice
       
        SuperPanel.setLayout(new GridLayout(5, 1));
        SuperPanel.add(new JLabel("Super Energy"));
        JButton voidButton = new JButton("void");
        voidButton.addActionListener(SuperActionListener);
        SuperPanel.add(voidButton);
        JButton ARCButton = new JButton("Arc");
        ARCButton.addActionListener(SuperActionListener);
        SuperPanel.add(ARCButton);
        JButton SolarButton = new JButton("Solar");
        SolarButton.addActionListener(SuperActionListener);
        SuperPanel.add(SolarButton);
        JButton DarknessButton = new JButton("Darkness");
        DarknessButton.addActionListener(SuperActionListener);
        SuperPanel.add(DarknessButton);
       
        //kinetic weapon choice selection
        
        JPanel KineticPanel = new JPanel();
        KineticPanel.setLayout(new GridLayout(5, 1));
        KineticPanel.add(new JLabel("Kinetic Weapon"));
        JButton HawkmoonButton = new JButton("Hawkmoon");
        HawkmoonButton.addActionListener(KineticChoiceActionListener);
        KineticPanel.add(HawkmoonButton);
        JButton PalandromeButton = new JButton("Paldrome");
        PalandromeButton.addActionListener(KineticChoiceActionListener);
        KineticPanel.add(PalandromeButton);
        JButton ChatteringBoneButton = new JButton("Chattering Bone");
        ChatteringBoneButton.addActionListener(KineticChoiceActionListener);
        KineticPanel.add(ChatteringBoneButton);
        JButton EyeOfSolButton = new JButton("Eye of Sol");
        EyeOfSolButton.addActionListener(KineticChoiceActionListener);
        KineticPanel.add(EyeOfSolButton);
        
        
        
     

        //Energy Weapon choice selection
        JPanel EnergyWeapon = new JPanel();
        EnergyWeapon.setLayout(new GridLayout(5,1));
        EnergyWeapon.add(new JLabel("Energy Weapon"));
        JButton FelwintersButton = new JButton("Felwinter's Lie");
        FelwintersButton.addActionListener(EnergyChoiceActionListener);
        EnergyWeapon.add(FelwintersButton);
        JButton AdoredButton = new JButton("Adored");
        AdoredButton.addActionListener(EnergyChoiceActionListener);
        EnergyWeapon.add(AdoredButton);
        JButton ColdHeartButton = new JButton("ColdHeart");
        ColdHeartButton.addActionListener(EnergyChoiceActionListener);
        EnergyWeapon.add(ColdHeartButton);
        JButton SeventhSeraphButton = new JButton("Seventh Seraph CQC");
        SeventhSeraphButton.addActionListener(EnergyChoiceActionListener);
        EnergyWeapon.add(SeventhSeraphButton);
        
        
      
        //Heavy Weapon Choice selection
        JPanel HeavyWeapon = new JPanel();
        HeavyWeapon.setLayout(new GridLayout(5,1));
        HeavyWeapon.add(new JLabel("Heavy Weapon"));
        JButton SeventhButton = new JButton("Seventh Seraph SAW");
        SeventhButton.addActionListener(HeavyChoiceActionListener);
        HeavyWeapon.add(SeventhButton);
        JButton FallenButton = new JButton("Fallen Guilotien");
        FallenButton.addActionListener(HeavyChoiceActionListener);
        HeavyWeapon.add(FallenButton);
        JButton XenoButton = new JButton("Xenophage");
        XenoButton.addActionListener(HeavyChoiceActionListener);
        HeavyWeapon.add(XenoButton);
        JButton LamentButton = new JButton("Lament");
        LamentButton.addActionListener(HeavyChoiceActionListener);
        HeavyWeapon.add(LamentButton);
        
        //Ghost Choice
        JPanel GhostChoice = new JPanel();
        GhostChoice.setLayout(new GridLayout(4,1));
        GhostChoice.add(new JLabel("Ghost"));
        JButton OsirisButton = new JButton("Osiris Shell");
        OsirisButton.addActionListener(GhostChoiceActionListener);
        GhostChoice.add(OsirisButton);
        JButton StarButton = new JButton("Star Map Shell");
        StarButton.addActionListener(GhostChoiceActionListener);
        GhostChoice.add(StarButton);
        JButton CosmosButton = new JButton("Cosmos Shell");
        CosmosButton.addActionListener(GhostChoiceActionListener);
        GhostChoice.add(CosmosButton);
        
        //center panel set up
        // panel for each label 
        
        //Changing Label for Armor Choices
        JPanel ArmorChoice = new JPanel();
        ArmorChoice.setLayout(new GridLayout(5,1));
        ArmorChoice.add(HeadChoiceLabel);
        ArmorChoice.add(ArmChoiceLabel);
        ArmorChoice.add(ChestChoiceLabel);
        ArmorChoice.add(LegChoiceLabel);
        ArmorChoice.add(ClassChoiceLabel);
        
        // Weapon Choices
        JPanel WeaponChoice = new JPanel();
        WeaponChoice.setLayout(new GridLayout(5,1));
        WeaponChoice.add(superChoiceLabel);
        WeaponChoice.add(kineticChoiceLabel);
        WeaponChoice.add(energyChoiceLabel);
        WeaponChoice.add(HeavyChoiceLabel);
        WeaponChoice.add(GhostChoiceLabel);
        
       
      
        

        
        
        
        
        //Right side of page
        //Starting of armor Panel
        //Head Choice
        JPanel Head = new JPanel();
        Head.setLayout(new GridLayout(5, 1));
        Head.add(new JLabel("Head Piece"));
        JButton EternalButton = new JButton("Eternal Warrior");
        EternalButton.addActionListener(HeadChoiceActionListener);
        Head.add(EternalButton);
        JButton OEMButton = new JButton("One Eyed Mask");
        OEMButton.addActionListener(HeadChoiceActionListener);
        Head.add(OEMButton);
        JButton OptButton = new JButton("Helm of Optimacy");
        OptButton.addActionListener(HeadChoiceActionListener);
        Head.add(OptButton);
        JButton SaintButton = new JButton("Helm of Saint-14");
        SaintButton.addActionListener(HeadChoiceActionListener);
        Head.add(SaintButton);
        
        //Arm Choice
        JPanel Arm = new JPanel();
        Arm.setLayout(new GridLayout(5, 1));
        Arm.add(new JLabel("Gauntlets"));
        JButton SynthoButton = new JButton("Synthoceps");
        SynthoButton.addActionListener(ArmChoiceActionListener);
        Arm.add(SynthoButton);
        JButton IronButton = new JButton("Iron Champion Gauntlets");
        IronButton.addActionListener(ArmChoiceActionListener);
        Arm.add(IronButton);
        JButton WinterButton = new JButton("Winter Champion Gauntlets");
        WinterButton.addActionListener(ArmChoiceActionListener);
        Arm.add(WinterButton);
        JButton DoomButton = new JButton("Doom Fang Gauntlets");
        DoomButton.addActionListener(ArmChoiceActionListener);
        Arm.add(DoomButton);
        
        //Chest Choice
        JPanel Chest = new JPanel();
        Chest.setLayout(new GridLayout(4,1));
        Chest.add(new JLabel("Chest Armor"));
        JButton ArmButton = new JButton("Armamentarium");
        ArmButton.addActionListener(ChestChoiceActionListener);
        Chest.add(ArmButton);
        JButton WildButton = new JButton("Wild Hunt Plate");
        WildButton.addActionListener(ChestChoiceActionListener);
        Chest.add(WildButton);
        JButton PraefectusButton = new JButton("Praefectus Plate");
        PraefectusButton.addActionListener(ChestChoiceActionListener);
        Chest.add(PraefectusButton);
        

        
        //Leg Choice
        JPanel Legs = new JPanel();
        Legs.setLayout(new GridLayout(4,1));
        Legs.add(new JLabel("Leg Armor"));
        JButton PeraganButton = new JButton("Peragan Greeves");
        PeraganButton.addActionListener(LegChoiceActionListener);
        Legs.add(PeraganButton);
        JButton WillButton = new JButton("Iron Will Greeves");
        WillButton.addActionListener(LegChoiceActionListener);
        Legs.add(WillButton);
        JButton PraeButton = new JButton("Praefectus Greeves");
        PraeButton.addActionListener(LegChoiceActionListener);
        Legs.add(PraeButton);
        
        //Class item
        JPanel ClassItem = new JPanel();
        ClassItem.setLayout(new GridLayout(3,1));
        ClassItem.add(new JLabel("Class Item"));
        JButton StellaButton = new JButton("Stella Incognita Mark");
        StellaButton.addActionListener(ClassChoiceActionListener);
        ClassItem.add(StellaButton);
        JButton MarkButton = new JButton("Iron Will Mark");
        MarkButton.addActionListener(ClassChoiceActionListener);
        ClassItem.add(MarkButton);

       
        //adding all the panels to the frame in sequential order
        left.add(SuperPanel);
        left.add(KineticPanel);
        left.add(EnergyWeapon);
        left.add(HeavyWeapon);
        left.add(GhostChoice);
        center.add(ArmorChoice);
        center.add(WeaponChoice);
        right.add(Head);
        right.add(Arm);
        right.add(Chest);
        right.add(Legs);
        right.add(ClassItem);
        parentPanel.add(left);
        parentPanel.add(center);
        parentPanel.add(right);

        frame.add(parentPanel, BorderLayout.CENTER);
       
        
        
        //build panels for jframe
        frame.setVisible(true);
    } // close main

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source instanceof JButton) {
            
        }
    }
        
   }//close class

    
    

