import java.util.Scanner;

/**
 * Created by wanicute on 11/04/2017.
 */
public class Utama {
    int pil;
    public void test() {

        do{
            System.out.println("============= ALFA MARET =============");
            System.out.println("1. Transaksi Pembelian");
            System.out.println("2. Transaksi Penjualan");
            System.out.println("3. Database Barang");
            System.out.println("4. Database Member");
            System.out.println("5. Database Supplier");
            System.out.println("6. Database Staff");
            System.out.println("7. Keluar");
            System.out.println("Masukkan pilihan: ");
            Scanner scan = new Scanner(System.in);
            pil = scan.nextInt();
            // Teh ana bikin function baru di class yang lain, yang ga ada parameternya, nanti hapus aja. da cuma buat nyobain doang
            switch (pil){
                case 1:
                    System.out.println("=============Transaksi Pembelian=============");
                    TransaksiPembelian tp = new TransaksiPembelian();//nanti hapus aja
                    tp.print();//nanti hapus aja
                    break;
                case 2:
                    System.out.println("=============Transaksi Penjualan=============");
                    break;
                case 3:
                    System.out.println("=============Database Barang=============");
                    Barang b = new Barang();//nanti hapus aja
                    b.print();
                    break;
                case 4:
                    System.out.println("=============Database Member=============");
                    Pembeli p = new Pembeli();//nanti hapus aja
                    Scanner scannama = new Scanner(System.in);
                    String namamember = scannama.next();
                    p.addmember(namamember);
                    p.print();
                    break;
                case 5:
                    System.out.println("=============Database Suplier=============");
                    Suplier s = new Suplier();//nanti hapus aja
                    s.print();//nanti hapus aja
                    break;
                case 6:
                    System.out.println("=============Database Staff=============");
                    break;
                case 7:
                    System.out.println("============= EXIT =============");
                    break;
                default:
                    System.out.println("============= Wrong choice =============");
                    break;
            }
            //kode untuk press enter to continue
            try{System.in.read();}
            catch(Exception e){}
        }while (pil!=7);

    }

    public static void main(String[] args) {
        //JANGAN DIEDIT
        Utama u = new Utama();
        u.test();
    }
}
