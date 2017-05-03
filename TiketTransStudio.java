/**
 * Created by wanicute on 01/05/2017
 * Warzuqni Olyan 1403989
 */
package tubesv1;

public class TiketTransStudio extends pembayaranonline {
     int total;
    @Override
       public void print() {
         System.out.println("id : "+id_barang);
         System.out.println("Nama : "+nama_barang);
         System.out.println("Harga : "+harga);
         System.out.println("Jumlah pembelian : "+jumlah);
	}
       
      public int hitung(){
          total=0;
          total=jumlah*200000;
          return total;
      }
       	public static void main(String[] args) {
		//testing
		TiketTransStudio t = new TiketTransStudio();  
		t.id_barang=12891;
                t.nama_barang="Tiket Wahana Trans Studio Bandung";
                t.harga="200000/tiket";
                t.jumlah=2;
                t.print();
		System.out.println("Harga Total :"+t.hitung());
	}
}
