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
package tugas3.bidang;
public class Lingkaran implements MenghitungBidang {

     private float jariJari,phi;

    public Lingkaran(float jariJari, float phi) {
        this.jariJari = jariJari;
        this.phi = phi;
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
    
    @Override
    public double luas() {
       System.out.println("LUAS LINGKARAN\t\t : " + luas(jariJari));
       return 0;
    }
    public double luas(float jariJari){
        return phi*jariJari*jariJari;
    }
    @Override
    public double keliling() {
        System.out.println("KELILING LINGKARAN\t : " + keliling(jariJari));
       return 0;
    }
    public double keliling(float jariJari) {
       return 2*phi*jariJari;
    }
    
}
