public class DataPenilaian {
    Mahasiswa [] datamhs = new Mahasiswa [5];
    MataKuliah [] datamk = new MataKuliah [5];
    Penilaian [] datapen = new Penilaian [5];
    void tampilmhs() {
        for (Mahasiswa m : datamhs) {
            m.tampilMahasiswa();
        }
    }
    void tampilmk () {
        for (MataKuliah mk : datamk) {
            mk.tampilMataKuliah();
        }
    }
    void tampilpen() {
        for (Penilaian pen : datapen) {
            pen.tampilData();
        }
    }
    void SortingDSC(){
        for (int i = 0; i < datapen.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < datapen.length; j++) {
                if (datapen[j].nilaiAkhir > datapen[idxMax].nilaiAkhir) {
                    idxMax = j;
                }
            }
            Penilaian tmp = datapen[idxMax];
            datapen[idxMax] = datapen[i];
            datapen[i] = tmp;
        }
    }
    void PencarianData(String nim) {
        boolean ketemu = false;
        for (Mahasiswa m : datamhs) {
            if (m.nim.equalsIgnoreCase(nim)) {
                m.tampilMahasiswa();
                ketemu = true;
            }
        }
        if (ketemu) {
            System.out.println("Peringatan: Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}