import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class student
{
    String name;
    int m;

}

class rank extends Frame implements ActionListener
{
    class student
    {
        String name;
        int m;
        student()
        {
            name=" ";
            m=0;
        }

    }

    student[] r =new student[4];
  //  student temp=new student[];


    Label s1,s2,s3,s4,s5;TextField t11,t12,t13,t21,t22,t23,t31,t32,t33,t41,t42,t43,t51,t52,t53;Button b;

    rank()
    {

        s1=new Label("s1");
        t11=new TextField(20);
        t12=new TextField(20);
        t13=new TextField(20);

        s2=new Label("s2");
        t21=new TextField(20);
        t22=new TextField(20);
        t23=new TextField(20);

        s3=new Label("s3");
        t31=new TextField(20);
        t32=new TextField(20);
        t33=new TextField(20);

        b=new Button("calculate");
        s4=new Label(" ");


        s1.setBounds(150,40,100,40);
        t11.setBounds(150,80,100,40);
        t11.setBounds(150,140,100,40);
        t11.setBounds(150,180,100,40);

        s2.setBounds(150,400,100,40);
        t21.setBounds(150,500,100,40);
        t22.setBounds(150,600,100,40);
        t23.setBounds(150,700,100,40);

        s3.setBounds(150,800,100,40);
        t31.setBounds(150,900,100,40);
        t32.setBounds(150,1000,100,40);
        t33.setBounds(150,1100,100,40);
        s4.setBounds(150,1300,100,40);
        b.setBounds(150,1250,100,40);

        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(s1);
        add(t11);
        add(t12);add(t13);
        add(s2);
        add(t21);add(t22);add(t23);
        add(s3);
        add(t31);add(t32);add(t33);
        add(b);
        add(s4);
        setVisible(true);
        setSize(400,400);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for ( int i=0; i<4; i++)
        {
            r[i]=new student();
        }
        //temp=new student();
        r[0].name="s1";
        r[1].name="s2";
        r[2].name="s3";

        String s11 = t11.getText();
        String s12 = t12.getText();
        String s13 = t13.getText();

        String s21 = t21.getText();
        String s22 = t22.getText();
        String s23 = t23.getText();

        String s31 = t31.getText();
        String s32 = t32.getText();
        String s33 = t33.getText();


        //int m[]=new int[3];

        r[0].m = Integer.parseInt(s11);
        r[0].m += Integer.parseInt(s12);
        r[0].m += Integer.parseInt(s13);


        r[1].m = Integer.parseInt(s21);
        r[1].m += Integer.parseInt(s22);
        r[1].m += Integer.parseInt(s23);


        r[2].m = Integer.parseInt(s31);
        r[2].m += Integer.parseInt(s32);
        r[2].m += Integer.parseInt(s33);

        int n = 3;
        //int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(r[j-1].m > r[j].m){
                    //swap elements
                    r[3] = r[j-1];
                    r[j-1] = r[j];
                    r[j] = r[3];
                }

            }
        }
//s4.setText(Integer.toString(r[2].m)+Integer.toString(r[1].m)+Integer.toString(r[0].m));
        s4.setText("the ranklist is:"+r[2].name+" ,"+r[1].name+" ,"+r[0].name);


    }

    public static  void main(String[] args)
    {

        rank r=new rank();

    }
}