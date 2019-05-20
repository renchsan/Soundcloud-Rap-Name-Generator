package com.rencher.rapnamegenerator;

import java.util.Random;

public class namegenerator {
    private static String[] Beginning = { "Lil " , "lil ", "Gang ", "White ", "Old ",
            "Yung ", "XXX", "Smoke" , "Ugly ", "Nasty ", "Big ", "21", "Lean ", "Polo", "Rich"};
    private static String[] Middle = { "Air", "Tril", "Gang", "Ghost", "Sip", "Clo",
            "Red", "Mask", "Pump", "Gat", "Murder", "Lock", "Cree", "Mur", "Zed", "Slime",
            "Kid", "Boy", "Skee", "Purp", "Daddy", " Rich", "Lean", "Famous"};
    private static String[] End = { "D", "baby", "trigger", "juice",
            "tron", "med", "jay", "sticky", "mane", "mur", "weed", "candy", " Choppa"," WRLD",
            "homie"," Jesus", "cloud"};

    private static Random rand = new Random();

    public static String generateName(int totalNames) {
        String names = "";
        String newName;
        String prevName = "";
        for (int i = 0; i < totalNames; i++){
            newName = Beginning[rand.nextInt(Beginning.length)]+
                    Middle[rand.nextInt(Middle.length)]+
                    End[rand.nextInt(End.length)];
            if(!(prevName.equals(newName))) {
                names += newName;
                names += "\n";
            }
            prevName = newName;
        }
        return names;
    }
}