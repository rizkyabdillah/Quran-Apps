
package ndong.simple.quran.data.network.response;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListSurahResponse {

    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }


    public static class Datum {

        @SerializedName("numberOfVerses")
        @Expose
        private int numberOfVerses;

        @SerializedName("number")
        @Expose
        private int number;

        @SerializedName("name")
        @Expose
        private Name name;

        @SerializedName("revelation")
        @Expose
        private Revelation revelation;

        public int getNumberOfVerses() {
            return numberOfVerses;
        }

        public void setNumberOfVerses(int numberOfVerses) {
            this.numberOfVerses = numberOfVerses;
        }

        public Name getName() {
            return name;
        }

        public void setName(Name name) {
            this.name = name;
        }

        public Revelation getRevelation() {
            return revelation;
        }

        public void setRevelation(Revelation revelation) {
            this.revelation = revelation;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }


        public static class Name {

            @SerializedName("short")
            @Expose
            private String _short;

            @SerializedName("transliteration")
            @Expose
            private Transliteration transliteration;

            public String getShorts() {
                return _short;
            }

            public void setShorts(String _short) {
                this._short = _short;
            }

            public Transliteration getTransliteration() {
                return transliteration;
            }

            public void setTransliteration(Transliteration transliteration) {
                this.transliteration = transliteration;
            }

            public static class Transliteration {

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

        public static class Revelation {

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

