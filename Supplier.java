import java.util.ArrayList;
/**
 * Created by ASUS on 5/2/2017.
 */
public class Supplier {
    static double diskonEvent=10;
    ArrayList<Supplier> arrSupplier = new ArrayList<>();
    public double hitungDiskon(){ return 0; }

    public void print(){
        System.out.println("-----Daftar Supplier----");
        System.out.println("------------------------");
        for(Supplier s:arrSupplier){
            s.print();
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Supplier s= new Supplier();

        Umum s1 = new Umum(1,"Mayora","Bandung", "088345543888");
        s.arrSupplier.add(s1);

        Sponsor s2 = new Sponsor(2,"Wings","Bandung","083888789***");
        s.arrSupplier.add(s2);

        s.print();
    }
}
