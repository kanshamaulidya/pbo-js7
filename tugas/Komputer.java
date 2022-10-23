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
public class Komputer {
    private String merk;
    private int kecProcessor;
    private int sizeMemory;
    private String jnsProcessor;
    
    public Komputer(){
        
    }
    public Komputer(String merk, int kecProcessor, int sizeMemory, String jnsProcessor){
        this.merk=merk;
        this.kecProcessor=kecProcessor;
        this.sizeMemory=sizeMemory;
        this.jnsProcessor=jnsProcessor;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public int getKecProcessor(){
        return kecProcessor;
    }
    public void setKecProcessor(int kecProcessor){
        this.kecProcessor=kecProcessor;
    }
    public int getSizeMemory(){
        return sizeMemory;
    }
    public void setSizeMemory(int sizeMemory){
        this.sizeMemory=sizeMemory;
    }
    public String getJnsProcessor(){
        return jnsProcessor;
    }
    public void setJnsProcessor(String jnsProcessor){
        this.jnsProcessor=jnsProcessor;
    }
    public void tampilKomputer(){
        System.out.println("Merk : " +getMerk());
        System.out.println("Kecepatan Processor : " +getKecProcessor()+ " Ghz");
        System.out.println("Size Memory : " +getSizeMemory() +" GB");
        System.out.println("Jenis Processor : " +getJnsProcessor());
    }
}
