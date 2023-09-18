/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taljaard;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author 27649
 */
public class Competitor {

    private static String surname;
    private int numMembers;
    private char firstLetter;
    private String id;
    private LocalDate startDate;
    private static String username;
    private LocalDate endDate;
    private String password;
    private static String userName = "";
//    private boolean challenge1;
//    private boolean challenge2;
//    private boolean challenge3;
//    private boolean challenge4;
//    private boolean challenge5;
//    private boolean challenge6;
//    private boolean challenge7;
//    private boolean challenge8;
//    private boolean challenge9;
//    private boolean challenge10;
//    private boolean challenge11;
//    private boolean challenge12;
//    private boolean challenge13;
//    private boolean challenge14;
//    private boolean challenge15;
//    private boolean challenge16;
    private boolean[] arrSelectedChallenges = new boolean[10];
    private static Competitor arrCompetitors[] = new Competitor[150];
    private String[] arrChallenges = new String[10];
    private int[] arrDailyPoints = new int[14];
    private static int size = 0;
    public static DB db = new DB();

    //method attributes each competitor to the array
    public Competitor(String inID, String inSurname, char inFirst, int inNumMembers, LocalDate inStartDate, LocalDate inEndDate, String inPassword, String inUser) {
        surname = inSurname;
        numMembers = inNumMembers;
        startDate = inStartDate;
        endDate = inEndDate;
        password = inPassword;
        username = inUser;
        id = inID;
        firstLetter = inFirst;
    }
        
    public Competitor() {
        //variables necessary for compilation of a competitor object
        //id, surname, letter, surname, first, start, end, pass, user
        String id = "", sN = "", psW = "", uN = "";
        char surIn = ' ';
        int nM = 0;
        LocalDate sD, eD;
        try {
            ResultSet rs = Competitor.db.executeQuery("SELECT * FROM CompetitorRegistrationInfo");
            while (rs.next()) {
                id = rs.getString("ID");
                sN = rs.getString("Surname");
                surIn = rs.getString("SurnameFirstLetter").charAt(0);
                nM = rs.getInt("NumHouseMembers");
                sD = rs.getDate("StartingDate").toLocalDate();
                eD = rs.getDate("EndDate").toLocalDate();
                psW = rs.getString("Password");
                uN = rs.getString("Username");
                arrCompetitors[size] = new Competitor(id, sN, surIn, nM, sD, eD, psW, uN);
                size++;       
                        }
        } catch (SQLException e) {
            System.out.println("unable to submit query");
        }
    }


    //method to be called upon registration to add new candidate to database
    public static void addUser(String inSur, char first, int inMem, LocalDate inStartD, LocalDate endDate, String inPassW, String inUser) {
        
        //MaxID determines the highest ID thus far, to ensure that each new competitor receives a different ID number
        int maxID = Integer.parseInt(Competitor.db.processResultSet(Competitor.db.executeQuery("SELECT MAX(ID)\n"
                + "FROM CompetitorRegistrationInfo")));
        //creating a new object in the array for the newly added user
        arrCompetitors[size] = new Competitor(("" + maxID + 1), inSur, first, inMem, inStartD, endDate, inPassW, inUser);
    }   

