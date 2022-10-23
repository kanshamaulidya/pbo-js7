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
public class Laptop extends Komputer {
    private String jnsBatrei;
    
    public Laptop(){
        
    }
    public Laptop(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatrei){
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBatrei=jnsBatrei;
    }
    public String getJnsBatrei(){
        return jnsBatrei;
    }
    public void setJnsBatrei(String jnsBatrei){
        this.jnsBatrei=jnsBatrei;
    }
    public void tampilLaptop(){
        super.tampilKomputer();
        System.out.println("Jenis Batrei : " +getJnsBatrei());
    }
}
