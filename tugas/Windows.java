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
public class Windows extends Laptop {
    private String fitur;
    
    public Windows(){
        
    }
    public Windows(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrei, String fitur){
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatrei);
        this.fitur=fitur;
    }
    public String getFitur(){
        return fitur;
    }
    public void setFitur(String fitur){
        this.fitur=fitur;
    }
    public void tampilWindows(){
        System.out.println("-----WINDOWS-----");
        super.tampilLaptop();
        System.out.println("Fitur : " +getFitur());
        
    }
}
