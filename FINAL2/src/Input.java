//package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

class Myframe extends JFrame implements ActionListener {

    JLabel label1,label2,label3,label4,label5,label6;
    JTextField t1,t2,t3,t4,t5,t6;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JTextArea screen;


    Myframe(){
        setTitle("ANALYSIS FORM");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        Container c=getContentPane();
        c.setLayout(null);
//        setUndecorated(true);
        setResizable(false);


        label1=new JLabel("Income : ");
        label1.setBounds(20,50,100,20);
        c.add(label1);
        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        label2=new JLabel("Rice needed : ");
        label2.setBounds(20,100,100,20);
        c.add(label2);
        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        label3=new JLabel("Lentil needed : ");
        label3.setBounds(20,150,100,20);
        c.add(label3);
        t3=new JTextField();
        t3.setBounds(130,150,100,20);
        c.add(t3);

        label4=new JLabel("House Rent : ");
        label4.setBounds(20,200,100,20);
        c.add(label4);
        t4=new JTextField();
        t4.setBounds(130,200,100,20);
        c.add(t4);

        label5=new JLabel("Eggs needed : ");
        label5.setBounds(20,250,100,20);
        c.add(label5);
        t5=new JTextField();
        t5.setBounds(130,250,100,20);
        c.add(t5);

        label6=new JLabel("Oil needed : ");
        label6.setBounds(20,300,100,20);
        c.add(label6);
        t6=new JTextField();
        t6.setBounds(130,300,100,20);
        c.add(t6);

        terms=new JCheckBox("Please accect terms and conditions");
        terms.setBounds(50,350,250,20);
        c.add(terms);

        submit=new JButton("Submit");
        submit.setBounds(150,400,80,20);
        c.add(submit);
        submit.addActionListener(this);
        submit.setBackground(Color.PINK);

        screen=new JTextArea();
        screen.setBounds(350,50,300,300);
        c.add(screen);

        msg=new JLabel("");
        msg.setBounds(20,350,250,20);
        c.add(msg);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (terms.isSelected()) {
            msg.setText("input Successful!!");
            String Income=t1.getText();
            String Rice=t2.getText();
            String Lentil=t3.getText();
            String HouseRent=t4.getText();
            String Egg=t5.getText();
            String Oil=t6.getText();
            Integer res=Integer.parseInt(Rice)*65+Integer.parseInt(Lentil)*110+Integer.parseInt(HouseRent)+Integer.parseInt(Egg)*12+Integer.parseInt(Oil)*130;
            Fetch fetch=new Fetch();
            System.out.println("Rate " + fetch.ftc);
            //TODO fetcting data from website
            Double finalRes=res*fetch.ftc+res;
            Integer income=Integer.parseInt(Income);
            if(finalRes>income){
                screen.setText("TOTAL INCOME="+Income+"\n"+"TOTAL COST(WITHOUT INFLATION)="+res+"\n"+"TOTAL COST(WITH INFLATION)="+finalRes+"\n"+"LOW ON BUDGET"+" "+(finalRes-income));
            }
            else if(income>finalRes){
                screen.setText("TOTAL INCOME="+Income+"\n"+"TOTAL COST(WITHOUT INFLATION)="+res+"\n"+"TOTAL COST(WITH INFLATION)="+finalRes+"\n"+"YOU CAN SAVE"+" "+(income-finalRes));
            }



        }

    }
}

class Input{
    public static void main(String[] args) {

        Myframe framee=new Myframe();

    }
}
