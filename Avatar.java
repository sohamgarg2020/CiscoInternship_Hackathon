import java.util.*;

public class Avatar {
    private int coins = 0; // Number of coins they have
    private String name = ""; // Player Name
    private int questionsAnsweredRight = 0; // Number of Questions They Answered Right
    private final int maxHealth = 100; // Cannot go above this health
    private int health = 0; // Health they will have currently.
    private String difficulty = ""; // Has three options: easy, medium, hard. Easy = less than 200 questions for
    // questionsAnsweredRight. Medium = more than or equal to 200 less than 500. Hard = more than or equal to 500.
    private Location loc; // This will give you a location based on the avatar
    private boolean npc; // Will let the user know if this is a NPC or not

    public Avatar(String n, Location l, boolean object){ // Constructor
        coins = 0;
        name = n;
        health = 100;
        difficulty = "easy";
        loc = l;
        npc = object;
    }

    

}