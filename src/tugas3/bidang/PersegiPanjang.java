/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.bidang;

/**
 *
 * @author Daffa
 */
public class PersegiPanjang implements MenghitungBidang {
    
    private int panjang,lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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
    
    @Override
    public double luas() {
         System.out.println("LUAS PERSEGI PANJANG\t : " + luas(panjang,lebar));
         return 0;
    }
       public double luas(int panjang,int lebar) {
        return panjang*lebar;
    }

    @Override
    public double keliling() {
       System.out.println("KELILING PERSEGI PANJANG : " + keliling(panjang,lebar));
       return 0;
    }
     public double keliling(int panjang,int lebar) {
        return 2*(panjang+lebar);
    }
    
}
