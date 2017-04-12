/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

import java.util.HashMap;

/**
 *
 * @author ICAM
 */
class Daftar_barang {
    private HashMap<Integer,Barang> daftarBr = new HashMap<>();
      
    public void addbrg(Barang brg) {
        daftarBr.put(brg.id_barang,brg);
    }

    //LENGKAPI
    //cari matakuliah di hashamp berdsarkan idmatakuliah
    public Barang cari_br(int id_barang) {
        return daftarBr.get(id_barang);
       //ganti null dengan
    }
    
    
        public void isi() {

        //JANGAN DI EDIT
        //untuk testing, nantinya bisa diisi dari database
        Barang brg;
        
        brg = new Barang(1,"Indomie", "Mie",50,2300,2500,2500);
        addbrg(brg);
        brg = new Barang(2,"Kecap", "kecap",50,2000,2300,2300);
        addbrg(brg);
        brg = new Barang(3,"Aqua", "Minuman",50,2000,3000,3000);
        addbrg(brg);
    }
        
    public static void main(String[] args) {
        //JANGAN DIEDIT
        //test cari
        Daftar_barang daftar_brg = new Daftar_barang();
        daftar_brg.isi();
        Barang brg = daftar_brg.cari_br(3);
        brg.print();
    }

    
}
