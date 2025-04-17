public class DataPenilaian {
    Mahasiswa [] datamhs = new Mahasiswa [3];
    MataKuliah [] datamk = new MataKuliah [3];
    Penilaian [] datapen = new Penilaian [3];
    void tampilmhs() {
        for (Mahasiswa m : datamhs) {
            m.tampilMahasiswa();
        }
    }
}
