package tubesv1;
/**
 * Shandra Nurafifah / 1403543
 * Penddiikan Ilmu Komputer A
 */

public class Member extends Pembeli {
    int id_member;
    String nama;
    String alamat;
    String no_kontak;
    double diskon ;
    static String status = "Member";

    public Member(int id_member, String nama, String alamat, String no_kontak,double diskon){
        this.id_member = id_member;
        this.nama = nama;
        this.alamat = alamat;
        this.no_kontak = no_kontak;
        this.diskon =diskon;
    }
    
    public void print(){
        //print isi member
        System.out.println("  Id    : "+id_member);
        System.out.println("  Status: "+status);
        System.out.println("  Nama  : "+nama);
    }
    public void print1(){
        System.out.println("  Alamat: "+alamat);
        System.out.println("  Nomor kontak: "+no_kontak);
    }
    //jika main(), hasilnya spt ini:
    /*
        +=============================+
        +         Data Member         +
        +=============================+
          Id    : 111
          Status: Member
          Nama  : Otoy
          Alamat: Cibiru
          Nomor kontak: 081111111111
        +-----------------------------+
    */
    public static void main(String[] args){
        Member m = new Member(111,"Otoy","Cibiru","081111111111",0.1);
        System.out.println("+=============================+");
        System.out.println("+         Data Member         +");
        System.out.println("+=============================+");
        m.print();  //panggil method
        m.print1();  //panggil method
        System.out.println("+-----------------------------+");
    }
}
