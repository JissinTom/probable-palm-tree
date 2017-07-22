import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
class First extends Frame implements ActionListener
{

    public TextField  tf;
    First()
    {
        Label l1,s1,s2,s3,s4,s5;
        l1= new Label("rank list creater");
        l1.setBounds(50,150, 100,30);
        s1=new Label("student 1");
        s1.setBounds(5,1, 1,30);
        s2=new Label("student 2");
        s2.setBounds(50,15, 10,30);
        s3=new Label("student 3");
        s3.setBounds(50,1, 10,30);
        s4=new Label("student 4");
        s4.setBounds(50,1, 10,30);
        s5=new Label("student 5");
        s5.setBounds(50,150, 10,30);
        tf = new TextField();
    tf.setBounds(60, 50, 170, 20);
    Button b = new Button("create rank list");
    b.setBounds(30, 100, 80, 30);// setting button position
    b.addActionListener(this);
        add(l1);
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);

        add(b);//adding button into frame
    add(tf);
    setSize(300, 300);//frame size 300 width and 300 height
    setLayout(null);//no layout manager
    setVisible(true);//now frame will be visible, by default not visible
}
public void actionPerformed(ActionEvent e)
{
    tf.setText("wlecome");

    }
    public static void main(String args[]){
        First f=new First();
    }}