    public String challengesChosen() {
        return "";
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public static String getUsername() {
        return username;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     *
     * @return
     */
    //method randomly adds adjectives to user's surname based on the first letter of their surname in order to create an alliterating username
    //method to be called upon registration of new user
    public static String createUserName(String inSur, char first) {
        //ensuring that the letter will be capital
        String adj = "";
        String letter = "";
        String last = "";
        try {
            if (inSur.charAt(inSur.length() - 1) == 's') {
                last = "";
            } else {
                last = "s";
            }
            //char surFirst = inSur.toUpperCase().charAt(0);
            String surRest = inSur.substring(1, inSur.length() - 1);
            Scanner scAdjective = new Scanner(new File("Adjectives.txt"));
            while (scAdjective.useDelimiter("\n").hasNext()) {
                letter = letter + "\n " + scAdjective.next();
            }

            String arrAdj[] = letter.split("\n");
            //arrAdj[] will have 26 values, as it has been split according to the letters of the alphabet
            switch (first) {
                case 'A':
                    String arrA[] = arrAdj[0].split("#");
                    //all 'A' words within the same line are split into individual adjectives, which happens for each letter
                    adj = arrA[(int) (Math.random() * ((arrA.length - 2) + 1))];
                    break;
                case 'B':
                    String arrB[] = arrAdj[1].split("#");
                    adj = arrB[(int) (Math.random() * ((arrB.length - 2) + 1))];
                    break;
                case 'C':
                    String arrC[] = arrAdj[2].split("#");
                    adj = arrC[(int) (Math.random() * ((arrC.length - 2) + 1))];
                    break;
                case 'D':
                    String arrD[] = arrAdj[3].split("#");
                    adj = arrD[(int) (Math.random() * ((arrD.length - 2) + 1))];
                    break;
                case 'E':
                    String arrE[] = arrAdj[4].split("#");
                    adj = arrE[(int) (Math.random() * ((arrE.length - 2) + 1))];
                    break;
                case 'F':
                    String arrF[] = arrAdj[5].split("#");
                    adj = arrF[(int) (Math.random() * ((arrF.length - 2) + 1))];
                    break;
                case 'G':
                    String arrG[] = arrAdj[6].split("#");
                    adj = arrG[(int) (Math.random() * ((arrG.length - 2) + 1))];
                    break;
                case 'H':
                    String arrH[] = arrAdj[7].split("#");
                    adj = arrH[(int) (Math.random() * ((arrH.length - 2) + 1))];
                    break;
                case 'I':
                    String arrI[] = arrAdj[8].split("#");
                    adj = arrI[(int) (Math.random() * ((arrI.length - 2) + 1))];
                    break;
                case 'J':
                    String arrJ[] = arrAdj[9].split("#");
                    adj = arrJ[(int) (Math.random() * ((arrJ.length - 2) + 1))];
                    break;
                case 'K':
                    String arrK[] = arrAdj[10].split("#");
                    adj = arrK[(int) (Math.random() * ((arrK.length - 2) + 1))];
                    break;
                case 'L':
                    String arrL[] = arrAdj[11].split("#");
                    adj = arrL[(int) (Math.random() * ((arrL.length - 2) + 1))];
                    break;
                case 'M':
                    String arrM[] = arrAdj[12].split("#");
                    adj = arrM[(int) (Math.random() * ((arrM.length - 2) + 1))];
                    break;
                case 'N':
                    String arrN[] = arrAdj[13].split("#");
                    adj = arrN[(int) (Math.random() * ((arrN.length - 2) + 1))];
                    break;
                case 'O':
                    String arrO[] = arrAdj[14].split("#");
                    adj = arrO[(int) (Math.random() * ((arrO.length - 2) + 1))];
                    break;
                case 'P':
                    String arrP[] = arrAdj[15].split("#");
                    adj = arrP[(int) (Math.random() * ((arrP.length - 2) + 1))];
                    break;
                case 'Q':
                    String arrQ[] = arrAdj[16].split("#");
                    adj = arrQ[(int) (Math.random() * ((arrQ.length - 2) + 1))];
                    break;
                case 'R':
                    String arrR[] = arrAdj[17].split("#");
                    adj = arrR[(int) (Math.random() * ((arrR.length - 2) + 1))];
                    break;
                case 'S':
                    String arrS[] = arrAdj[18].split("#");
                    adj = arrS[(int) (Math.random() * ((arrS.length - 2) + 1))];
                    break;
                case 'T':
                    String arrT[] = arrAdj[19].split("#");
                    adj = arrT[(int) (Math.random() * ((arrT.length - 2) + 1))];
                    break;
                case 'U':
                    String arrU[] = arrAdj[20].split("#");
                    adj = arrU[(int) (Math.random() * ((arrU.length - 2) + 1))];
                    break;
                case 'V':
                    String arrV[] = arrAdj[21].split("#");
                    adj = arrV[(int) (Math.random() * ((arrV.length - 2) + 1))];
                    break;
                case 'W':
                    String arrW[] = arrAdj[22].split("#");
                    adj = arrW[(int) (Math.random() * ((arrW.length - 2) + 1))];
                    break;
                case 'X':
                    String arrX[] = arrAdj[23].split("#");
                    adj = arrX[(int) (Math.random() * ((arrX.length - 2) + 1))];
                    break;
                case 'Y':
                    String arrY[] = arrAdj[24].split("#");
                    adj = arrY[(int) (Math.random() * ((arrY.length - 2) + 1))];
                    break;
                case 'Z':
                    String arrZ[] = arrAdj[25].split("#");
                    adj = arrZ[(int) (Math.random() * ((arrZ.length - 2) + 1))];
                    break;
                default:
                    break;
            }

            userName = adj + first + surRest + last;

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        //provides new username
        return userName;

    }

    public String formatChallenges() {
        return "";
    }
}
