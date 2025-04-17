public class DataPenilaian {
    Mahasiswa [] datamhs = new Mahasiswa [3];
    int idx;
    void tampil() {
        for (Mahasiswa m : datamhs) {
            m.tampilMahasiswa();
        }
    }
}
