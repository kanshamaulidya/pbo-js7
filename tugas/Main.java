/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        Pc pc = new Pc("Asus", 3, 128, "Intel Core i7", 17);
        pc.tampilPc();
        
        Mac mac = new Mac("Apple", 2, 64, "Intel Core i5", "Li-ion","T2");
        mac.tampilMac();
        
        Windows w = new Windows("HP", 1, 64, "Intel Core i5", "Li-ion polymer","Security lock slot");
        w.tampilWindows();
        
    }
}
