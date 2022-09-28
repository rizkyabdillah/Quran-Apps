package ndong.simple.quran.model;

public class ListSurahInJuz {

    private final int nomorStart, nomorStop, urutanSurah;

    private ListSurahInJuz(Builder buillder) {
        this.nomorStart = buillder.nomorStart;
        this.nomorStop = buillder.nomorStop;
        this.urutanSurah = buillder.urutanSurah;
    }

    public int getNomorStart() {
        return nomorStart;
    }

    public int getNomorStop() {
        return nomorStop;
    }

    public int getUrutanSurah() {
        return urutanSurah;
    }

    public static class Builder {
        private int nomorStart, nomorStop;
        private final int urutanSurah;

        public Builder(int urutanSurah) {
            this.urutanSurah = urutanSurah;
        }

        public Builder setNomorStart(int nomorStart) {
            this.nomorStart = nomorStart;
            return this;
        }

        public Builder setNomorStop(int nomorStop) {
            this.nomorStop = nomorStop;
            return this;
        }

        public ListSurahInJuz build() {
            return new ListSurahInJuz(this);
        }

    }

}
