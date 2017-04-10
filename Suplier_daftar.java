package minimarket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ICAM
 */

import java.util.HashMap;
public class Suplier_daftar {
      private HashMap<Integer,Suplier> daftarSp = new HashMap<>();
      
    public void addMk(Suplier sp) {
        daftarSp.put(sp.id_supplier,sp);
    }

    //LENGKAPI
    //cari matakuliah di hashamp berdsarkan idmatakuliah
    public Suplier cari_sp(int id_suplier) {
        return daftarSp.get(id_suplier);
       //ganti null dengan
    }
    
    
        public void isi() {

        //JANGAN DI EDIT
        //untuk testing, nantinya bisa diisi dari database
        Suplier sp;

        sp = new Suplier(1,"Judin", "Sariwangi","12345");
        addMk(sp);
        sp = new Suplier(2,"Reka", "Sarijadi","23456");
        addMk(sp);
        sp = new Suplier(3,"Yuki", "Cimalaka","34567");
        addMk(sp);
       
    }
        
    public static void main(String[] args) {
        //JANGAN DIEDIT
        //test cari
        Suplier_daftar daftar = new Suplier_daftar();
        daftar.isi();
        Suplier sp = daftar.cari_sp(3);
        sp.print();
    }

    
}
