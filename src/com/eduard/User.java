package com.eduard;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;
import java.util.Scanner;

public class User{
    private static int id;
    private String userName;
    private String password;
    private int privilege;//0-user, 1-admin
    private Properties users;

    public User(String userName, String password, int privilege) {
        id++;
        this.userName = userName;
        this.password = password;
        this.privilege = privilege;
    }
    public User()
    {
        id++;
        userName="";
        password="";
        privilege=0;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", privilege=" + privilege +
                '}';
    }

    public void create_user()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Admin? (y/n)");
        String c=sc.next();
        System.out.println("Username? ");
        this.userName=sc.next();
        System.out.println("Password? ");
        this.password=sc.next();

    }

    public boolean isAdmin()
    {
        if(this.privilege==1)
            return true;
        return false;
    }

    public void login()
    {
        JFrame frame;
        JTextField textField1,textField2,aux;
        JButton loginB,CreateNew;
        JPasswordField pass;
        JLabel loginText;
        frame= new JFrame("OnlineShop");
        loginText= new JLabel("Login"); loginText.setBounds(20,20,150,20);
        aux=new JTextField();aux.setBounds(0,0,0,0);
        textField1=new JTextField("Username"); textField1.setBounds(20,50,250,20);
        pass=new JPasswordField("Password"); pass.setBounds(20,80,250,20);
        pass.setEchoChar((char)0);
        loginB= new JButton("Login"); loginB.setBounds(20, 110, 120,20);
        CreateNew=new JButton("Create account"); CreateNew.setBounds(150,110,120,20);
        frame.add(textField1);
        //frame.add(textField2);

        frame.add(pass);
        frame.add(loginB);
        frame.add(CreateNew);
        frame.add(loginText);
        frame.add(aux);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1.setText("");
            }
        });
        pass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pass.setText("");
                pass.setEchoChar('*');
            }
        });
        loginB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username= textField1.getText();
                String password=String.valueOf(pass.getPassword());
                System.out.println(username);
                System.out.println(password);
            }
        });

    }
}
