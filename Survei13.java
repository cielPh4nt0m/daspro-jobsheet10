import java.util.Scanner;

public class Survei13 {

    
    private static final int JUMLAH_RESPONDEN = 10;
    private static final int JUMLAH_PERTANYAAN = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        
        System.out.println("=== A. Input Hasil Survei (Skala 1-5) ===");
        inputDataSurvei(scanner, survei);

        System.out.println("\n=== B. Rata-rata Per Responden ===");
        hitungRataRataResponden(survei);

        
        System.out.println("\n=== C. Rata-rata Per Pertanyaan ===");
        hitungRataRataPertanyaan(survei);

        
        System.out.println("\n=== D. Rata-rata Keseluruhan ===");
        hitungRataRataKeseluruhan(survei);
        
        scanner.close();
    }

    
    private static void inputDataSurvei(Scanner scanner, int[][] survei) {
        // Melakukan iterasi dari R=1 hingga R=10 (Responden)
        for (int r = 0; r < JUMLAH_RESPONDEN; r++) {
            System.out.println("\nInput data untuk Responden ke-" + (r + 1) + ":");
            
            
            for (int p = 0; p < JUMLAH_PERTANYAAN; p++) {
                int nilai;
                do {
                    System.out.print("Nilai Pertanyaan " + (p + 1) + " (1-5): ");
                    // Pastikan input adalah integer
                    while (!scanner.hasNextInt()) {
                        System.out.println("Input tidak valid. Harap masukkan angka.");
                        scanner.next(); // Buang input yang salah
                        System.out.print("Nilai Pertanyaan " + (p + 1) + " (1-5): ");
                    }
                    nilai = scanner.nextInt();
                    
                    
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Nilai harus antara 1 sampai 5.");
                    }
                } while (nilai < 1 || nilai > 5); // Ulangi jika nilai tidak valid

                
                survei[r][p] = nilai;
            }
        }
        System.out.println("\nData Survei berhasil disimpan!");
    }

    
    private static void hitungRataRataResponden(int[][] survei) {
        
        for (int r = 0; r < JUMLAH_RESPONDEN; r++) {
            double totalR = 0;
            
            
            for (int p = 0; p < JUMLAH_PERTANYAAN; p++) {
                
                totalR += survei[r][p];
            }
            
           
            double rataR = totalR / JUMLAH_PERTANYAAN;
            
            System.out.printf("Rata-rata Responden ke-%d: %.2f\n", (r + 1), rataR);
        }
    }

   
    private static void hitungRataRataPertanyaan(int[][] survei) {
        
        for (int p = 0; p < JUMLAH_PERTANYAAN; p++) {
            double totalP = 0;
            
            
            for (int r = 0; r < JUMLAH_RESPONDEN; r++) {
                
                totalP += survei[r][p];
            }
            
            
            double rataP = totalP / JUMLAH_RESPONDEN;
            
            /
            System.out.printf("Rata-rata Pertanyaan ke-%d: %.2f\n", (p + 1), rataP);
        }
    }

    
    private static void hitungRataRataKeseluruhan(int[][] survei) {
        double totalKeseluruhan = 0;
        int jumlahData = JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN; // Total 60 data

       
        for (int r = 0; r < JUMLAH_RESPONDEN; r++) {
          
            for (int p = 0; p < JUMLAH_PERTANYAAN; p++) {
               
                totalKeseluruhan += survei[r][p];
            }
        }

        double rataKeseluruhan = totalKeseluruhan / jumlahData;

        
        System.out.printf("Total Nilai dari %d data: %.0f\n", jumlahData, totalKeseluruhan);
        System.out.printf("**Rata-rata Keseluruhan: %.2f**\n", rataKeseluruhan);
    }
}