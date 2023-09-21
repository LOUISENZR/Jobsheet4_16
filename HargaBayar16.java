import java.util.Scanner;
public class HargaBayar16 {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int harga, jumlah, jmlHalBuku;
        double total, bayar, jmlDis, dis;
        String MerkBuku;

        System.out.println("Masukan Merk Buku ");
        MerkBuku = sc.nextLine();
        System.out.println("Masukan harga barang yang dibeli ");
        harga=sc.nextInt();
        System.out.println("Masukan Jumlah Barang Yang Dibeli ");
        jumlah=sc.nextInt();
        System.out.println("Masukan Jumlah Halaman Buku ");
        jmlHalBuku=sc.nextInt();
        System.out.println("Masukan Jumlah Diskon ");
        dis=sc.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
        sc.close();

    }
}