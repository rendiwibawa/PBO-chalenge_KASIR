package kasir;
import java.util.Scanner;
public class Kasir {
 private int size;
 private int harga;
 private int jumlah;
 private int uang;
 private int uk;
 Scanner ren = new Scanner(System.in);
 public Kasir (int size,int harga,int jumlah){  
this.size=size;
this.harga=harga;
this.jumlah=jumlah; 
 }
 
 public void print(){
     System.out.println("=============GEBYAR 10 NOVEMBER================");
     System.out.println("-=BELI 2 merek yg sama potongan 50.000 +kupon");
     System.out.println("-=BELI >2 merek yg sama potongan 100.000 +kupon");
     System.out.println("===============================================");
   }
   public void jumlahbeli(){
 
    System.out.println("        =====SIZE=====");
    System.out.println("=========MASUKKAN SIZE========");
    uk=ren.nextInt();
     System.out.println("Masukkan jmlah beli");
     jumlah=ren.nextInt();
     
     if(jumlah==1){if(uk<=25){ harga=100000;System.out.println("Total : Rp.100.000\n__________Harga _________\n-=Harga :"+harga);}
   else{if(uk<=30){ harga=250000;System.out.println("Total : Rp.250.000\n__________Harga_________\n-=Harga :"+harga);}}
   if(uk>=31){ harga=900000;System.out.println("Total : Rp.900.000\n__________Harga_________\n-=Harga :"+harga);}}
     
     else{if(jumlah==2){if(uk<=25){ harga=2*100000-50000;System.out.println("Total : Rp.100.000 x 2 =200.000\nDiskon : 200.000 - 50.000 \n__________Harga Diskon_________\n-=Harga :"+harga);}
   else{if(uk<=30){ harga=2*250000-50000;System.out.println("Total : Rp.250.000 x 2 =500.000\n Diskon : 500.000 - 50.000\n__________Harga Diskon_________\n-=Harga :"+harga);}}
   if(uk>=31){ harga=2*900000-50000;System.out.println("Total : Rp.900.000 x 2 =1.800.000\n Diskon : 1.800.000 - 50.000\n__________Harga Diskon_________\n-=Harga :"+harga);}}
     
     else{if(jumlah>=3){if(uk<=25){harga=jumlah*100000-100000;System.out.println("Harga : Rp.100.000 * "+jumlah+"\nDiskon : 100.000\n__________Harga Diskon_________\n-=Harga :"+harga);}
   else{if(uk<=30){harga=jumlah*250000-100000;System.out.println("Harga : Rp.250.000 * "+jumlah+"\nDiskon : 100.000\n__________Harga Diskon_________\n-=Harga :"+harga);}}
   if(uk>=31){ harga=jumlah*900000-100000;System.out.println("Harga : Rp.900.000 * "+jumlah+"\nDiskon : 100.000\n__________Harga Diskon_________\n-=Harga :"+harga);
   
   }}}}}    

    public void kembalian (){
        int kembalian;
        
      System.out.println("--===MASSUKAN UANG ANDA===--");
      uang=ren.nextInt();
      kembalian= uang-harga;
        System.out.println("--------------------------------------");
        System.out.println("-=Kembalian : Rp."+kembalian);
        System.out.println("--------------------------------------\n");
        System.out.println("             ---------------               ");
        System.out.println("             ---------------               ");
        System.out.println("             ---------------               ");
        System.out.println("             ---------------               ");
        System.out.println("             ---------------               ");
        System.out.println("             ---------------               ");
        System.out.println("        -------------------------          ");
        System.out.println("          ---------------------              ");
        System.out.println("            ----------------               ");
        System.out.println("              -------------               ");
        System.out.println("                ---------               ");
        System.out.println("                  ------               ");
         System.out.println("                   --              ");
         
         
        System.out.println("\n\n=====================================");
            System.out.println("=     -----JAYA BARU STORE-----     =");
            Tanggal_otomatis tanggal = new Tanggal_otomatis();
            System.out.println("=Tanggal:"+tanggal.getTanggal()+"                  ");
            System.out.println("=Waktu\t"+tanggal.getWaktu()+"                  ");
            System.out.println("=Alamat\t:Jl.jalan-jalan di jalan No.404");
            System.out.println("=====================================");
            System.out.println("-=Jumlah            : "+jumlah);
            System.out.println("-=Ukuran            : "+uk);
            System.out.println("-=Harga             : "+harga);
            System.out.println("-=Pembayaran        : "+uang);
            System.out.println("-=Kembalian         : "+kembalian);
        
        
}
    public void Undian(){
        if(jumlah >1){
            System.out.println("=====================================");
            System.out.println("><><><><><><><><><><><><><><><><><><>");
            System.out.println("= Gunting di sini untuk mendapatkan ="); 
            System.out.println("=     undian setiap pembelian   =");
            System.out.println("=   Sepatu lebih adari 1 pasang     =");
            System.out.println("=    NO Hp:...................      =");
            System.out.println("><><><><><><><><><><><><><><><><><><>");
        }
    }
   
}

