package kasir;

import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
   
public class Tanggal_otomatis{  
   
    String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
       
  
} 

   
   
    

