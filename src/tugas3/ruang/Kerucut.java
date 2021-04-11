/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nama    : Prudenca Ahmad Daffa K.
   NIM : 123190005
 */
package tugas3.ruang;
public class Kerucut implements MenghitungRuang {
    
    private float jariJari,phi,tinggi; 

    public Kerucut(float jariJari, float phi, float tinggi) {
        this.jariJari = jariJari;
        this.phi = phi;
        this.tinggi = tinggi;
    }

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public float getPhi() {
        return phi;
    }

    public void setPhi(float phi) {
        this.phi = phi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
       return (phi*jariJari*jariJari*tinggi)/3;
    }

    @Override
    public double luasPermukaan() {
        float s;
        s = (float) Math.sqrt(Math.pow(jariJari,2) + Math.pow(tinggi,2));
      return phi*jariJari*(jariJari+s);
    }
    
    public void tampilkan(){
     System.out.println("VOLUME KERUCUT\t\t : " + volume());
     System.out.println("LUAS PERMUKAAN KERUCUT\t : " + luasPermukaan());   
    }
}
