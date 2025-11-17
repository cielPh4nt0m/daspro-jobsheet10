import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {

                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();

                        if (baris >= 1 && baris <= 4) break;
                        System.out.println("Nomor baris tidak tersedia!");
                    }

                    
                    while (true) {
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();

                        if (kolom >= 1 && kolom <= 2) break;
                        System.out.println("Nomor kolom tidak tersedia!");
                    }

                 
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah ditempati oleh "
                                + penonton[baris - 1][kolom - 1]);
                        System.out.println("Silahkan pilih baris dan kolom lain!\n");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan!");
                    }
                    break;

                case 2:
                    System.out.println("=== Daftar Penonton ===");

                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.print("Baris " + (i + 1) +
                                        " Kolom " + (j + 1) +
                                        ": " + penonton[i][j] + "\t");
                            } else {
                                System.out.print("Baris " + (i + 1) +
                                        " Kolom " + (j + 1) +
                                        ": ***\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    return;

                default:
                    System.out.println("Harap pilih menu yang benar.");
            }
        }
    }
}
