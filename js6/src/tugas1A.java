/**
 *
 * @author Ghenta Alif Alde 21343048
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;

public class tugas1A {
public static void main(String[] args) { 
  BufferedReader nilai = new BufferedReader (new InputStreamReader (System.in));
  String r=""; 
  String s=""; 
  String t="";
try{
   System.out.print("Masukan nilai pertama Anda :"); 
   r = nilai.readLine(); 
   System.out.print("Masukan nilai kedua Anda :"); 
   s = nilai.readLine(); 
   System.out.print("Masukan nilai ketiga Anda :");
   t = nilai.readLine(); 
}catch(IOException e) {
   System.out.println("Kata yang anda masukan salah, silahkan coba lagi.");
}
   int pertama; 
   int kedua; 
   int ketiga;
   pertama = Integer.parseInt(r); 
   kedua = Integer.parseInt(s); 
   ketiga = Integer.parseInt(t);
   int 
        rata_rata=(pertama+kedua+ketiga)/3; 
        System.out.println("Rata-rata nilai: "+rata_rata); 
   if 
       (rata_rata<=60) {System.out.println(":-(");
    }
    else {
        System.out.print(":-)");
    }
}
}