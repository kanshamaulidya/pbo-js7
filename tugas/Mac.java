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
public class Mac extends Laptop {
    private String security;
    
    public Mac(){
        
    }
    public Mac(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrei, String security){
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatrei);
        this.security=security;
    }
    public String getSecurity(){
        return security;
    }
    public void setSecurity(String security){
        this.security=security;
    }
    public void tampilMac(){
        System.out.println("-----MAC-----");
        super.tampilLaptop();
        System.out.println("Security : " +getSecurity());
    }
}
