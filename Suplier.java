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
public class Suplier {
    int id_supplier;
    String nama_supplier;
    String alamat_supplier;
    String kontak_supplier;
    private Barang brg;

    public Suplier(int id_supplier,String nama_supplier, String alamat_supplier, String kontak_supplier){
        this.id_supplier=id_supplier;
        this.nama_supplier=nama_supplier;
        this.alamat_supplier=alamat_supplier;
        this.kontak_supplier=kontak_supplier;
    }
    public void print(){
        System.out.println("Id:"+id_supplier);
        System.out.println("Nama:"+nama_supplier);
        System.out.println("Alamat:"+alamat_supplier);
        System.out.println("Kontak:"+kontak_supplier);

    }
    
        public static void main(String[] args) {
         
        Suplier sp  = new Suplier(1,"Judin", "Sariwangi","12345");
        sp.print();
    }
}