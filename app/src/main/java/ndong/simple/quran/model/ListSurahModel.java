package ndong.simple.quran.model;

public class ListSurahModel {

    private String urutan, namaSurah, relevasiSurah, ayatSurah;

    public ListSurahModel() {
    }

    public ListSurahModel(String urutan, String namaSurah, String relevasiSurah, String ayatSurah) {
        this.urutan = urutan;
        this.namaSurah = namaSurah;
        this.relevasiSurah = relevasiSurah;
        this.ayatSurah = ayatSurah;
    }

    public String getUrutan() {
        return urutan;
    }

    public void setUrutan(String urutan) {
        this.urutan = urutan;
    }

    public String getNamaSurah() {
        return namaSurah;
    }

    public void setNamaSurah(String namaSurah) {
        this.namaSurah = namaSurah;
    }

    public String getRelevasiSurah() {
        return relevasiSurah;
    }

    public void setRelevasiSurah(String relevasiSurah) {
        this.relevasiSurah = relevasiSurah;
    }

    public String getAyatSurah() {
        return ayatSurah;
    }

    public void setAyatSurah(String ayatSurah) {
        this.ayatSurah = ayatSurah;
    }
}
