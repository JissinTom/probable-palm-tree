import java.awt.*;
import java.awt.event.*;
public class rank extends Frame implements ActionListener{
    TextField t1,t2;Label l;Button b;
    rank()
    {
        t1=new TextField();
        t1.setBounds(50,50, 150,20);
        t2=new TextField();
        t2.setBounds(50,50, 150,20);
        l=new Label();
        l.setBounds(50,100, 250,20);
        b=new Button("calculate!");
        b.setBounds(50,150,250,60);

        b.addActionListener(this);
        add(b);add(t1);add(l);add(t2);
        setSize(700,700);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        String a=t1.getText();
        String b=t2.getText();
        int result = Integer.parseInt(a);
         result += Integer.parseInt(b);
         l.setText("result");
    }
    public static void main(String[] args) {
        new rank();
    }
}
