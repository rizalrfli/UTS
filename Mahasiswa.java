public class Mahasiswa {
    String nim, nama, prodi;
    void Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim; 
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}