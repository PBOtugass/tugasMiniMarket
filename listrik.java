package tubesv1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *Hisyam yusyaq 1400494
 * @author ICAM
 */
public class listrik extends pembayaranonline {
    int total;
    @Override
       public void print() {
         System.out.println("id : "+id_barang);
         System.out.println("Nama : "+nama_barang);
         System.out.println("Harga/token : "+harga);
         System.out.println("Jumlah pembelian : "+jumlah);
	}
       
      public int hitung(){
          total=0;
          total=jumlah*10000/200;
          return total;
      }
       	public static void main(String[] args) {
		//testing
		listrik L = new listrik();  
		L.id_barang=12889;
                L.nama_barang="Token listrik";
                L.harga="10000/200token";
                L.jumlah=100;
                L.print();
		System.out.println("Harga Total :"+L.hitung());
	}
}
