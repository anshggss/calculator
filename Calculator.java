import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Calculator implements ActionListener {

    JFrame frame; //Creating a Window for the Calculator app;
    JTextField textField; //Text Field to enter Values
    Font myFont = new Font("Serif", Font.BOLD, 20);
    JButton[] numbuttons = new JButton[10]; //Array to store numberbuttons
    JButton[] funcbuttons = new JButton[8]; //Array to store functionbuttons
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,eqButton,delButton,clrButton;
    JPanel panel ;

    char operator;
    int num1=0,num2=0,result=0;

    Calculator(){
        frame=new JFrame();//Initializing the Window
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,550);
        frame.setLayout(null);

        //Initialize the TextField
        textField=new JTextField();
        textField.setBounds(50,25,300,50);//SetSize and location of textfield on screen
        textField.addActionListener(this);//add an actionlistener to textfield
        textField.setFont(myFont);//setfont
        textField.setEditable(false);//disable input from keyboard

        //Initialise number buttons
        numbuttons[0] = new JButton("0");
        numbuttons[1] = new JButton("1");
        numbuttons[2] = new JButton("2");
        numbuttons[3] = new JButton("3");
        numbuttons[4] = new JButton("4");
        numbuttons[5] = new JButton("5");
        numbuttons[6] = new JButton("6");
        numbuttons[7] = new JButton("7");
        numbuttons[8] = new JButton("8");
        numbuttons[9] = new JButton("9");

        //Initialise Function Buttons
        addButton=new JButton("+");
        subButton=new JButton("-");
        mulButton=new JButton("*");
        divButton=new JButton("/");
        decButton=new JButton(".");
        clrButton=new JButton("Clear");
        delButton=new JButton("Delete");
        eqButton=new JButton("=");

        //Initialise Funcbuttons
        funcbuttons[0]=addButton;
        funcbuttons[1]=subButton;
        funcbuttons[2]=mulButton;
        funcbuttons[3]=divButton;
        funcbuttons[4]=decButton;
        funcbuttons[5]=clrButton;
        funcbuttons[6]=delButton;
        funcbuttons[7]=eqButton;

        for (JButton button : numbuttons) {
            button.addActionListener(this);//add actionlistener
            button.setFont(myFont);//setfont
            button.setFocusable(false);//remove a selection bracket which appeears on clicking the button
        }
        for (JButton button : funcbuttons) {
            button.addActionListener(this);
            button.setFont(myFont);
            button.setFocusable(false);
        }

        //Creating Panel to Hold Number Buttons
        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4));
        panel.add(numbuttons[1]);
        panel.add(numbuttons[2]);
        panel.add(numbuttons[3]);
        panel.add(funcbuttons[0]);
        panel.add(numbuttons[4]);
        panel.add(numbuttons[5]);
        panel.add(numbuttons[6]);
        panel.add(funcbuttons[1]);
        panel.add(numbuttons[7]);
        panel.add(numbuttons[8]);
        panel.add(numbuttons[9]);
        panel.add(funcbuttons[2]);
        panel.add(funcbuttons[4]);
        panel.add(numbuttons[0]);
        panel.add(funcbuttons[3]);
        panel.add(funcbuttons[7]);

        delButton.setBounds(50,430,150,50);
        clrButton.setBounds(200,430,150,50);

        frame.add(textField);
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}