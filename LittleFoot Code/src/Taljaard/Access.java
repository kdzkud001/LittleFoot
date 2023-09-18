/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taljaard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 27649
 */
public class Access {
    
    private String[] arrHelp = new String[10];
    private String[] arrTip = new String[16];
    private String[] arrChallenges = new String[16];
    
    //method used to seperate challenges into individual lines
    public String challengeInfo(int index)
    {
        String challenges = "";
        try {
            //Format: number#name#explanation#tip#pointDaily#pointTotalPossible;
            Scanner sT = new Scanner (new File("Challenges.txt"));
            while (sT.hasNextLine()) {
                challenges += sT.nextLine();
            }
            //contains entire line, divided by tip, seperated via ';'
            String arrC[] = challenges.split(";");
        } catch (FileNotFoundException ex) {
            System.out.println("Challenge file not found");
        }
               return arrChallenges[index--];
    }
    
    public String tips(String inArrC)
    {
        String arrT[] = inArrC.split("#");
        return arrT[3];
    }
    
    public String name(String inArrC)
    {
        String arrTip[] = inArrC.split("#");
        return arrTip[1];
    }
    
    public int dailyPoints(String inArrC, int challengeNum)
    {
        String arrCh[] = challengeInfo(challengeNum - 1).split("#");
        return Integer.parseInt(arrCh[4]);
    }
    
//    public String name(String inArrC)
//    {
//        String arrTip[] = inArrC.split("#");
//        return arrTip[0];
//    }
    
    public String accessHelp()
    {
        String help = "";
               return help;
    }
    
    //method reads information from background text file to be used in background tab
    public static String accessBackground()
    {
        String b = "";
        try {
            Scanner sc = new Scanner(new File("Background.txt")).useDelimiter(" ");
            while (sc.hasNext()) {
                b = b + " " + sc.next();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Background file not found");
        }
        
               return b;
    }
    
    public String challengeTips()
    {
        String tip = "";
               return tip;
    }
}
