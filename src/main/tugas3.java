/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import tugas3.bidang.Lingkaran;
import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;

/**
 *
 * @author Daffa
 */
public class tugas3 {
     public static void main(String[] args) {
         int pilih=0,panjang,lebar,tinggi,jariJari;
        Scanner input = new Scanner (System.in);
            
              while(pilih!=3){
                System.out.println("INPUT");
                System.out.println("1. BALOK");
                System.out.println("2. KERUCUT");
                System.out.println("3. EXIT");
                System.out.print("PILIH : ");
                pilih = input.nextInt();
        
            if (pilih==1) {  
                System.out.println("______OUTPUT______");
                System.out.print("PANJANG\t= "); panjang= input.nextInt();
                System.out.print("LEBAR\t= "); lebar = input.nextInt();
                System.out.print("TINGGI\t= "); tinggi = input.nextInt();
                
                PersegiPanjang  persegiPanjang = new PersegiPanjang(panjang,lebar);
                persegiPanjang.luas();
                persegiPanjang.keliling();
                
                Balok balok = new Balok(panjang,lebar,tinggi);
                balok.tampilkan();
             }
            else if (pilih==2) {
                System.out.println("______OUTPUT______");
                System.out.print("JARIJARI\t= "); jariJari= input.nextInt();
                System.out.print("TINGGI\t= "); tinggi = input.nextInt();
                
                Lingkaran lingkaran = new Lingkaran(jariJari, (float) 3.142);
                lingkaran.luas(); 
                lingkaran.keliling();
                
                Kerucut kerucut = new Kerucut(jariJari,(float) 3.142,tinggi);
                kerucut.tampilkan();
            } 
    }
 }
}
