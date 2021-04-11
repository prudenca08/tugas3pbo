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
public class Balok implements MenghitungRuang {

    private int panjang,lebar,tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double luasPermukaan() {
       return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
      
    public void tampilkan(){
        System.out.println("VOLUME BALOK\t\t : " + volume());
        System.out.println("LUAS PERMUKAAN BALOK\t : " + luasPermukaan());
    }
}
