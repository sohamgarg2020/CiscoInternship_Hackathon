import java.io.*;
import java.util.*;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;

public class Game {

    private static JFrame frame;
    private static JPanel panel;
    private static JButton returning;
    private static JButton newuser;
    public static void main(String[] args){
        Game g = new Game();
        setupBoard();


    }

    public static void setupBoard(){
        frame = new JFrame();
        panel = new JPanel();

        frame.setVisible(true);
        frame.setSize(900, 700);
        frame.setTitle("Game");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        returning = new JButton("Login");
        newuser = new JButton("Register");
        returning.setBounds(100, 350, 300, 200);
        newuser.setBounds(500, 350, 300, 200);
        panel.add(returning);
        panel.add(newuser);


        
    }
}