/**
 * Created by ASUS on 4/9/2017.
 * Annisa Larasati / 1401947
 * Penddiikan Ilmu Komputer A
 */
public class Barang {
    int id_barang;
    int id_supplier;
    String nama_barang;
    String jenis;
    int jumlah;
    int harga_suplier;
    int harga_jual;
    int upHargaS;
    int upHargaJ;
    int upjumlah;
    int idUp;


    public Barang(int id_barang, int id_Supplier,String nama_barang, String jenis, int jumlah, int harga_suplier, int harga_jual){
        this.id_barang = id_barang;
        this.id_supplier = id_Supplier;
        this.nama_barang = nama_barang;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.harga_suplier = harga_suplier;
        this.harga_jual = harga_jual;
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
        System.out.println("Id supplier :"+id_supplier);
        System.out.println("Nama Barang :"+nama_barang);
        System.out.println("Jenis Barang :"+jenis);
        System.out.println("Jumlah Barang :"+jumlah);
        System.out.println("Harga Suplier:"+harga_suplier);
        System.out.println("Harga jual:"+harga_jual);
    }

    public static void main(String[] args){
        Barang brg = new Barang(1,1,"indomie","mie",50, 2300, 2500);
        brg.upHargaBarang(1,2500, 2800);
        System.out.println("==Testing print isi==");
        brg.print();
    }
}
