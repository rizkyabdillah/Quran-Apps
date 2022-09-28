package ndong.simple.quran.model;

public class DetailSurahModel {

    private int nomorSurah;
    private String ayat, latin, arti;

    public DetailSurahModel() {
    }

    public DetailSurahModel(int nomorSurah, String ayat, String latin, String arti) {
        this.nomorSurah = nomorSurah;
        this.ayat = ayat;
        this.latin = latin;
        this.arti = arti;
    }

    public int getNomorSurah() {
        return nomorSurah;
    }

    public void setNomorSurah(int nomorSurah) {
        this.nomorSurah = nomorSurah;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }
}
