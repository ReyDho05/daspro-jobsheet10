import java.util.Scanner;
public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int baris,kolom;
       String nama, next;
       String [][]penonton = new String [4][2];
       while (true){
        System.out.println("Menu: ");
        System.out.println("1. Input Data Penonton ");
        System.out.println("2. Tampilkan Daftar Penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih Menu (1/2/3): ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        switch(pilihan){ 
         case 1:
            System.out.print("Masukkan nama: ");
             nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
             baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
             kolom = sc.nextInt();
            sc.nextLine();
            if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                    break;
                } else {
                    System.out.println("Kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                }
            } else {
                System.out.println("Posisi tidak valid. Silakan masukkan ulang.");
            }break;
         case 2:
         System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = penonton[i][j] != null ? penonton[i][j] : "***";
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + namaPenonton);
                        }
                    }break;
         case 3 :
                    System.out.println("Terima kasih, program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
       } 
    }
}