/**
 * Created by ASUS on 5/2/2017.
 */
public class Sponsor extends Supplier {
    int id_Sponsor;
    String nama;
    String alamat;
    String no_kontak;
    double totaldiskon;

    public Sponsor(int id_sponsor,String nama, String alamat,String no_kontak){
        this.id_Sponsor = id_sponsor;
        this.nama = nama;
        this.alamat =  alamat;
        this.no_kontak = no_kontak;
    }

    @Override
    public double hitungDiskon(){
        this.totaldiskon=30+diskonEvent;
        return totaldiskon;
    }

    public void print(){
        System.out.println("id     : "+id_Sponsor);
        System.out.println("Nama   : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Kontak : "+no_kontak);
        System.out.println("Status : Sponsor");
        System.out.println("Diskon : "+hitungDiskon()+"%");
    }

    public static void main(String[] args){
        System.out.println("coba dulu");
        Sponsor s = new Sponsor(1,"indofood","Bandung","082222345***");
        s.print();
    }
}
