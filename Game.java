import java.io.*;
import java.util.*;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;

public class Game{

    private static JFrame frame1;
    private static JPanel panel1;
    private static JButton returning;
    private static JButton newuser;
    public static void main(String[] args){
        Game g = new Game();
        setupBoard();


    }

    public static void setupBoard(){
        frame1 = new JFrame();
        panel1 = new JPanel();

        frame1.setVisible(true);
        frame1.setSize(900, 700);
        frame1.setTitle("Game");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.add(panel1);
        returning = new JButton("Returning User");
        newuser = new JButton("New User");
        returning.setBounds(100, 350, 300, 200);
        newuser.setBounds(500, 350, 300, 200);
        panel1.add(returning);
        panel1.add(newuser);
        returning.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame1.setVisible(false);
                //logIn();
            }
        });
    }

    // public static void logIn(){

    //     JPanel panel2 = new JPanel();
    //     JFrame frame2 = new JFrame();
    //     frame2.setSize(350, 200);
    //     frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     frame2.setVisible(true);
    //     frame2.add(panel2);

    //     panel2.setLayout(null);

    //     JLabel userLabel = new JLabel("User");
    //     userLabel.setBounds(10, 20, 80, 25);
    //     panel2.add(userLabel);

    //     JTextField userText = new JTextField(20);
    //     userText.setBounds(100, 20, 165, 25);
    //     panel2.add(userText);

    //     JLabel passwordLabel = new JLabel("Password");
    //     passwordLabel.setBounds(10, 50, 80, 25);
    //     panel2.add(passwordLabel);

    //     JPasswordField passwordText = new JPasswordField(20);
    //     passwordLabel.setBounds(100, 50, 165, 25);
    //     panel2.add(passwordText);

    //     JButton button = new JButton("Login");
    //     button.setBounds(10, 80, 80, 25);
    //     panel2.add(button);

    //     JLabel success = new JLabel("");
    //     success.setBounds(10, 110, 300, 25);
    //     panel2.add(success);

    //     button.addActionListener(new ActionListener(){
    //         public void actionPerformed(ActionEvent e){
    //             String user = userText.getText();
    //             String password = passwordText.getText();

    //             if (user.equals("Soham") && password.equals("testing")){
    //                 frame2.setVisible(false);
    //             } else {
    //                 passwordText.setText("");
    //                 success.setText("Wrong Username or Password.");
    //             }

    //         }
    //     });

    // }
}