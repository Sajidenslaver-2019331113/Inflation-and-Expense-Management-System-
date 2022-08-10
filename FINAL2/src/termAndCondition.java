import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Terms extends JFrame{
    JLabel j1,j2,j3,j4,j5,j6,j7;
    JButton b1;
    Terms(){
        setLayout(null);
        setVisible(true);
        setTitle("Terms and Conditions");
        setSize(800,600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        j1=new JLabel("How do we protect personal information?");
        j1.setBounds(50,50,250,25);
        add(j1);

        j2=new JLabel("- We maintain technical and physical safeguards designed to protect the personal information");
        j2.setBounds(50,80,600,25);
        add(j2);

        j3=new JLabel("we collect through our services against accidental, unlawful or unauthorized destruction, loss, alteration,");
        j3.setBounds(50,110,600,25);
        add(j3);

        j4=new JLabel("access, disclosure or use.");
        j4.setBounds(50,140,600,25);
        add(j4);

        j5=new JLabel("Our technical safeguards include implementing, maintaining of privacy and information security policies and");
        j5.setBounds(50,170,600,25);
        add(j5);

        j6=new JLabel("procedures. Our physical safeguards include maintaining physical secuirity policies and standards to protect ");
        j6.setBounds(50,200,600,25);
        add(j6);

        j7=new JLabel("the apps systems and data by our creators of this app.,");
        j7.setBounds(50,230,600,25);
        add(j7);

        b1 = new JButton("Agree");
        b1.setForeground(Color.red);
        b1.setBackground(Color.DARK_GRAY);
        b1.setBounds(250,350,100,25);
        add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Myframe framee=new Myframe();
            }
        });



    }
}

public class termAndCondition {
    public static void main(String[] args) {
        Terms t=new Terms();


    }

}
