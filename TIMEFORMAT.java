import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timein = in.next();
        int meridian=0;
        if(timein.indexOf("AM") != -1)
             meridian = 0;
        if(timein.indexOf("PM")!=-1)
             meridian = 12;
         int totalsec =0;
         int totalmin = 0;
         int totalhour = 0;
         int hour = Integer.valueOf(timein.substring(0,2));
         int min  = Integer.valueOf(timein.substring(3,5));
         int sec  = Integer.valueOf(timein.substring(6,8));
         //totalsec = hour*60*60+min*60+sec;
         //sec = totalsec%60;
         //totalmin= totalsec/60;
         //min = totalmin%60;
         //totalhour = totalmin/60;
          if(meridian == 0)
         hour= (hour +meridian)%12;
        else 
         hour= (hour +meridian)%24;
         String hour_repr = (hour>9)?String.valueOf(hour):"0"+String.valueOf(hour);
         String min_repr = (min>9)?String.valueOf(min):"0"+String.valueOf(min);
         String sec_repr = (sec>9)?String.valueOf(sec):"0"+String.valueOf(sec);
         System.out.println(""+hour_repr+":"+min_repr+":"+sec_repr);
        
         
        
         
         
        
        
        
        
        
        
    }
}