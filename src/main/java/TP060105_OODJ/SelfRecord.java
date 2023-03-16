/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP060105_OODJ;

import java.io.*;
import java.util.*;
/**
 *
 * @author Ahmed
 */
public class SelfRecord {
    public String user;

    public SelfRecord(String user) {
        this.user = user;
    }
    public void SelfRecordTemp(){
        try {
            Scanner file = new Scanner(new File("StudentInfo.txt"));
            while(file.hasNextLine()){
                final String lineFromFile = file.nextLine();
                    if (lineFromFile.contains(user)){
                    try {
                        FileWriter fw = new FileWriter("Temp.txt");
                        fw.write(lineFromFile);
                        fw.close();
                    } 
                    catch (IOException e) {
                         e.printStackTrace();
                    }
                }   
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
class SelfSchedule extends SelfRecord{    
        public SelfSchedule(String user) {
            super(user);
        }
    public void SelfScheduleTemp(){
    try{
        String line;
        BufferedReader br;
        StringBuffer sr;
        br = new BufferedReader(new FileReader("ScheduleInfo.txt"));
        sr = new StringBuffer();
        while ((line = br.readLine()) != null) {
            if (line.contains(user)){
            sr.append(line);
            sr.append('\n');
            }
        }
        br.close();
        FileOutputStream fileOut = new FileOutputStream("Temp2.txt");
        fileOut.write(sr.toString().getBytes());
        fileOut.close();
        }
    catch(Exception e) {
        e.printStackTrace();
        }
    }
}


