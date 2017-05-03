/**
 * Created by wanicute 01/05/2017
 * Warzuqni Olyan 1403989
 */
package tubesv1;

public class Games extends pembayaranonline {
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
          total=jumlah*100000;
          return total;
      }
       	public static void main(String[] args) {
		//testing
		Games g = new Games();  
		g.id_barang=12892;
                g.nama_barang="Token Games";
                g.harga="100000/token";
                g.jumlah=3;
                g.print();
		System.out.println("Harga Total :"+g.hitung());
	}
}
