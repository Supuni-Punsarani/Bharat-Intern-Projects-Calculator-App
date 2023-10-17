/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author S.PUNSARANI
 */
public class CalculatorApplication implements ActionListener {
    
        double num1=0,num2=0,result=0;
        int calculation;
        
        JFrame frame=new JFrame("Calculator");
        JLabel label=new JLabel();
        JTextField textField=new JTextField();
        JRadioButton onRadioButton=new JRadioButton("On");
        JRadioButton offRadioButton=new JRadioButton("Off");
        JButton buttonzero=new JButton("0");
        JButton buttonone=new JButton("1");
        JButton buttontwo=new JButton("2");
        JButton buttonthree=new JButton("3");
        JButton buttonfour=new JButton("4");
        JButton buttonfive=new JButton("5");
        JButton buttonsix=new JButton("6");
        JButton buttonseven=new JButton("7");
        JButton buttoneight=new JButton("8");
        JButton buttonnine=new JButton("9");
        JButton buttondot=new JButton(".");
        JButton buttonclear=new JButton("C");
        JButton buttondelete=new JButton("DEL");
        JButton buttonequal=new JButton("=");
        JButton buttonmul=new JButton("*");
        JButton buttondiv=new JButton("/");
        JButton buttonplus=new JButton("+");
        JButton buttonminus=new JButton("-");
        JButton buttonsquare=new JButton("x\u00B2");
        JButton buttonreciprocal=new JButton("1/x");
        JButton buttonsqrt=new JButton("\u221A");
        
        
        
        
        CalculatorApplication(){
            prepareGui();
            addComponents();
            addActionEvent();
        }
        
