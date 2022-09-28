
package ndong.simple.quran.data.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DetailJuzResponse {

    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {

        @SerializedName("juzStartInfo")
        @Expose
        private String juzStartInfo;
        @SerializedName("juzEndInfo")
        @Expose
        private String juzEndInfo;
        @SerializedName("verses")
        @Expose
        private List<Verse> verses = null;

        public String getJuzStartInfo() {
            return juzStartInfo;
        }

        public void setJuzStartInfo(String juzStartInfo) {
            this.juzStartInfo = juzStartInfo;
        }

        public String getJuzEndInfo() {
            return juzEndInfo;
        }

        public void setJuzEndInfo(String juzEndInfo) {
            this.juzEndInfo = juzEndInfo;
        }

        public List<Verse> getVerses() {
            return verses;
        }

        public void setVerses(List<Verse> verses) {
            this.verses = verses;
        }

        public static class Verse {

            @SerializedName("text")
            @Expose
            private Text text;
            @SerializedName("translation")
            @Expose
            private Translation translation;

            public Text getText() {
                return text;
            }

            public void setText(Text text) {
                this.text = text;
            }

            public Translation getTranslation() {
                return translation;
            }

            public void setTranslation(Translation translation) {
                this.translation = translation;
            }

            public static class Text {

                @SerializedName("arab")
                @Expose
                private String arab;
                @SerializedName("transliteration")
                @Expose
                private Transliteration transliteration;

                public String getArab() {
                    return arab;
                }

                public void setArab(String arab) {
                    this.arab = arab;
                }

                public Transliteration getTransliteration() {
                    return transliteration;
                }

                public void setTransliteration(Transliteration transliteration) {
                    this.transliteration = transliteration;
                }

                public static class Transliteration {

                    @SerializedName("en")
                    @Expose
                    private String en;

                    public String getEn() {
                        return en;
                    }

                    public void setEn(String en) {
                        this.en = en;
                    }

                }

            }

            public static class Translation {

                @SerializedName("id")
                @Expose
                private String id;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

            }

        }

    }

}


