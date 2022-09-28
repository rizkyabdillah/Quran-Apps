package ndong.simple.quran.helper;

import java.io.IOException;
import java.net.SocketTimeoutException;

public class Throw {

    public static String getErrorResponse(Throwable t) {
        if (t instanceof SocketTimeoutException) {
            return "Socket timeout";
        } else if (t instanceof IOException) {
            return "Connection timeout";
        } else {
            return t.getMessage();
        }
    }

}
