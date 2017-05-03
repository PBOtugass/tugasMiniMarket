package tubesv1;
/**
 * Shandra Nurafifah / 1403543
 * Pendidikan Ilmu Komputer A
 */
public class Nonmember extends Pembeli {
    static String status = "Non-Member";

    public Nonmember(int id_pembeli){
        this.id_pembeli=id_pembeli;
    }
    public void print(){
        System.out.println("  Id    : "+id_pembeli);
        System.out.println("  Status: "+status);
    }

    //jika main(), hasilnya spt ini:
    /*
      ===> Testing Pembeli (Non-Member):
      Id    : 1
      Status: Non-Member
    */
    public static void main(String[] args){
        Nonmember Nm = new Nonmember(1);
        System.out.println("===> Testing Pembeli (Non-Member):");
        Nm.print();
    }
}
