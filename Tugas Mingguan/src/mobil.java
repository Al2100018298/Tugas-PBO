import java.util.Scanner;

public class mobil extends sewa {
    int jum, i;
    double total_bayar=0;
    int [] kode = new int[6];
    int [] jum_hari = new int[6];
    int [] harga = new int[6];
    double [] sub_total = new double[6];
    String [] unit = new String[6];
    @Override
    void getkeseluruhan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jumlah Unit Sewa : ");
        jum=input.nextInt();
        for (i=0; i<jum;i++){
            System.out.print("Masukan Kode unit Ke-"+(i+1)+" : ");
            kode[i]=input.nextInt();
            System.out.print("Masukan Jumlah Hari unit ke- "+(i+1)+" : ");
            jum_hari[i]=input.nextInt();
            //Menentukan jenis mobil berdasarkan kode
            switch (kode[i]) {
                case 1 -> {
                    unit[i] = "Avanza";
                    harga[i] = 300000;
                }
                case 2 -> {
                    unit[i] = "Innova";
                    harga[i] = 500000;
                }
                case 3 -> {
                    unit[i] = "Alphard";
                    harga[i] = 1000000;
                }
                case 4 -> {
                    unit[i] = "Camry";
                    harga[i] = 1000000;
                }
                case 5 -> {
                    unit[i] = "Pajero Sport";
                    harga[i] = 800000;
                }
                case 6 -> {
                    unit[i] = "Fortuner";
                    harga[i] = 800000;
                }
                default -> System.out.println("Kode Pilihan Tidak Tersedia");
            }
        }

        System.out.println(" ");
        System.out.println("No   Nama Unit     Harga      Jum_Hari    Sub Total");
        //Menampilkan seluruh elemen di dalam array
        for (i=0; i<jum;i++){
            sub_total[i]=jum_hari[i]*harga[i];
            total_bayar+=sub_total[i];
            System.out.println(i+1+"      "+unit[i]+"      "+harga[i]+"        "+jum_hari[i]+"           "+sub_total[i]);
        }
        System.out.println(" ");
        //Menampilkan total bayar
        System.out.println("Total Bayar : "+total_bayar);
    }
}