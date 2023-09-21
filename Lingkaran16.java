import java.util.Scanner;
public class Lingkaran16 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int r;
        float phi= 3.14f;
        double keliling, luas;

        System.out.println("Masukan jari-jari lingkaran: ");
        r=sc.nextInt();
        phi=sc.nextFloat();

        keliling= 2*phi*r;
        luas= phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);
        sc.close();
    }
}