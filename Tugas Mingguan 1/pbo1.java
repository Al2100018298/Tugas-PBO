import java.util.Scanner;
class pbo1 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int[][] matrix1, matrix2, jumlah;
        int baris, kolom;
        char ulang;


        do{
            System.out.print("---PROGRAM MATRIX JAVA---\n");
            System.out.print("Jumlah baris matrix yang diinginkan : ");
            baris = masuk.nextInt();

            System.out.print("Jumlah kolom matrix yang diinginkan : ");
            kolom = masuk.nextInt();

            System.out.println();
            matrix1 = new int[baris][kolom]; matrix2 = new int[baris][kolom]; jumlah = new int[baris][kolom];

            //Nilai Matrix 1
            System.out.println("Matrix 1");
            for(int i=0; i<baris; i++){
                for(int j=0; j<kolom; j++){
                    System.out.print("Matrix1 ["+i+"]["+j+"] = ");
                    int isimatrix = masuk.nextInt();
                    matrix1[i][j] = isimatrix;
                }
            }
            System.out.println("\n");

            //Nilai Matrix 2
            System.out.println("Matrix 2");
            for(int i=0; i<baris; i++){
                for(int j=0; j<kolom; j++){
                    System.out.print("Matrix2 ["+i+"]["+j+"] = ");
                    int isimatrix = masuk.nextInt();

                    matrix2[i][j] = isimatrix;
                }
            }

            //Penjumlahan 2 buah matrix
            for(int i = 0; i<baris; i++){
                for(int j = 0; j<kolom; j++){
                    jumlah[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            //Hasilnya
            System.out.println("Hasil penjumlahan matrix : ");
            for (int i = 0; i<baris; i++){
                for(int j = 0; j<kolom; j++){
                    System.out.print(jumlah[i][j]+"  ");
                }
                System.out.println();
            }

            //Pengulangan program
            System.out.println();
            System.out.print("Apakah ingin mencoba perhitungan lagi? (y/t) : ");
            ulang = masuk.next().charAt(0);
            if(ulang == 't'){
                System.out.println("Terima Kasih Sudah Mencoba");
            }
        }
        while(ulang == 'y');
    }
}