     public void prepareGui(){
         frame.setSize(305,510);
         frame.getContentPane().setLayout(null);
         frame.getContentPane().setBackground(Color.black);
         frame.setLocationRelativeTo(null);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     
     public void addComponents(){
         label.setBounds(250,0,50,50);
         label.setForeground(Color.white);
         frame.add(label);
         
         textField.setBounds(10,40,270,40);
         textField.setFont(new Font("Arial",Font.BOLD,20));
         textField.setEditable(false);
         textField.setHorizontalAlignment(SwingConstants.RIGHT);
         frame.add(textField);
         
         onRadioButton.setBounds(10,95,60,40);
         onRadioButton.setSelected(true);
         onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
         onRadioButton.setBackground(Color.black);
         onRadioButton.setForeground(Color.white);
         onRadioButton.setFocusable(false);
         frame.add(onRadioButton);
         
         offRadioButton.setBounds(10,120,60,40);
         offRadioButton.setSelected(false);
         offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
         offRadioButton.setBackground(Color.black);
         offRadioButton.setForeground(Color.white);
         offRadioButton.setFocusable(false);
         frame.add(offRadioButton);
         
         ButtonGroup buttonGroup =new ButtonGroup();
         buttonGroup.add(onRadioButton);
         buttonGroup.add(offRadioButton);
         
         
         buttonseven.setBounds(10,230,60,40);
         buttonseven.setFont(new Font("Arial",Font.BOLD,20));
         buttonseven.setFocusable(false);
         frame.add(buttonseven);
         
         buttoneight.setBounds(80,230,60,40);
         buttoneight.setFont(new Font("Arial",Font.BOLD,20));
         buttoneight.setFocusable(false);
         frame.add(buttoneight);
         
         buttonnine.setBounds(150,230,60,40);
         buttonnine.setFont(new Font("Arial",Font.BOLD,20));
         buttonnine.setFocusable(false);
         frame.add(buttonnine);
         
         buttonfour.setBounds(10,290,60,40);
         buttonfour.setFont(new Font("Arial",Font.BOLD,20));
         buttonfour.setFocusable(false);
         frame.add(buttonfour);
         
         buttonfive.setBounds(80,290,60,40);
         buttonfive.setFont(new Font("Arial",Font.BOLD,20));
         buttonfive.setFocusable(false);
         frame.add(buttonfive);
         
         buttonsix.setBounds(150,290,60,40);
         buttonsix.setFont(new Font("Arial",Font.BOLD,20));
         buttonsix.setFocusable(false);
         frame.add(buttonsix);
         
         buttonone.setBounds(10,350,60,40);
         buttonone.setFont(new Font("Arial",Font.BOLD,20));
         buttonone.setFocusable(false);
         frame.add(buttonone);
         
         buttontwo.setBounds(80,350,60,40);
         buttontwo.setFont(new Font("Arial",Font.BOLD,20));
         buttontwo.setFocusable(false);
         frame.add(buttontwo);
         
         buttonthree.setBounds(150,350,60,40);
         buttonthree.setFont(new Font("Arial",Font.BOLD,20));
         buttonthree.setFocusable(false);
         frame.add(buttonthree);
         
         buttondot.setBounds(150,410,60,40);
         buttondot.setFont(new Font("Arial",Font.BOLD,20));
         buttondot.setFocusable(false);
         frame.add(buttondot);
         
         buttonzero.setBounds(10,410,130,40);
         buttonzero.setFont(new Font("Arial",Font.BOLD,20));
         buttonzero.setFocusable(false);
         frame.add(buttonzero);
         
         buttonequal.setBounds(220,350,60,100);
         buttonequal.setFont(new Font("Arial",Font.BOLD,20));
         buttonequal.setBackground(new Color(239,188,2));
         buttonequal.setFocusable(false);
         frame.add(buttonequal);
         
         buttondiv.setBounds(220,110,60,100);
         buttondiv.setFont(new Font("Arial",Font.BOLD,20));
         buttondiv.setBackground(new Color(239,188,2));
         buttondiv.setFocusable(false);
         frame.add(buttondiv);
         
         buttonsqrt.setBounds(10,170,60,40);
         buttonsqrt.setFont(new Font("Arial",Font.BOLD,20));
         buttonsqrt.setFocusable(false);
         frame.add(buttonsqrt);
         
         buttonmul.setBounds(220,230,60,40);
         buttonmul.setFont(new Font("Arial",Font.BOLD,20));
         buttonmul.setBackground(new Color(239,188,2));
         buttonmul.setFocusable(false);
         frame.add(buttonmul);
         
         buttonminus.setBounds(220,170,60,40);
         buttonminus.setFont(new Font("Arial",Font.BOLD,20));
         buttonminus.setBackground(new Color(239,188,2));
         buttonminus.setFocusable(false);
         frame.add(buttonminus);
         
         buttonplus.setBounds(220,290,60,40);
         buttonplus.setFont(new Font("Arial",Font.BOLD,20));
         buttonplus.setBackground(new Color(239,188,2));
         buttonplus.setFocusable(false);
         frame.add(buttonplus);
         
         buttonsquare.setBounds(80,170,60,40);
         buttonsquare.setFont(new Font("Arial",Font.BOLD,20));
         buttonsquare.setFocusable(false);
         frame.add(buttonsquare);
         
         buttonreciprocal.setBounds(150,170,60,40);
         buttonreciprocal.setFont(new Font("Arial",Font.BOLD,15));
         buttonreciprocal.setFocusable(false);
         frame.add(buttonreciprocal);
         
         buttondelete.setBounds(150,110,60,40);
         buttondelete.setFont(new Font("Arial",Font.BOLD,12));
         buttondelete.setBackground(Color.red);
         buttondelete.setForeground(Color.white);
         buttondelete.setFocusable(false);
         frame.add(buttondelete);
         
         buttonclear.setBounds(80,110,60,40);
         buttonclear.setFont(new Font("Arial",Font.BOLD,12));
         buttonclear.setBackground(Color.red);
         buttonclear.setForeground(Color.white);
         buttonclear.setFocusable(false);
         frame.add(buttonclear);
         
         
     }
     
    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonclear.addActionListener(this);
        buttondelete.addActionListener(this);
        buttondiv.addActionListener(this);
        buttonsqrt.addActionListener(this);
        buttonsquare.addActionListener(this);
        buttonreciprocal.addActionListener(this);
        buttonminus.addActionListener(this);
        buttonseven.addActionListener(this);
        buttoneight.addActionListener(this);
        buttonnine.addActionListener(this);
        buttonmul.addActionListener(this);
        buttonfour.addActionListener(this);
        buttonfive.addActionListener(this);
        buttonsix.addActionListener(this);
        buttonplus.addActionListener(this);
        buttonone.addActionListener(this);
        buttontwo.addActionListener(this);
        buttonthree.addActionListener(this);
        buttonequal.addActionListener(this);
        buttonzero.addActionListener(this);
        buttondot.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
        CalculatorApplication calculator=new CalculatorApplication();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==onRadioButton){
            enable();
        }else if(source==offRadioButton){
            disable();
        }else if(source==buttonclear){
            label.setText("");
            textField.setText("");
        }else if(source==buttondelete){
             int length=textField.getText().length();
             int number=length-1;
             if(length>0){
                 StringBuilder back=new StringBuilder(textField.getText());
                 back.deleteCharAt(number);
                 textField.setText(back.toString());
                 
             }if(textField.getText().endsWith(""));
             label.setText("");
        }else if(source==buttonzero){
            if(textField.getText().equals("0")){
                return;
            }else{
                textField.setText(textField.getText()+"0");
            }
        }else if(source==buttonone){
             textField.setText(textField.getText()+"1");
        }else if(source==buttontwo){
             textField.setText(textField.getText()+"2");
        }else if(source==buttonthree){
             textField.setText(textField.getText()+"3");
        }else if(source==buttonfour){
             textField.setText(textField.getText()+"4");
        }else if(source==buttonfive){
             textField.setText(textField.getText()+"5");
        }else if(source==buttonsix){
             textField.setText(textField.getText()+"6");
        }else if(source==buttonseven){
             textField.setText(textField.getText()+"7");
        }else if(source==buttoneight){
             textField.setText(textField.getText()+"8");
        }else if(source==buttonnine){
             textField.setText(textField.getText()+"9");
        }else if(source==buttondot){
              if(textField.getText().contains(".")){
                  return; 
              }else{
                  textField.setText(textField.getText()+".");
              }
        }else if(source==buttonplus){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=1;
            textField.setText("");
            label.setText(str +"+");
        }else if(source==buttonminus){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=2;
            textField.setText("");
            label.setText(str +"-");
        }else if(source==buttonmul){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=3;
            textField.setText("");
            label.setText(str +"*");
        }else if(source==buttondiv){
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=4;
            textField.setText("");
            label.setText(str +"/");
        }else if(source==buttonsquare){
            num1=Double.parseDouble(textField.getText());
            double square=Math.pow(num1,2);
            String string=Double.toString(square);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }else{
                 textField.setText(string);
            }
        }else if(source==buttonsqrt){
            num1=Double.parseDouble(textField.getText());
            double sqrt=Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        }else if(source==buttonreciprocal){
            num1=Double.parseDouble(textField.getText());
            double reciprocal = 1/num1;
            String string=Double.toString(reciprocal);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }else{
                 textField.setText(string);
            }
        }else if(source==buttonequal){
            num2=Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
                    
            }if(Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));
            }else{
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;
        }
    }
    
    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonclear.setEnabled(true);
        buttondelete.setEnabled(true);
        buttondiv.setEnabled(true);
        buttonsqrt.setEnabled(true);
        buttonsquare.setEnabled(true);
        buttonreciprocal.setEnabled(true);
        buttonminus.setEnabled(true);
        buttonseven.setEnabled(true);
        buttoneight.setEnabled(true);
        buttonnine.setEnabled(true);
        buttonmul.setEnabled(true);
        buttonfour.setEnabled(true);
        buttonfive.setEnabled(true);
        buttonsix.setEnabled(true);
        buttonplus.setEnabled(true);
        buttonone.setEnabled(true);
        buttontwo.setEnabled(true);
        buttonthree.setEnabled(true);
        buttonequal.setEnabled(true);
        buttonzero.setEnabled(true);
        buttondot.setEnabled(true);
        
}
    
 public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        buttonclear.setEnabled(false);
        buttondelete.setEnabled(false);
        buttondiv.setEnabled(false);
        buttonsqrt.setEnabled(false);
        buttonsquare.setEnabled(false);
        buttonreciprocal.setEnabled(false);
        buttonminus.setEnabled(false);
        buttonseven.setEnabled(false);
        buttoneight.setEnabled(false);
        buttonnine.setEnabled(false);
        buttonmul.setEnabled(false);
        buttonfour.setEnabled(false);
        buttonfive.setEnabled(false);
        buttonsix.setEnabled(false);
        buttonplus.setEnabled(false);
        buttonone.setEnabled(false);
        buttontwo.setEnabled(false);
        buttonthree.setEnabled(false);
        buttonequal.setEnabled(false);
        buttonzero.setEnabled(false);
        buttondot.setEnabled(false);
 }
}

