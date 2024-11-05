import java.util.Scanner;
public class SIAKAD06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai Mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            double rataRataPerSiswa = totalPerSiswa / jumlahMatkul;
            System.out.println("Nilai rata-rata Mahasiswa ke-" + (i + 1) + ": " + rataRataPerSiswa);
        }
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            double rataRataPerMatkul = totalPerMatkul / jumlahSiswa;
            System.out.println("Rata-rata nilai Mata Kuliah " + (j + 1) + ": " + rataRataPerMatkul);
        }
    }
}