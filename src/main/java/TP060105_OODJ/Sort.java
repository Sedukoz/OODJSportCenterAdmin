/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP060105_OODJ;
/**
 *
 * @author Ahmed
 */
public class Sort{
    public static String getSortName(String n) {
        int start = n.indexOf("| Name:") + 1;
        int end = n.indexOf("|", start);
        return n.substring(start, end);
    }
     public static String getSortRating(String r) {
        int start = r.indexOf("| Ratings:") + 1;
        int end = r.indexOf("|", start);
        return r.substring(start, end);
    }
     public static String getSortPay(String p) {
        int start = p.indexOf("| Hourly Pay Rate:") + 1;
        int end = p.indexOf("|", start);
        return p.substring(start, end);
     }
} 


    
