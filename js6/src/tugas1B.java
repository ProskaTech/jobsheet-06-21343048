/*
 * Nama : Ghenta Alif Alde
 * NIM  : 21343048
 * Prodi: Teknik Informatika
 */

import javax.swing.JOptionPane;

public class tugas1B {
public static void main(String [] args) {
    String a = JOptionPane.showInputDialog("Masukkan nilai pertama anda :");
    String b = JOptionPane.showInputDialog("Masukkan nilai kedua anda :");
    String c = JOptionPane.showInputDialog("Masukkan nilai ketiga anda :");

    int num1 = Integer.parseInt(a); 
    int num2 = Integer.parseInt(b); 
    int num3 = Integer.parseInt(c);
    
    int rumus=(num1 + num2 + num3) / 3; 
        
if 
    (rumus <= 60) {
        String msg1 = ":-(";
        JOptionPane.showMessageDialog(null, msg1);
 }
 else {
    String msg2 = ":-)";
    JOptionPane.showMessageDialog(null, msg2);
}
}    
}