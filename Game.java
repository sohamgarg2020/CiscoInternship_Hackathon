import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

import javax.swing.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.*;

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
    private static Avatar player;
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
                player = new Avatar(null);
                //logIn();
                play();
            }
        });
    }

    public static void play(){
        Scanner myObj = new Scanner(System.in);
        resources();
        String number;
        while (true){
            System.out.println("Type 1 if you want to get started or type 2 if you want the instructions again. Type 3 if you want to quit the program.");
            number = myObj.nextLine();
            if (number.equals("1")){
                Scanner myOb = new Scanner(System.in);
                System.out.println("Hello and welcome to the game! What is your name?");
                String name = myOb.nextLine();
                System.out.println("Let's get started!");
        
                player.setName(name);
                questions();
            } else if (number.equals("2")){
                resources();
                continue;
            } else if (number.equals("3")){
                System.exit(0);
            } else {
                continue;
            }
        }
        
    }

    public static void resources(){
        System.out.println("Here are some resources for you to learn Python:");
        System.out.println("https://www.python.org/");
        System.out.println("https://www.w3schools.com/python/default.asp");
        System.out.println("https://www.codecademy.com/");
        System.out.println("");
    }
    public static void questions(){
        int coins = player.getCoins();;

        JSONParser parser = new JSONParser();
        try {
            Scanner myOb = new Scanner(System.in);
            Object obj = parser.parse(new FileReader("./questions.json"));
            
            JSONObject jsonObject = (JSONObject)obj;
            String difficulty;
            if (coins < 50){
                difficulty = "Easy";
            } else if (50 < coins && coins < 100){
                difficulty = "Medium";
            } else {
                difficulty = "Hard";
            }
            JSONArray questions = (JSONArray)jsonObject.get(difficulty);
            Random rand = new Random();
            int upperbound = 9;
            int questionNumber = rand.nextInt(upperbound);
            JSONObject questionvalue = (JSONObject)questions.get(questionNumber);
            String aquestion = (String)questionvalue.get("Question");
            System.out.println(aquestion);
            String d = (String)questionvalue.get("Correct Answer");
            JSONObject wrong = (JSONObject)questionvalue.get("Wrong Answers");
            String c = (String)wrong.get("Wrong Answer 1");
            String b = (String)wrong.get("Wrong Answer 2");
            String a = (String)wrong.get("Wrong Answer 3");
            String explanation = (String)questionvalue.get("Explanation");

            upperbound = 4;
            int first;
            first = rand.nextInt(upperbound);
            int second = first;
            while (second == first){
                second = rand.nextInt(upperbound);
            }
            int third = second;
            while (third == second || third == first){
                third = rand.nextInt(upperbound);
            }
            int fourth = 6-first - second - third;
            first+=1;
            second+=1;
            third+=1;
            fourth += 1;
            
            

            String number;
            while (true){
                character(first, a, b, c, d);
                character(second, a, b, c, d);
                character(third, a, b, c, d);
                character(fourth, a, b, c, d);
                System.out.println("E) Quit");
                System.out.println("Choose one option.");
                number = myOb.nextLine();
                if (number.equals("A")){
                    if (first == 4){
                        System.out.println("Good Job! That is the correct answer!");
                        player.setCoins(player.getCoins()+10);
                    } else {
                        System.out.println("That is the wrong answer!");
                        if (player.getCoins() == 0){
                            player.setCoins(0);
                        } else {
                            player.setCoins(player.getCoins()-10);
                        }
                    }
                    System.out.println("You now have " + player.getCoins() + " points.");
                    System.out.println("Here is an explanation:");
                    System.out.println(explanation);
                    questions();
                } else if (number.equals("B")){
                    if (second == 4){
                        System.out.println("Good Job! That is the correct answer!");
                        player.setCoins(player.getCoins()+10);
                    } else {
                        System.out.println("That is the wrong answer!");
                        if (player.getCoins() == 0){
                            player.setCoins(0);
                        } else {
                            player.setCoins(player.getCoins()-10);
                        }
                    }
                    System.out.println("You now have " + player.getCoins() + " points.");
                    System.out.println("Here is an explanation:");
                    System.out.println(explanation);
                    questions();
                } else if (number.equals("C")){
                    if (third == 4){
                        System.out.println("Good Job! That is the correct answer!");
                        player.setCoins(player.getCoins()+10);
                    } else {
                        System.out.println("That is the wrong answer!");
                        if (player.getCoins() == 0){
                            player.setCoins(0);
                        } else {
                            player.setCoins(player.getCoins()-10);
                        }
                    }
                    System.out.println("You now have " + player.getCoins() + " points.");
                    System.out.println("Here is an explanation:");
                    System.out.println(explanation);
                    questions();
                } else if (number.equals("D")){
                    if (fourth == 4){
                        System.out.println("Good Job! That is the correct answer!");
                        player.setCoins(player.getCoins()+10);
                    } else {
                        System.out.println("That is the wrong answer!");
                        if (player.getCoins() == 0){
                            player.setCoins(0);
                        } else {
                            player.setCoins(player.getCoins()-10);
                        }
                    }
                    System.out.println("You now have " + player.getCoins() + " points.");
                    System.out.println("Here is an explanation:");
                    System.out.println(explanation);
                    questions();
                } else if (number.equals("E")){
                    System.out.println("We hope you had a fun time playing the game!");
                    System.exit(0);
                } else {
                    continue;
                }
            }
            

            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void character(int num, String a, String b, String c, String d){
        if (num == 1){
            System.out.println("A) " + a);
        }
        if (num == 2){
            System.out.println("B)" + b);
        }
        if (num == 3){
            System.out.println("C)" + c);
        }
        else{
            System.out.println("D)" + d);
        }
        
    }
}