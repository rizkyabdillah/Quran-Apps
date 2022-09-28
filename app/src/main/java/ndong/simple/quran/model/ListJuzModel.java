package ndong.simple.quran.model;

public class ListJuzModel {

    private String namaJuz, keteranganJuz;

    public ListJuzModel() { }

    public ListJuzModel(String namaJuz, String keteranganJuz) {
        this.namaJuz = namaJuz;
        this.keteranganJuz = keteranganJuz;
    }

    public String getNamaJuz() {
        return namaJuz;
    }

    public void setNamaJuz(String namaJuz) {
        this.namaJuz = namaJuz;
    }

    public String getKeteranganJuz() {
        return keteranganJuz;
    }

    public void setKeteranganJuz(String keteranganJuz) {
        this.keteranganJuz = keteranganJuz;
    }
}
