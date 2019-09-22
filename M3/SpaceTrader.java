import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpaceTrader {

    //Starting skill points and credit points according to level of difficulty.
    static int skillPoints = 0;
    static int maxPoints = 0;
    static int creditPoints = 0;

    //Main Frame(Window)
    static JFrame mainFrame = new JFrame("Space Trader");
    static JPanel mainStage = new JPanel();

    //***Stage 1-2 Variables***
    //Player Name
    static String name = "";
    //Level Description
    static String levelSelected = "";
    //Skill Points
    static int pilotSkillP = 0;
    static int fighterSkillP = 0;
    static int merchantSkillP = 0;
    static int engineerSkillP = 0;
    //Labels
    static JLabel level = new JLabel();
    static JLabel pilotP = new JLabel();
    static JLabel fighterP = new JLabel();
    static JLabel merchantP = new JLabel();
    static JLabel engineerP = new JLabel();
    static JLabel edittedPoints = new JLabel();


    // Start with Stage 0...
    public static void main(String[] args) {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,400);
        //Stage 0 Components : Panel that includes "welcome text" and "start button".
        //Create components
        JPanel stage0 = new JPanel();
        JLabel s0Label = new JLabel("Welcome to Space Trader!");
        JButton start = new JButton("Start New Game!");
        BoxLayout s0BoxLayout = new BoxLayout(stage0, BoxLayout.Y_AXIS);
        //Layout distribution
        stage0.setLayout(s0BoxLayout);
        s0Label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        start.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        //Display
        stage0.add(s0Label);
        stage0.add(start);
        mainStage.add(stage0);
        mainFrame.add(mainStage, BorderLayout.SOUTH);
        mainFrame.setVisible(true);
        //Button action; Leads to next stage.
        start.addActionListener(e -> stage1());
    }
    //Stage 1 method
    private static void stage1() {
        //Removes previous panels
        mainFrame.remove(mainStage);
        mainStage = new JPanel();
        //Stage 1 Components : Name, Difficulty, Skill Infos, and Buttons(Represented as stage1A stage1F)
        //Create components
        JPanel stage1A = new JPanel();
        stage1A.setMaximumSize(new Dimension(300, 30));
        JPanel stage1B = new JPanel();
        JPanel stage1C = new JPanel();
        JPanel stage1D = new JPanel();
        JPanel stage1E = new JPanel();
        JPanel stage1F = new JPanel();
        JPanel stage1G = new JPanel();

        //stage1A
        JLabel playerName = new JLabel();
        playerName.setText("Player Name :");
        JTextField playerNameIn = new JTextField("!PRESS ENTER AFTER NAME TYPED!");
        BoxLayout box1 = new BoxLayout(stage1A, BoxLayout.X_AXIS);
        stage1A.setLayout(box1);
        playerName.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        playerNameIn.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        stage1A.add(playerName);
        stage1A.add(playerNameIn);
        //Gets text input and save it to variable "name"
        playerNameIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = playerNameIn.getText();
            }
        });

        //stage1B0
        JPanel stage1B0 = new JPanel();
        JLabel difficulty = new JLabel();
        difficulty.setText("Please Choose Difficulty Level");
        BoxLayout box2a = new BoxLayout(stage1B0, BoxLayout.X_AXIS);
        stage1B0.setLayout(box2a);
        difficulty.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        stage1B0.add(difficulty);

        //stage1B
        JButton easy = new JButton("Easy");
        JButton medium = new JButton("Medium");
        JButton hard = new JButton("Hard");
        BoxLayout box2 = new BoxLayout(stage1B, BoxLayout.X_AXIS);
        stage1B.setLayout(box2);
        easy.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        medium.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        hard.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        stage1B.add(easy);
        stage1B.add(medium);
        stage1B.add(hard);
        //stage1B-Button Action
        easy.addActionListener(e -> doEasy());
        medium.addActionListener(e -> doMedium());
        hard.addActionListener(e -> doHard());

        //stage1C
        JLabel diffLevel = new JLabel();
        diffLevel.setText("Level: ");
        level.setText(levelSelected);
        BoxLayout box3 = new BoxLayout(stage1C, BoxLayout.X_AXIS);
        stage1C.setLayout(box3);
        stage1C.add(diffLevel);
        stage1C.add(level);

        //stage1D
        JLabel skillStatus = new JLabel();
        skillStatus.setText("--------Skill Status--------");
        BoxLayout box4 = new BoxLayout(stage1D, BoxLayout.X_AXIS);
        stage1D.setLayout(box4);
        stage1D.add(skillStatus);

        //stage1E
        JLabel remainingPoints = new JLabel();
        remainingPoints.setText("Skill Points:");
        remainingPoints.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        edittedPoints.setText(String.valueOf(skillPoints));
        BoxLayout box5 = new BoxLayout(stage1E, BoxLayout.X_AXIS);
        stage1E.setLayout(box5);
        stage1E.add(remainingPoints);
        stage1E.add(edittedPoints);

        //stage1F
        JButton pilot = new JButton("Pilot");
        JButton fighter = new JButton("Fighter");
        JButton merchant = new JButton("Merchant");
        JButton engineer = new JButton("Engineer");

        pilot.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        fighter.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        merchant.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        engineer.setAlignmentX(JComponent.LEFT_ALIGNMENT);

        pilotP.setText(String.valueOf(pilotSkillP));
        fighterP.setText(String.valueOf(fighterSkillP));
        merchantP.setText(String.valueOf(merchantSkillP));
        engineerP.setText(String.valueOf(engineerSkillP));

        pilotP.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        fighterP.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        merchantP.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        engineerP.setAlignmentX(JComponent.LEFT_ALIGNMENT);

        JPanel stage1F1 = new JPanel();
        JPanel stage1F2 = new JPanel();
        JPanel stage1F3 = new JPanel();
        JPanel stage1F4 = new JPanel();

        BoxLayout box6 = new BoxLayout(stage1F, BoxLayout.Y_AXIS);
        BoxLayout box6a = new BoxLayout(stage1F1, BoxLayout.X_AXIS);
        BoxLayout box6b = new BoxLayout(stage1F2, BoxLayout.X_AXIS);
        BoxLayout box6c = new BoxLayout(stage1F3, BoxLayout.X_AXIS);
        BoxLayout box6d = new BoxLayout(stage1F4, BoxLayout.X_AXIS);

        stage1F.setLayout(box6);
        stage1F1.setLayout(box6a);
        stage1F2.setLayout(box6b);
        stage1F3.setLayout(box6c);
        stage1F4.setLayout(box6d);

        stage1F1.add(pilot);
        stage1F1.add(pilotP);
        stage1F2.add(fighter);
        stage1F2.add(fighterP);
        stage1F3.add(merchant);
        stage1F3.add(merchantP);
        stage1F4.add(engineer);
        stage1F4.add(engineerP);

        stage1F.add(stage1F1);
        stage1F.add(stage1F2);
        stage1F.add(stage1F3);
        stage1F.add(stage1F4);
        //stage1F-Button Actions
        pilot.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (skillPoints != 0) {
                    pilotSkillP++;
                    skillPoints--;
                }
                pilotP.setText(String.valueOf(pilotSkillP));
                edittedPoints.setText(String.valueOf(skillPoints));

            }
        });
        fighter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (skillPoints != 0) {
                    fighterSkillP++;
                    skillPoints--;
                }
                fighterP.setText(String.valueOf(fighterSkillP));
                edittedPoints.setText(String.valueOf(skillPoints));
            }
        });
        merchant.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (skillPoints != 0) {
                    merchantSkillP++;
                    skillPoints--;
                }
                merchantP.setText(String.valueOf(merchantSkillP));
                edittedPoints.setText(String.valueOf(skillPoints));
            }
        });
        engineer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (skillPoints != 0) {
                    engineerSkillP++;
                    skillPoints--;
                }
                engineerP.setText(String.valueOf(engineerSkillP));
                edittedPoints.setText(String.valueOf(skillPoints));
            }
        });

        //stageG
        JLabel finalStep = new JLabel();
        finalStep.setText("----------Final Step----------");
        JButton confirm = new JButton("Confirm");
        JButton reset = new JButton("Reset");
        BoxLayout box7 = new BoxLayout(stage1G, BoxLayout.Y_AXIS);
        stage1G.setLayout(box7);
        finalStep.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        confirm.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        reset.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        stage1G.add(finalStep);
        stage1G.add(reset);
        stage1G.add(confirm);
        //stageG-Button Action
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                resetSkillPoints ();
                level.setText("");
                playerNameIn.setText("");
            }
        });

        confirm.addActionListener(e -> stage2());

        //Setting mainStage
        BoxLayout box0 = new BoxLayout(mainStage, BoxLayout.Y_AXIS);
        mainStage.setLayout(box0);

        //Display
        mainStage.add(stage1A, BorderLayout.CENTER);
        mainStage.add(stage1B0, BorderLayout.CENTER);
        mainStage.add(stage1B, BorderLayout.CENTER);
        mainStage.add(stage1C, BorderLayout.CENTER);
        mainStage.add(stage1D, BorderLayout.CENTER);
        mainStage.add(stage1E, BorderLayout.CENTER);
        mainStage.add(stage1F, BorderLayout.CENTER);
        mainStage.add(stage1G, BorderLayout.CENTER);
        mainFrame.add(mainStage, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }
    //Helper methods for Stage 1
    private static void resetSkillPoints () {
        pilotSkillP = 0;
        fighterSkillP = 0;
        merchantSkillP = 0;
        engineerSkillP = 0;
        pilotP.setText(String.valueOf(pilotSkillP));
        fighterP.setText(String.valueOf(fighterSkillP));
        merchantP.setText(String.valueOf(merchantSkillP));
        engineerP.setText(String.valueOf(engineerSkillP));
    }
    private static void setDiff () {
        edittedPoints.setText(String.valueOf(skillPoints));
        level.setText(levelSelected);
    }

    private static void doEasy () {
        skillPoints = 16;
        maxPoints = 16;
        creditPoints = 1000;
        levelSelected = "EASY";
        resetSkillPoints();
        setDiff();
    }
    private static void doMedium () {
        skillPoints = 12;
        maxPoints = 12;
        creditPoints = 700;
        levelSelected = "MEDIUM";
        resetSkillPoints();
        setDiff();
    }
    private static void doHard () {
        skillPoints = 8;
        maxPoints = 8;
        creditPoints = 300;
        levelSelected = "HARD";
        resetSkillPoints();
        setDiff();
    }

    //Stage 2 Method
    private static void stage2() {
        mainFrame.remove(mainStage);
        mainStage = new JPanel();
        /* Stage 2 Components : Only for display function. Details should include;
         * Player name, level of difficulty, skill status, and starting credit points.
        */

        //Create labels
        JLabel displayName = new JLabel();
        JLabel displayDiff = new JLabel();
        JLabel displayCredit = new JLabel();
        JLabel displaySkill = new JLabel();
        JLabel displayPilot = new JLabel();
        JLabel displayFighter = new JLabel();
        JLabel displayMerchant = new JLabel();
        JLabel displayEngineer = new JLabel();

        //Setting mainstage
        BoxLayout box0 = new BoxLayout(mainStage, BoxLayout.Y_AXIS);
        mainStage.setLayout(box0);

        //Display
        displayName.setText("Player Name :  " + name);
        displayDiff.setText("Difficulty Level :  " + levelSelected);
        displayCredit.setText("CREDIT POINTS :  " + String.valueOf(creditPoints));
        displaySkill.setText("--------SKILL STATUS--------");
        displayPilot.setText("Pilot :   " + pilotSkillP);
        displayFighter.setText("Fighter :   " + fighterSkillP);
        displayMerchant.setText("Merchant :   " + merchantSkillP);
        displayEngineer.setText("Engineer :   " + engineerSkillP);

        displayName.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        displayDiff.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        displayCredit.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        displaySkill.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        displayPilot.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        displayFighter.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        displayMerchant.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        displayEngineer.setAlignmentX(JComponent.RIGHT_ALIGNMENT);

        mainStage.add(displayName, BorderLayout.CENTER);
        mainStage.add(displayDiff, BorderLayout.CENTER);
        mainStage.add(displayCredit, BorderLayout.CENTER);
        mainStage.add(displaySkill, BorderLayout.CENTER);
        mainStage.add(displayPilot, BorderLayout.LINE_START);
        mainStage.add(displayFighter, BorderLayout.LINE_START);
        mainStage.add(displayMerchant, BorderLayout.LINE_START);
        mainStage.add(displayEngineer, BorderLayout.LINE_START);
        mainFrame.add(mainStage, BorderLayout.CENTER);
        mainFrame.add(mainStage, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }
}