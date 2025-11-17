import java.util.Scanner;

public class SIAKAD_Dinamis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

       
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Input nilai siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\n=== Rata-rata Nilai per Siswa ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            double total = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                total += nilai[i][j];
            }
            System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": " + (total / jumlahMatkul));
        }

        
        System.out.println("\n=== Rata-rata Nilai per Mata Kuliah ===");
        for (int j = 0; j < jumlahMatkul; j++) {
            double total = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                total += nilai[i][j];
            }
            System.out.println("Rata-rata mata kuliah ke-" + (j + 1) + ": " + (total / jumlahSiswa));
        }

        sc.close();
    }
}
