/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

/**
 *
 * @author ICAM
 */
/**
 * Created by ASUS on 4/9/2017.
 */
public class Barang {
    int id_barang;
    String nama_barang;
    String jenis;
    int jumlah;
    int harga_suplier;
    int harga_jual;
    int harga_total;
    int upHargaS;
    int upHargaJ;
    int upjumlah;
    int idUp;

    public Barang(int id_barang,String nama_barang, String jenis, int jumlah, int harga_suplier, int harga_jual,int harga_total){
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.harga_suplier = harga_suplier;
        this.harga_jual = harga_jual;
        this.harga_total = harga_total;
    }

    public int upHargaBarang(int idUp,int upHargaS,int upHargaJ){ //untuk mengupdate harga suplier dan harga jual barang
        if(this.id_barang==idUp){
            this.harga_suplier=upHargaS;
            this.harga_jual=upHargaJ;
        }
        return harga_jual;
    }

    public int upJumlahBarang(int idUp, int upjumlah){ //untuk mengupdate jumlah barang
        if(this.id_barang==idUp){
            this.jumlah=upjumlah;
        }
        return jumlah;
    }

    public void print(){
        System.out.println("Id barang :"+id_barang);
        System.out.println("Nama Barang :"+nama_barang);
        System.out.println("Jenis Barang :"+jenis);
        System.out.println("Jumlah Barang :"+jumlah);
        System.out.println("Harga Suplier:"+harga_suplier);
        System.out.println("Harga jual:"+harga_jual);
        System.out.println("total harga:"+harga_total);
    }
    
     public void printT(){
        System.out.println("Id barang :"+id_barang);
        System.out.println("Nama Barang :"+nama_barang);
        System.out.println("Harga jual:"+harga_jual);
        System.out.println("total harga:"+harga_total);
    }


    public static void main(String[] args){
        Barang brg = new Barang(1,"indomie","mie",50, 2300, 2500,2500);
        brg.upHargaBarang(1,2500, 2800);
        System.out.println("==Testing print isi==");
        brg.print();
    }
}
