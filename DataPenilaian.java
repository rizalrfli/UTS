public class DataPenilaian {
    Mahasiswa [] datamhs = new Mahasiswa [5];
    MataKuliah [] datamk = new MataKuliah [5];
    Penilaian [] datapen = new Penilaian [5];
    void tampilmhs() {
        for (Mahasiswa m : datamhs) {
            m.tampilMahasiswa();
        }
    }
}