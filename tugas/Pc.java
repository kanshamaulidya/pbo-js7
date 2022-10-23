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
public class Pc extends Komputer {
    private int sizeMonitor;
    
    
    public Pc(){
        
    }
    public Pc(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, int sizeMonitor){
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.sizeMonitor=sizeMonitor;
    }
    public int getSizeMonitor(){
        return sizeMonitor;
    }
    public void setSizeMonitor(int sizeMonitor){
        this.sizeMonitor=sizeMonitor;
    }
    public void tampilPc(){
        System.out.println("=====PC=====");
        super.tampilKomputer();
        System.out.println("Size Monitor : "+getSizeMonitor());
    }
}
