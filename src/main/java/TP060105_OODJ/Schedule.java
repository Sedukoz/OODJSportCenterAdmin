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

public class Schedule {
    public String Schedule;
    public int ID;
    private String Student;

    public Schedule(int ID, String Schedule, String Student) {
        this.Schedule = Schedule;
        this.Student = Student;
        this.ID=ID;
    }
    public void WritetoFile(){
        FileWriter fw;
        BufferedWriter bw;
        BufferedReader br;
        try{
               fw = new FileWriter("ScheduleRecords.txt", true);
               br = new BufferedReader(new FileReader("ScheduleRecords.txt"));
               while (br.readLine() != null){
                   ID++;
               }
               bw = new BufferedWriter(fw);
               bw.write("ID: SC"+ID+" // Schedule: "+Schedule+" // StudentID: "+Student+" //\n");
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
