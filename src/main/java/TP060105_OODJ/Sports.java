/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP060105_OODJ;

import java.io.*;

public class Sports {
    public String Name, Centre, Fee;
    public int ID;
    
    public Sports(int ID, String Name, String Centre, String Fee) {
        this.Name = Name;
        this.Centre = Centre;
        this.ID = ID;
        this.Fee = Fee;
    }
    public void WritetoFile(){
        FileWriter fw; 
        BufferedWriter bw;
        BufferedReader br;
        try {
            fw = new FileWriter("SportRecords.txt", true);
            bw = new BufferedWriter(fw);
            br = new BufferedReader(new FileReader("SportRecords.txt"));
            while (br.readLine() != null){
                        ID++;
            }
            bw.write("ID: SP"+String.valueOf(ID)+" // Name: "+Name+" // Centre: "+Centre+" // Fee: " +Fee+" //\n");
            bw.close();
            br.close();  
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getID(){
        return ID;
    }
}
