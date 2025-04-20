import java.util.Scanner;
public class MainData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataPenilaian dp = new DataPenilaian();
        Mahasiswa mhs1 = new Mahasiswa("2201", "Ali Rahman", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("2202", "Budi Santoso", "Informatika");
        Mahasiswa mhs3 = new Mahasiswa("2203", "Citra Dewi", "Sistem Informasi Bisnis");
        dp.tambahmhs(mhs1);
        dp.tambahmhs(mhs2);
        dp.tambahmhs(mhs3);

        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Web", 3);
        dp.tambahmk(mk1);
        dp.tambahmk(mk2);
        dp.tambahmk(mk3);

        dp.tambahpen(new Penilaian(dp.datamhs[0], dp.datamk[0], 80, 85, 90));
        dp.tambahpen(new Penilaian(dp.datamhs[0], dp.datamk[1], 60, 75, 70));
        dp.tambahpen(new Penilaian(dp.datamhs[1], dp.datamk[0], 75, 70, 80));
        dp.tambahpen(new Penilaian(dp.datamhs[2], dp.datamk[1], 85, 90, 95));
        dp.tambahpen(new Penilaian(dp.datamhs[2], dp.datamk[2], 80, 90, 65));

        int pilihan;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                case 1:
                    dp.tampilmhs();
                    break;
                case 2:
                    dp.tampilmk();
                    break;
                case 3:
                    dp.tampilpen();
                    break;
                case 4:
                    dp.SortingDSC();
                    dp.tampilpen();
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nim = sc.nextLine();
                    dp.PencarianData(nim);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 6);
     }
}
