import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

class SignUp extends JFrame {
    JLabel lab1,lab2,lab3,lab4;
    JTextField t1, t2,t3,t4;
    JButton b1;

    SignUp() {
        setLayout(null);
        setTitle("Registration From");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,500);
        setResizable(false);
        getContentPane().setBackground(Color.YELLOW);

        lab1 =new JLabel("Name     :");
        lab1.setBounds(20,20,80,30);
        add(lab1);

        lab2 =new JLabel("Password :");
        lab2.setBounds(20,60,80,30);
        add(lab2);

        lab3 =new JLabel("Email     :");
        lab3.setBounds(20,100,80,30);
        add(lab3);

        lab4 =new JLabel("Mobile     :");
        lab4.setBounds(20,140,80,30);
        add(lab4);



        t1 = new JTextField(60);
        t2 = new JPasswordField(60);
        b1 = new JButton("Submit");
        b1.setForeground(Color.red);
        b1.setBackground(Color.DARK_GRAY);
        t3 = new JTextField(60);
        t4 = new JTextField(60);


        t1.setBounds(150, 20, 200, 30);
        t2.setBounds(150, 60, 200, 30);
        b1.setBounds(150, 220, 200, 30);
        t3.setBounds(150,100,200,30);
        t4.setBounds(150,140,200,30);

        add(t1);
        add(t2);
        add(b1);
        add(t3);
        add(t4);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    FileWriter fw =new FileWriter("login.txt",true);
                    fw.write(t1.getText()+"\t"+t2.getText()+"\n");
                    fw.close();
                    JFrame f=new JFrame();
                    JOptionPane.showMessageDialog(f,"Registration Completed");
                    dispose();
                }catch (Exception ea){}
            }
        });

    }
}
class Login extends JFrame{
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l1,l2,l3;
    Login() {
        setLayout(null);
        setTitle("LOGIN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);


        l1 = new JLabel("Login");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 39));
        l1.setForeground(Color.BLUE);
        l1.setBounds(170, 10, 300, 35);

        l2=new JLabel("User Name :");
        l3=new JLabel("Password  :");

        t1 = new JTextField(60);
        t2 = new JPasswordField(60);
        b1 = new JButton("Sign in ");
        b1.setForeground(Color.red);
        b1.setBackground(Color.DARK_GRAY);
        b2 = new JButton("Sign Up");
        b2.setForeground(Color.red);
        b2.setBackground(Color.DARK_GRAY);

        t1.setBounds(150, 60, 200, 30);
        t2.setBounds(150, 100, 200, 30);
        b1.setBounds(170, 150, 80, 30);
        b2.setBounds(170,200,80,30);
        l2.setBounds(20,60,80,30);
        l3.setBounds(20,100,80,30);

        add(t1);
        add(t2);
        add(b1);
        add(l1);
        add(b2);
        add(l2);
        add(l3);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean matched=false;
                String str;
                String uname=t1.getText().toString();
                String pwd=t2.getText().toString();
                try {
                    FileReader fr = new FileReader("login.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    while ((str = br.readLine()) != null) {
                        if (str.equals(uname + "\t" + pwd)) {
                            matched = true;
                            break;
                        }

                    }
                    fr.close();
                }catch (Exception ae){}
                if(matched){
                    Terms t=new Terms();

                }
                else{
                    JFrame k=new JFrame();
                    JOptionPane.showMessageDialog(k,"Incorrect UserName and password");
                    dispose();
                }
            }
        });



        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUp s=new SignUp();
                s.setVisible(true);
                s.setBounds(200,200,500,300);
            }
        });
    }
}



public class logindemo {
    public static void main(String[] args) {
        Login l = new Login();
        l.setBounds(400, 200, 500, 300);
        l.setVisible(true);
    }
}


