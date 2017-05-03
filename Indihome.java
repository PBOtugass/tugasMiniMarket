/**
 * Created by wanicute on 01/05/2017
 * Warzuqni Olyan 1403989
 */
package tubesv1;

public class Indihome extends pembayaranonline {
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
          total=jumlah*570000;
          return total;
      }
       	public static void main(String[] args) {
		//testing
		Indihome i = new Indihome();  
		i.id_barang=12890;
                i.nama_barang="Indihome";
                i.harga="570000/bulan";
                i.jumlah=1;
                i.print();
		System.out.println("Harga Total :"+i.hitung());
	}
}
