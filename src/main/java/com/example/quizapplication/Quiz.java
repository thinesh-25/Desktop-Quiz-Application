package com.example.quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Quiz implements ActionListener{

    //This part includes a set of 50 Java related quiz questions.
    String[] questions = {
            "Java declaration statement must end with?",
            "The loop keyword of java is?",
            "Which of these are pure object oriented language?",
            "Which one of the following is not a java keyword?",
            "What is java?",
            "Who is known as father of Java Programming Language?",
            "In java control statements break, continue, return, try-catch-finally and assert belongs to?",
            "Which provides runtime environment for java byte code to be executed?",
            "What is byte code in Java?",
            "Which of the following are not Java keywords ?",

            "Which of these have highest precedence?",
            "Which of these is returned by operator '&' ?",
            "Data type long literals are appended by ___.",
            "Which variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed?",
            "Java language was initially called as ____.",
            "What is garbage collection in the context of Java?",
            "Which one is a template for creating different objects ?",
            "Which symbol is used to contain the values of automatically initialized arrays?",
            "Which one is true about a constructor ?",
            "Which of these operators is used to allocate memory to array variable in Java?",

            "Which of these is not a bitwise operator?",
            "Which of these is returned by Greater Than, Less Than and Equal To (i.e Relational) operator ?",
            "Which statement transfer execution to different parts of your code based on the value of an expression?",
            "Modulus operator (%) can be applied to which of these?",
            "What feature of OOP has a super-class sub-class concept?",
            "Which of the following are not the methods of the Thread class?",
            "Division operator has __ precedence over multiplication operator",
            "What is the full form of JVM ?",
            "In Java code, the line that begins with /* and ends with */ is known as?",
            "Which of the following are not Java modifiers?",

            "What are the legal indexes for the array ar, given the following declaration: int[] ar = {2, 4, 6, 8 }",
            "___ is a collection of elements used to store the same type of data.",
            "What is the first index of an array?",
            "For the array: int stats[3].   What is the range of the index?",
            "int [] nums = {2, 3, 5, 8, 9, 11};   How would you access the fourth element in nums?",
            "The first value of an array called quizzes can be accessed with which of the following statements?",
            "Which of the following statements outputs the fifth value in the quizzes array?",
            "Index values of an array range from ______.",
            "Create an array of 12 strings called months.",
            "What value is at index 1 in this array?  String[] names = {\"Mack\", \"Dennis\", \"Dawn\", \"Charlie\"};",

            "What is the correct way to create an array with these three numbers: 12  8  15",
            "What is the length of the following array: byte[] data = { 12, 34, 9, 0, -62, 88 };",
            "When any __ type (boolean, char, byte, short, int, long, float, or double) is passed to a method, the value is passed.",
            "The length __ contains the number of elements in the array.",
            "Comparing a variable to a list of values in an array is a process called __ an array.",
            "Individual array elements are __ by value when a copy of the value is made and used within the receiving method.",
            "Which is not a logical operator?",
            "Each element in a String array is automatically initialized to __.",
            "Elements in an ArrayList must be __.",
            "Which property can be used to return the number of rows in an array?"
    };

    //This part includes a set of answer options for the implemented questions.
    String[][] options = {
            {"Comma","Colon","Semicolon","Full stop"},
            {"Byte","While","Double","Float"},
            {"C","C++","Java","Python"},
            {"Break","Class","Study","Static"},
            {"Programming Language", "IDE","Application", "Database"},
            {"Charel Babbage", "M. P Java", "James Gosling", "Blais Pascal"},
            {"Selection statements", "Loop Statements", "Transfer statements", "Pause Statement"},
            {"JVM", "JDK", "JRE", "JAVAC"},
            {"Code generated by a Java compiler", "Code generated by a Java Virtual Machine", "Name of Java source code file", "Block of code written inside a class"},
            {"double", "switch", "then", "instanceof"},

            {"()", "++", "*", ">>"},
            {"Integer", "Character", "Boolean", "Float"},
            {"Uppercase L", "Lowercase L", "Long", "Both A and B"},
            {"Local variables", "Instance variables", "Class Variables", "Static variables"},
            {"Sumatra", "J++", "Oak", "Pine"},
            {"Java deletes all unused java files on the system.", "Memory used by the object with no reference is automatically reclaimed.", "The JVM cleans output of Java program with error.", "Any unused package in a program automatically gets deleted."},
            {"An Array", "A class", "Interface", "Method"},
            {"Brackets", "Braces", "Parentheses", "Comma"},
            {"A constructor must have the same name as the class it is declared within.", "A constructor is used to create objects.", "A constructor may be declared private", "All of the above"},
            {"alloc", "malloc", "new malloc", "new"},

            {"&' Operator", "&=' Operator", "|=' Operator", "<=' Operator"},
            {"Float", "Integer", "Boolean", "Double"},
            {"If", "Switch", "Nested-if", "if-else-if"},
            {"Integers", "Floating - point numbers", "Both A and B", "None of These"},
            {"Hierarchical inheritance", "Single inheritance", "Multiple inheritances", "Multilevel inheritance"},
            {"yield()", "sleep(long msec)", "go()", "stop()"},
            {"Highest", "Least", "Equal", "None of These"},
            {"Java Very Large Machine", "Java Verified Machine", "Java Very Small Machine", "Java Virtual Machine"},
            {"Multiline comment", "Single line comment", "Both A & B", "None of these"},
            {"public", "private", "friendly", "transient"},

            {"0, 1, 2, 3", "1, 2, 3, 4", "2, 4, 6, 8", " 0, 2, 4, 6"},
            {"Array", "Switch", "Case", "Loop"},
            {"1", "0", "2", "3"},
            {"0 to 3", "0 to 2", "1 to 3", "0 to 4"},
            {"nums[4]", "nums[3]", "nums(4)", "nums(3)"},
            {"quizzes[1] = 100;", "quizzes[0] = 100;", "quizzes[zero] = 100;", "quizzes[one] = 100;"},
            {"System.out.println(quizzes[5]);", "quizzes[4];", "quizzes[5];", "System.out.println(quizzes[4]);"},
            {"0 to length � 1", "1 to length", "0 to length", "0 to length + 1"},
            {"String[] months = new String[12];", "String months = new String[12];", "String[] months = new String[];", "String[12] months = new String[];"},
            {"Mack", "Dennis", "Dawn", "Charlie"},

            {"int[] = {12, 8, 15};", "int[] nums = {12  8  15};", "int[] nums = {12, 8, 15}", "int[] nums = {12, 8, 15};"},
            {"1", "5", "6", "12"},
            {"Array", "Dummy", "Element", "Primitive"},
            {"Box", "Field", "Area", "Block"},
            {"Validating", "Using", "Checking", "Searching"},
            {"Sorted", "Passed", "Received", "Stored"},
            {"And", "Or", "Not", "If"},
            {"true", "false", "null", "elements in a string array are not initialized"},
            {"integers", "floating point numbers", "boolean values", "objects"},
            {"length", "size", "rank", "noRows"}
    };

    //This part includes the correct answer for all 50 questions.
    char[] answers = 	{
            'C',
            'B',
            'C',
            'C',
            'A',
            'C',
            'C',
            'A',
            'A',
            'C',

            'A',
            'B',
            'D',
            'B',
            'C',
            'B',
            'B',
            'B',
            'D',
            'D',

            'D',
            'C',
            'B',
            'C',
            'A',
            'C',
            'C',
            'D',
            'A',
            'C',

            'A',
            'A',
            'B',
            'B',
            'B',
            'B',
            'D',
            'A',
            'A',
            'B',

            'D',
            'C',
            'D',
            'C',
            'D',
            'C',
            'D',
            'C',
            'D',
            'A'
    };
    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = 10;		//	The value 10 represent number of questions need to be answered
    int result;
    int seconds=10;                 // the value 10 represent the time allocated for each question.
    int num = 0;
    int[] randomNumber = new int[10];

    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            if(seconds<=0) {
                displayAnswer();
            }
        }
    });

    public Quiz(String userID) {

        // ------------------------------- Below code is to randomize the quiz questions and only select 10 questions.

        Random generateRandNum = new Random();

        Set<Integer>set = new LinkedHashSet<Integer>();

        while (set.size() < 10) {   //The value is set as such since the quiz only have 10 MCQ Questions
            set.add(generateRandNum.nextInt(49));
        }

        for(int str : set) {
            randomNumber[num] = str;
            num++;
        }

        // ------------------------------- Above Code is to randomize the quiz questions and only select 10 questions.

        //-------------------------------- GUI Implementation for quiz questions

        //GUI for Border Pane
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(799,652);
        frame.getContentPane().setBackground(Color.BLACK);
        //frame.getContentPane().setBackground(new Color(50,50,50));
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);


        //GUI for Title Column
        textfield.setBounds(0,0,783,51);
        textfield.setBackground(new Color(38,63,115));
        textfield.setForeground(Color.WHITE);
        textfield.setFont(new Font("Tahoma",Font.BOLD,30));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        //GUI for Question Column
        textarea.setBounds(19,59,743,104);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(30,144,255));
        textarea.setForeground(Color.WHITE);
        textarea.setFont(new Font("Dialog", Font.BOLD, 22));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        //GUI for Option 1
        buttonA.setBounds(19,178,70,70);
        buttonA.setFont(new Font("BANGERS",Font.BOLD,35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setBackground(new Color(0,255,255));
        buttonA.setText("A");

        //GUI for Option 2
        buttonB.setBounds(19,256,70,70);
        buttonB.setFont(new Font("BANGERS",Font.BOLD,35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setBackground(new Color(0,255,255));
        buttonB.setText("B");

        //GUI for Option 3
        buttonC.setBounds(19,335,70,70);
        buttonC.setFont(new Font("BANGERS",Font.BOLD,35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setBackground(new Color(0,255,255));
        buttonC.setText("C");

        //GUI for Option 4
        buttonD.setBounds(19,413,70,70);
        buttonD.setFont(new Font("BANGERS",Font.BOLD,35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setBackground(new Color(0,255,255));
        buttonD.setText("D");

        //GUI for Label 1
        answer_labelA.setBounds(99,178,663,70);
        answer_labelA.setBackground(new Color(50,50,50));
        answer_labelA.setForeground(new Color(25,255,0));
        answer_labelA.setFont(new Font("Dialog", Font.PLAIN, 20));

        //GUI for Label 2
        answer_labelB.setBounds(99,254,663,70);
        answer_labelB.setBackground(new Color(50,50,50));
        answer_labelB.setForeground(new Color(25,255,0));
        answer_labelB.setFont(new Font("Dialog", Font.PLAIN, 20));

        //GUI for Label 3
        answer_labelC.setBounds(99,335,663,70);
        answer_labelC.setBackground(new Color(50,50,50));
        answer_labelC.setForeground(new Color(25,255,0));
        answer_labelC.setFont(new Font("Dialog", Font.PLAIN, 20));

        //GUI for Label 4
        answer_labelD.setBounds(99,413,663,70);
        answer_labelD.setBackground(new Color(50,50,50));
        answer_labelD.setForeground(new Color(25,255,0));
        answer_labelD.setFont(new Font("Dialog", Font.PLAIN, 20));

        seconds_left.setBounds(713,545,60,57);
        seconds_left.setBackground(new Color(25,25,25));
        seconds_left.setForeground(new Color(255,0,0));
        seconds_left.setFont(new Font("Dialog", Font.BOLD, 40));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(713,513,60,21);
        time_label.setBackground(new Color(50,50,50));
        time_label.setForeground(new Color(255,0,0));
        time_label.setFont(new Font("Dialog", Font.PLAIN, 14));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("Timer");

        number_right.setBounds(225,225,200,100);
        number_right.setBackground(new Color(30,144,255));
        number_right.setForeground(new Color(25,255,0));
        number_right.setFont(new Font("Ink Free",Font.BOLD,50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225,325,200,100);
        percentage.setBackground(new Color(30,144,255));
        percentage.setForeground(new Color(25,255,0));
        percentage.setFont(new Font("Ink Free",Font.BOLD,50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.getContentPane().add(time_label);
        frame.getContentPane().add(seconds_left);
        frame.getContentPane().add(answer_labelA);
        frame.getContentPane().add(answer_labelB);
        frame.getContentPane().add(answer_labelC);
        frame.getContentPane().add(answer_labelD);
        frame.getContentPane().add(buttonA);
        frame.getContentPane().add(buttonB);
        frame.getContentPane().add(buttonC);
        frame.getContentPane().add(buttonD);
        frame.getContentPane().add(textarea);
        frame.getContentPane().add(textfield);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(30,144,255));
        panel.setBounds(-1, 50, 784, 113);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {

        if(index >= 10) {
            results();
        }
        else {
            textfield.setText("Question "+(index+1));
            textarea.setText(questions[randomNumber[index]]);
            answer_labelA.setText(options[randomNumber[index]][0]);
            answer_labelB.setText(options[randomNumber[index]][1]);
            answer_labelC.setText(options[randomNumber[index]][2]);
            answer_labelD.setText(options[randomNumber[index]][3]);
            timer.start();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(e.getSource()==buttonA) {
            answer= 'A';
            if(answer == answers[randomNumber[index]]) {
                correct_guesses++;
            }
        }
        if(e.getSource()==buttonB) {
            answer= 'B';
            if(answer == answers[randomNumber[index]]) {
                correct_guesses++;
            }
        }
        if(e.getSource()==buttonC) {
            answer= 'C';
            if(answer == answers[randomNumber[index]]) {
                correct_guesses++;
            }
        }
        if(e.getSource()==buttonD) {
            answer= 'D';
            if(answer == answers[randomNumber[index]]) {
                correct_guesses++;
            }
        }
        displayAnswer();
    }
    public void displayAnswer() {

        timer.stop();

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(answers[randomNumber[index]] != 'A')
            answer_labelA.setForeground(new Color(255,0,0));
        if(answers[randomNumber[index]] != 'B')
            answer_labelB.setForeground(new Color(255,0,0));
        if(answers[randomNumber[index]] != 'C')
            answer_labelC.setForeground(new Color(255,0,0));
        if(answers[randomNumber[index]] != 'D')
            answer_labelD.setForeground(new Color(255,0,0));

        Timer pause = new Timer(2000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                answer_labelA.setForeground(new Color(25,255,0));
                answer_labelB.setForeground(new Color(25,255,0));
                answer_labelC.setForeground(new Color(25,255,0));
                answer_labelD.setForeground(new Color(25,255,0));

                answer = ' ';
                seconds = 10;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                nextQuestion();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }
    public void results(){

        buttonA.setEnabled(true);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        result = (int)((correct_guesses/(double)total_questions)*100);

        textfield.setText("RESULTS!");
        textarea.setText("");
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

        number_right.setText("("+correct_guesses+"/" + total_questions + ")");
        percentage.setText(result+"%");

        frame.getContentPane().add(number_right);
        frame.getContentPane().add(percentage);

    }
}