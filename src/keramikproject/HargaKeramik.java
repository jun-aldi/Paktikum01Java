/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramikproject;

/**
 *
 * @author Juniar
 */
public class HargaKeramik {
    /*atribut luas lantai*/
    int luasLantai;
    
    /*attribut masing" keramik*/
    String keramik;
    int panjang;
    int lebar;
    int isi;
    int harga;
    
    /*attribut luas keramik perbox*/
    double luas;
    
    /*attribut kebutuhan box keramik*/
    double butuh;
    
    /*harga total*/
    double total;


    void hitungLuas(){
        //Menghitung luas keramik per box//
        luas = (this.panjang * this.lebar * 0.0001)* this.isi ;
        
    }
    void kebutuhanKeramik(){
        //Menghitung kebutuhan box keramik sesuai luas yg diinginkan//
        this.luasLantai=100;
        butuh = this.luasLantai / this.luas;
    }
    void hargaTotal(){
       //Menghitung harga total masing" keramik// 
        total = this.butuh * this.harga;
        int i = (int)total;
        System.out.println("Keramik = " + this.keramik);
        System.out.println("Total Biaya = Rp" + i);
        System.out.println("");         
    }

}
