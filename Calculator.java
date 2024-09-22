
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.ActionEvent;

public class Calculator extends Frame implements ActionListener{
    TextField t1=new TextField();
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,ba,bs,bm,be,bp,bper,bc,br;
    // virtual calculator
    Calculator(){
        // button declaring
        {
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        bd=new Button("/");
        bm=new Button("*");
        ba=new Button("+");
        be=new Button("=");
        bs=new Button("-");
        bc=new Button("C");
        bp=new Button(".");
        br=new Button("<-");
        bper=new Button("%");
        }
        // setting bounds for button
        {
        // display box    
        t1.setBounds(50,50,230,50);
        //line 1
        bd.setBounds(50,110,50,50);
        bm.setBounds(110,110,50,50);
        bs.setBounds(170,110,50,50);
        br.setBounds(230,110,50,50);
        //line2
        b7.setBounds(50,170,50,50);
        b8.setBounds(110,170,50,50);
        b9.setBounds(170,170,50,50);
        ba.setBounds(230,170,50,110);
        //line 3
        b4.setBounds(50,230,50,50);
        b5.setBounds(110,230,50,50);
        b6.setBounds(170,230,50,50);
        //line 4
        b1.setBounds(50,290,50,50);
        b2.setBounds(110,290,50,50);
        b3.setBounds(170,290,50,50);
        be.setBounds(230,290,50,110);
        //line 5
        bc.setBounds(50,350,50,50);
        b0.setBounds(110,350,50,50);
        bp.setBounds(170,350,50,50);
        }
        //CLASS OBJECTS
        //ACTION LISTENERS
        {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bc.addActionListener(this);
        be.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bd.addActionListener(this);
        bm.addActionListener(this);
        bp.addActionListener(this);
        br.addActionListener(this);
        bper.addActionListener(this);
        }
        // adding the buttons to frame
        {
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(ba);
        add(bs);
        add(bm);
        add(bd);
        add(be);
        add(bp);
        add(bc);
        add(br);
        add(bper);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });
        setSize(320,450);
        setLayout(null);
        setVisible(true);
    }
    }
    public void actionPerformed(ActionEvent e)
    {
        //display output 
        {
        if(e.getSource()==b0){
             String exp=t1.getText();
                exp+="0";
                t1.setText(exp);
        }
        if(e.getSource()==b1){
             String exp=t1.getText();
                exp+="1";
                t1.setText(exp);
        }
        if(e.getSource()==b2){
             String exp=t1.getText();
                exp+="2";
                t1.setText(exp);
        }
        if(e.getSource()==b3){
             String exp=t1.getText();
                exp+="3";
                t1.setText(exp);
        }
        if(e.getSource()==b4){
             String exp=t1.getText();
                exp+="4";
                t1.setText(exp);
        }
        if(e.getSource()==b5){
             String exp=t1.getText();
                exp+="5";
                t1.setText(exp);
        }
        if(e.getSource()==b6){
             String exp=t1.getText();
                exp+="6";
                t1.setText(exp);
        }
        if(e.getSource()==b7){
             String exp=t1.getText();
                exp+="7";
                t1.setText(exp);
        }
        if(e.getSource()==b8){
             String exp=t1.getText();
                exp+="8";
                t1.setText(exp);
        }
        if(e.getSource()==b9){
             String exp=t1.getText();
                exp+="9";
                t1.setText(exp);
        }
        if(e.getSource()==ba){
             String exp=t1.getText();
                exp+="+";
                t1.setText(exp);
        }
        if(e.getSource()==bs){
             String exp=t1.getText();
                exp+="-";
                
                t1.setText(exp);
        }
        if(e.getSource()==bm){
             String exp=t1.getText();
                exp+="*";
                t1.setText(exp);
        }
        if(e.getSource()==bd){
             String exp=t1.getText();
                exp+="/";
                
                t1.setText(exp);
        }
        if(e.getSource()==bp){
             String exp=t1.getText();
                exp+=".";
                t1.setText(exp);
        }
        if(e.getSource()==bc){
             
                t1.setText("");
        }
        if(e.getSource()==be){
                String exp=t1.getText();         
                double ans=answer(exp);
                t1.setText(Double.toString(ans));
        }
        if(e.getSource()==br){
            String exp=t1.getText();
            String exp1=exp.substring(0,(exp.length()-1));
            t1.setText(exp1);
        }
        }
        // end of display output
    }
    // main
    public static void main(String[] args) {
        new Calculator();
    }
    // decimal addition 
    static int ten(int i)  {
        // System.out.println("ten");
        if(i==0){
            return 10;
        }
        else{
            
            i--;
            return ten(i)*10;
        }
    }
    // answer generator
    static double answer(String a)
    {   
        // number generator
        
        // System.out.println(a);
        int len=a.length();
        double n1[]=new double[100];
        int j=0,va=0;
        boolean decimal=true;
        for(int i=0;i<len;i++)
        {
            if(a.charAt(i)=='.'){
                decimal=false;
                continue;
            }
            
            if(a.charAt(i)>='0'&&a.charAt(i)<='9'&&decimal==true)
            {
                n1[j]=n1[j]*10+Character.getNumericValue(a.charAt(i));
                
            }
            else if(a.charAt(i)>='0'&&a.charAt(i)<='9'&&decimal==false)
            {   
                double point=(double) Character.getNumericValue(a.charAt(i))/ten(va++);
                n1[j]=n1[j]+point;
                // System.out.println(point);
                
            }
            else{
                j++;
            }
            if(a.charAt(i)=='+'||a.charAt(i)=='-'||a.charAt(i)=='/'||a.charAt(i)=='*'||a.charAt(i)=='%'){
                decimal=true;
                
                continue;
            }
        }
        // end of number generator
        // calculation part
        int k=1;//index of array
        for(int i=0;i<len;i++)
        {
            if(a.charAt(i)=='+'){
                n1[k]+=n1[k-1];
                k++;
            }
            if(a.charAt(i)=='-'){
                n1[k]=n1[k-1]-n1[k];
                k++;
            }
            if(a.charAt(i)=='*'){
                n1[k]*=n1[k-1];
                k++;
            }
            if(a.charAt(i)=='/'){
                n1[k]=n1[k-1]/n1[k];
                k++;
            }
            
        }
        double ans=n1[k-1];
        
        return ans;
    }
    
}

    
    
    
        

