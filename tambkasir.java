package kasir;
import java.util.Scanner;
public class tambkasir extends Kasir
{
   public tambkasir(int size,int harga,int jumlah) {
        super(size, harga, jumlah);   
    }
   Scanner ren=new Scanner(System.in);
    int pilihan;
    int uk;
    int harga;
    String jenis;
    String kategori;
    String merek;
    String warna;
public String merek(){
    System.out.println("[1] Adidas\n[2] Nike\n[3] Skechers\n[4] Puma\n[5] Reebok\n[6] Vans\n[7] Converse\n[8] Fila");
    System.out.println("=========SILAHKAN MASSUKAN========");
    pilihan=ren.nextInt();
    
    switch(pilihan){
    case 1:merek ="Adidas";break;
    case 2:merek ="Nike";break;
    case 3:merek ="Skechers";break;    
    case 4:merek ="Puma";break;
    case 5:merek ="Reebok";break;
    case 6:merek ="Vans";break;
    case 7:merek ="Converse";break;
    case 8:merek ="Fila";break;
    }  
    return merek;  
}
public String jenis(){
        System.out.println("===Jenis sepatu=== \n[1] Cowok\n[2] Cewek. ");
        System.out.println("=========SILAHKAN MASSUKAN========");
    pilihan=ren.nextInt();
    if(pilihan==1){jenis ="cowok";  
    }else{if(pilihan==2){jenis ="cewek";}
    
    }return jenis;
}
public String warna(){
        System.out.println("=====WARNA=====\n[1] black\n[2] white\n[3] gold\n[4] silver\n[5] orange\n[6] green\n[7] yellow\n[8] blue\n[9] red ");
    System.out.println("=========SILAHKAN MASSUKAN========");
    pilihan=ren.nextInt();
    switch(pilihan){
case 1:warna ="black";
case 2:warna ="white";
case 3:warna ="gold";
case 4:warna ="silver";
case 5:warna ="orange";
case 6:warna ="green";
case 7:warna ="yellow";
case 8:warna ="blue";
case 9:warna ="red";
    }
       return warna;
}

public String kategori (){
    
  System.out.println("\nKami menjual berbagai macam sepatu:)");
  System.out.println("-=Massukan kategori sepatu:\n[1] olahraga\n[2] lari\n[3] santai\n[4] kantoran. \n=========SILAHKAN MASSUKAN========");
   pilihan=ren.nextInt();
   switch(pilihan){
        case 1:kategori ="olahraga";
        case 2:kategori ="lari";
        case 3:kategori ="santai";
        case 4:kategori ="kantoran";
                            
   }
        return kategori;
}
 
}
    
    
    
        
   
   
    
    
    

