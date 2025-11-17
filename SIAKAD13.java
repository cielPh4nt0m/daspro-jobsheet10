import java.util.Scanner;

public class SIAKAD13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];

       
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println("==============================");
        }

        
        System.out.println("\n=== Rata-rata per Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            double totalPerMahasiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerMahasiswa += nilai[i][j];
            }
            System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": " + (totalPerMahasiswa / 3));
        }

        
        System.out.println("\n=== Rata-rata per Mata Kuliah ===");
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Rata-rata mata kuliah ke-" + (j + 1) + ": " + (totalPerMatkul / 4));
        }
    }
}
