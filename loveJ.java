import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
//uses keyboard
public class loveJ {

    private JFrame frame = new JFrame("Soulmate");
    private JLabel title = new JLabel();

    private JLabel twoName = new JLabel();
    private JLabel percentage = new JLabel();
    private JLabel catchPhrase = new JLabel();

    private JLabel instructions = new JLabel();

    private JLabel enterName1 = new JLabel("Enter your name");
    private JLabel enterSoulmate = new JLabel("Enter your soulmate's name");
    private JLabel enterZodiac1 = new JLabel("Enter your zodiac sign");
    private JLabel enterZodiacSoulmate = new JLabel("Enter your soulmate's zodiac");

    private JButton calculate = new JButton("Calculate");
    private JButton clear = new JButton("Clear");

    private JTextField tFname1 = new JTextField();
    private JTextField tFname2 = new JTextField();
    private JTextField tFzodiac = new JTextField();
    private JTextField tFzodiac2 = new JTextField();

    private Random random = new Random();

    private Font bigFonts = new Font("Stoke", Font.PLAIN, 36);
    private Font smallFont = new Font("Stoke", Font.PLAIN, 12);


    private int getNumPercentage;
     private String yourName;
     private String soulmatesName;
    private String yZodiac;
    private String sZodiac;


    public loveJ ()  {

        System.out.println("hi " + yourName);

        createUI();
        createComponents();
        createActionListeners();

    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getSoulmatesName() {
        return soulmatesName;
    }

    public void setSoulmatesName(String soulmatesName) {
        this.soulmatesName = soulmatesName;
    }


    public void createUI() {

        frame.setSize(800,650);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);





        frame.setVisible(true);

    }

    public void createComponents() {

        //Title
        title.setText("Soulmate");
        title.setBounds(290,45,200,30);
        title.setFont(bigFonts);

        instructions.setText("Enter your and another person’s name and zodiac sign");
        instructions.setBounds(205,75,500,30);
        instructions.setFont(smallFont);

        //result

        twoName.setText(yourName + " and " + soulmatesName);
        twoName.setBounds(300,110,300,30);
        twoName.setFont(smallFont);


        percentage.setText("soulmate compaility: " + getNumPercentage + "%");
        percentage.setBounds(280,130,300,30);
        percentage.setFont(smallFont);

        catchPhrase.setText("You two are born for each other");
        catchPhrase.setBounds(260,150,300,30);
        catchPhrase.setFont(smallFont);



        //Text field
        tFname1.setBounds(100, 230, 220,35);

        tFname2.setBounds(420, 230, 220,35);

        calculate.setBounds(150, 280, 180,35 );

        clear.setBounds(400, 280,180,35);



        frame.add(clear);
        frame.add(calculate);
        frame.add(tFname2);
        frame.add(catchPhrase);
        frame.add(percentage);
        frame.add(instructions);
        frame.add(twoName);
        frame.add(tFname1);


        frame.add(title);
    }

    public void createActionListeners() {

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                yourName = tFname1.getText();
                soulmatesName = tFname2.getText();
                twoName.setText(yourName + " and " + soulmatesName);


                getNumPercentage = random.nextInt(101);
                percentage.setText("soulmate compaility: " + getNumPercentage + "%");


                System.out.println(yourName);
                System.out.println(soulmatesName);
                System.out.println(getNumPercentage);
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catchPhrase.setText("");
                percentage.setText("");
                twoName.setText("");
            }
        });
    }

    //Add color changing background
    //Add sound
    //Add saving
}
