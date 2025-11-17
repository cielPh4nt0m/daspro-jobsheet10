## JOBSHEET 10 ARRAY 2

### NAMA : FADILA MAYAMASITA

### NIM : 254107020012

### KELAS : 1C_TI

####  Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi 

1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!

Jawaban : 

Pengisi elemen array tidak harus di lakukan secara berurutan, array adalah struktur data yang memiliki indeks tetap dan setiap elemen dapat diakses langsung menggunakan indeks tersebut. Yang penting indeks yang digunakan valid ( tidak melebihi ukuran array).

2.  Mengapa terdapat null pada daftar nama penonton?

Jawaban : 

karena nilai null muncul pada daftar nama penonton karena tidak semua elemen array diisi, nilai sebelum ditampilkan Elemen array belum diberi nilai (belum diinisialisasi).Dalam Java, semua elemen array bertipe objek (seperti String) akan memiliki nilai awal null secara default jika belum diisi. 

3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut

   <img width="332" height="244" alt="image" src="https://github.com/user-attachments/assets/35fecd60-f9de-40d5-b952-0387ccfac504" />

   Jawaban :


 4.  Tambahkan kode program sebagai berikut:

<img width="518" height="170" alt="image" src="https://github.com/user-attachments/assets/0a4f3792-9901-4980-aac0-8f09ee3d17dd" />

Jelaskan fungsi dari penonton.length dan penonton[0].length! 

Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa? 

Jawaban : 

A. fungsi dari penonton.length adalah menunjukkkan jumlah baris array dalam dua dimensi.

B. fungsi dari penonton[0].length adalah menunjukkan jumlah elemen/kolom pada baris pertama ( baris indeks ke-0)

C. apakah keduanya memiliki nilai yang sama, jawabannya belum tentu benar. Karena keduanya bisa sama dan bisa berbeda tergantung pada bagaimana array dinisialisasi.

 5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.

  <img width="872" height="146" alt="image" src="https://github.com/user-attachments/assets/ddf11693-bbc1-4f46-9ae0-546fca0c696f" />

  Jawaban : 

  <img width="800" height="218" alt="Screenshot 2025-11-11 105850" src="https://github.com/user-attachments/assets/c18c9be2-b048-455d-95e9-e933220edf24" />

 6.	Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.

    <img width="787" height="163" alt="image" src="https://github.com/user-attachments/assets/5455d653-abbd-4d77-89e2-f386a50338cc" />

    Jawaban :

    <img width="794" height="201" alt="Screenshot 2025-11-11 110057" src="https://github.com/user-attachments/assets/c1351678-2655-4f02-b82d-1d55f37ef01c" />

 7.	Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya.

    <img width="595" height="166" alt="image" src="https://github.com/user-attachments/assets/83e1e4e5-c1c6-4491-8660-50694e6ada52" />

   Jawaban : 

   <img width="236" height="76" alt="Screenshot 2025-11-11 111446" src="https://github.com/user-attachments/assets/0138499a-0f23-498f-a35a-23cde70ed5b2" />

 8.	Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile,run, lalu lakukan amati hasilnya.

   <img width="569" height="156" alt="image" src="https://github.com/user-attachments/assets/6f9078c9-c798-47e8-836c-872414b228ff" />

   Jawaban : 
   
   <img width="238" height="71" alt="Screenshot 2025-11-11 111553" src="https://github.com/user-attachments/assets/e1e35eb9-363a-4209-b11a-1b7a677d11c7" />

9.	Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.

    <img width="940" height="88" alt="image" src="https://github.com/user-attachments/assets/3a0d082e-5482-4485-a93e-b7ff463abac6" />

    Jawaban :

    <img width="510" height="154" alt="Screenshot 2025-11-11 113219" src="https://github.com/user-attachments/assets/bce0e3da-4ead-4c39-9be5-679c819aaa16" />

10.	Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
    
    Jawaban :

    kelebihan foreach loop adalah lebih sederhana, mengurangi risiko kesalahan indeks, cocok untuk iterasi penuh sedangkan kekurangan foreach loop adalah tidak bisa mengakses indeks secara langsung, tidak bisa memodifikasi struktur array/koleksi saat iterasi, tidak bisa mengakses beberapa elemen sekaligus dan kurangnya fleksibel untuk operasi kompleks.
   	
