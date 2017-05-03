/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesv1;

import java.util.ArrayList;

/**
 *Hisyam yusyaq 1400494
 * @author ICAM
 */
public class Tubes {
    private ArrayList<Barang> arrBarang = new ArrayList<>(); //item makan/minum yang dipesan
    private Daftar_barang pilihBrg; //pesanan harus yg ada di menu, static karena semua pesanan sharing menu yg sama
    

    int uang;
    int kembalian;
     int uang1;
    /**
     * @param args the command line arguments
     */
    
    private Nonmember non;
     private Member M;
    private Staff staff;
    private listrik listrik;
    int jumlahbrg;
  
    //constructor
    
      public Tubes(int uang, Daftar_barang daftar_brg,Member M,Staff staff,listrik listrik,Nonmember non) {
        this.uang= uang;
        pilihBrg = daftar_brg;
        this.M = M;
        this.non = non;
        this.staff = staff;
        this.listrik=listrik;
    }
      

    public void addBarang(int id_barang) {
        Barang brg = pilihBrg.cari_br(id_barang);
        if (brg != null) {
            arrBarang.add(brg);
        }
    }
    
    
        public void hitungTagihan(int jumlah,int id_barang) {
        int total=0;
        for (Barang brg: arrBarang) {
            if(id_barang==brg.id_barang){
            total=brg.harga_jual*jumlah;
            brg.jumlahbeli=jumlah;
            brg.jumlah = brg.jumlah-jumlah;
            uang=uang-total;
            brg.harga_total=total;
            kembalian=uang;
            }
        }
        
    }
    
    
   public void print() {
       System.out.println("===> Testing print pesanan:");
        staff.print1();
        System.out.println("==+++++++++++++++++++++==");
        M.print();
     
       
         System.out.println("==+++++++++++++++++++++==");
      
         for (Barang brg: arrBarang) {
            brg.tampung=brg.tampung+brg.harga_total;
            brg.printT();
            System.out.println("");
            
        }
        listrik.print();
        System.out.println("total harga:"+listrik.hitung());
        System.out.println("==+++++++++++++++++++++==");
        System.out.println("Uang:"+uang1);
        System.out.println("Total Harga semuanya:"+(uang1-kembalian));
        double diskon;
        diskon = (uang1-kembalian)*M.diskon;
        double hargaakhir;
        hargaakhir = (uang1-kembalian)-diskon;
        System.out.println("Total Diskon:"+diskon);
        System.out.println("Total Harga akhir:"+hargaakhir);
        System.out.println("Kembalian: Rp "+(uang1-hargaakhir));
    }
    
    
    public static void main(String[] args) {
       
        System.out.println("**** test class Pesanan **** ");
        Barang brg;
        Daftar_barang daftar_brg = new Daftar_barang();
        daftar_brg.isi();
        
        Nonmember non = new Nonmember(1);
       Member M = new Member(111,"Otoy","Cibiru","081111111111",0.1);
         
       Staff staff = new Staff(1,"Dede","Sumedang","088120442**",5);
        listrik listrik = new listrik();
         listrik.id_barang=1;
         listrik.nama_barang="Token listrik";
         listrik.harga="10000/200 token";
         listrik.jumlah=50;
        
        Tubes T = new Tubes(100000,daftar_brg,M,staff,listrik,non);
        T.uang1=T.uang;
        T.uang=T.uang-listrik.hitung() ;
        T.addBarang(2);   //barang yang dipilih
        T.hitungTagihan(10,2);
        T.addBarang(1);   //barang yang dipilih
        T.hitungTagihan(10,1);
        
        T.print();
        
        
    }
    
}
