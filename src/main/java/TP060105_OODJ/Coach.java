/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP060105_OODJ;

import java.io.*;
/**
 *
 * @author Ahmed
 */
public class Coach {
     public String Name, Date, Hour, Sport;
     private String  Address, Contact;
     private int ID;
     public int Rating;
    public Coach(int ID, String Name, String Date, String HourRate, String Address, String Sport, String PhNumber, int Rating) {
        this.Name = Name;
        this.Date = Date;
        this.Hour = HourRate;
        this.Sport = Sport;
        this.Address = Address;
        this.Contact = PhNumber;
        this.ID = ID;
        this.Rating = Rating;
    }
     public void WritetoFile(){
        FileWriter fw;
        BufferedWriter bw;
        BufferedReader br;
     try {
        fw = new FileWriter("CoachRecords.txt", true);
        bw = new BufferedWriter(fw);
        br = new BufferedReader(new FileReader("CoachRecords.txt"));
        while (br.readLine() != null){
            ID++;
        }
        bw.write("ID: CH"+String.valueOf(ID)+" | Name: "+Name+" // Date Joined: "+Date+" // Hourly Pay Rate: "+Hour+" // Address: "+Address+" // Phone: "+Contact+" | Sport: "+Sport+" // Coach Rating: "+Rating+" |\n");
        bw.close();
        br.close();
    } 
    catch (Exception e) {
        e.printStackTrace();
        }   
    }
    public int getID(){
        return ID;
    }
}


    

