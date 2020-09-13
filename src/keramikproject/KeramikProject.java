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
public class KeramikProject {
    public static void main(String[] args) {
        /*instansiasi*/
        HargaKeramik k1 = new HargaKeramik();
        k1.panjang=30;
        k1.lebar=30;
        k1.isi=10;
        k1.harga=54000;
        k1.keramik="A";
        k1.hitungLuas();
        k1.kebutuhanKeramik();
        k1.hargaTotal();
        
        HargaKeramik k2 = new HargaKeramik();
        k2.panjang=40;
        k2.lebar=40;
        k2.isi=5;
        k2.harga=65000;
        k2.keramik="B";
        k2.hitungLuas();
        k2.kebutuhanKeramik();
        k2.hargaTotal();
        
        HargaKeramik k3 = new HargaKeramik();
        k3.panjang=30;
        k3.lebar=40;
        k3.isi=8;
        k3.harga=60000;
        k3.keramik="C";
        k3.hitungLuas();
        k3.kebutuhanKeramik();
        k3.hargaTotal();
    }

    
}
