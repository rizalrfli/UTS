public class DataPenilaian {
    Mahasiswa [] datamhs = new Mahasiswa [3];
    MataKuliah [] datamk = new MataKuliah [3];
    Penilaian [] datapen = new Penilaian [5];
    int idx1, idx2, idx3;

    void tambahmhs (Mahasiswa m) {
        if (idx1 < datamhs.length) {
            datamhs[idx1] = m;
            idx1++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tambahmk (MataKuliah mk) {
        if (idx2 < datamk.length) {
            datamk[idx2] = mk;
            idx2++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tambahpen (Penilaian pen) {
        if (idx3 < datapen.length) {
            datapen[idx3] = pen;
            idx3++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
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
    void SortingDSC() {
        for (int i = 0; i < datapen.length - 1; i++) {
            for (int j = i + 1; j < datapen.length; j++) {
                if (datapen[j] != null && datapen[i] != null &&
                    datapen[j].nilaiAkhir > datapen[i].nilaiAkhir) {
                    Penilaian temp = datapen[i];
                    datapen[i] = datapen[j];
                    datapen[j] = temp;
                }
            }
        }
    }
    void PencarianData(String nim) {
        boolean ketemu = false;
        for (Mahasiswa m : datamhs) {
            if (m != null &&m.nim.equalsIgnoreCase(nim)) {
                m.tampilMahasiswa();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Peringatan: Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
}