11.	Berapa indeks baris maksimal untuk array penonton?

    Jawaban : ada 3 baris
   	
12.	Berapa indeks kolom maksimal untuk array penonton?

    Jawaban : ada 2 kolom
   	
13.	Apa fungsi dari String.join()?

    Jawaban :

    Fungsinya adalah untuk menggabungkan beberapa elemen yang dimana menjadi satu string tunggal, dengan delimeter/pemisah tertentu di antara elemen-elemen.

####  2 Percobaan 2: Memanfaatkan Scanner dan Perulangan untuk Input dan Output pada Array 2 Dimensi Waktu

1.	Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!

   Jawaban : 

   Tidak, pengisian elemen array dari scanner tidak harus dilakukan secara berurutan mulai dari indeks ke-0. 

 2.	Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
    
-	Menu 1: Input data penonton
  
-	Menu 2: Tampilkan daftar penonton
  
-	Menu 3: Exit

  jawaban : 
  ```
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

                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak valid!");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah ditempati oleh "
                                + penonton[baris - 1][kolom - 1]);
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
                                        ": Kosong\t");
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
```

  3.	Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia

  Jawaban :
  ```
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

                    // Cek apakah kursi kosong atau tidak
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah ditempati oleh "
                                + penonton[baris - 1][kolom - 1]);
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
                                        ": Kosong\t");
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
```
Hasilnya :

<img width="388" height="469" alt="Screenshot 2025-11-17 221136" src="https://github.com/user-attachments/assets/f3a1a642-bb8e-483c-bb59-7bfe45888f07" />

  4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali

 Jawaban : 
 ```
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
                                        ": Kosong\t");
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
```
Hasilnya : 

<img width="309" height="275" alt="Screenshot 2025-11-17 221808" src="https://github.com/user-attachments/assets/509ad2c9-9876-4915-99e4-53d692d433e7" />


 5. Pada menu 2, jika kursi kosong, ganti null dengan ***

Jawaban :
```
 if (penonton[i][j] != null) {
                                System.out.print("Baris " + (i + 1) +
                                        " Kolom " + (j + 1) +
                                        ": " + penonton[i][j] + "\t");
                            } else {
                                System.out.print("Baris " + (i + 1) +
                                        " Kolom " + (j + 1) +
                                        ": ***\t");
                            }
```

Hasilnya : 

<img width="395" height="174" alt="Screenshot 2025-11-17 222134" src="https://github.com/user-attachments/assets/8d70129a-e9ba-415b-8837-f94d8f1f042a" />

####  Percobaan 3: Array 2 Dimensi dengan Length Baris Berbeda waktu

1.	Tambahkan kode program sebagai berikut
   
   Jawaban :

   <img width="571" height="349" alt="Screenshot 2025-11-17 223359" src="https://github.com/user-attachments/assets/1af47885-3471-49ac-8055-5a5d98a8c461" />

2. Apa fungsi dari Arrays.toString()?

   Jawaban :

    Mengubah Array menjadi String yang dimana mudah di baca sehingga dapat di dampilkan di System.out.println();

3.	Apa nilai default untuk elemen pada array dengan tipe data int?

   Jawaban : 

  Nilai default untuk element di Array dengan tipe data in adalah 0, karena berkaitan dengan cara java mengelolah memori keamanan tipe data.

4.	Tambahkan kode program berikut

   Jawaban : 
   ```
 import java.util.Arrays;
 
public class number13 {
    public static void main(String[] args) {
        
        int [][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));          
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("panjang baris ke-" + (i+1) + " :" + myNumbers[i].length);
            
        }
    }
    
}
```

5.	Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?

    Jawaban :

    Tidak bisa, karena panjag array tidak dapat dimodifikasi setelah array diinstansiasi

####  Percobaan 4: Studi Kasus SIAKAD 




   

   
 




    



   

    








    
   	
 



   

    


  

   

    
 
  
   







