import java.io.*;
import java.text.*;
import java.util.*;

public class MsgLog {
    protected static String defaultLogFile = "msglog.txt";

    public static void write(String s) throws IOException {
        write(defaultLogFile, s);
    }

    public static void write(String f, String s) throws IOException {
        TimeZone tz = TimeZone.getTimeZone("EST");// or PST,MID,etc..
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        df.setTimeZone(tz);
        String currentTime = df.format(now);
        FileWriter awriter = new FileWriter(f, true);
        awriter.write(currentTime + " " + s + "\n");
        awriter.flush();
        awriter.close();
    }

    public static void main(String args[]) throws Exception {
        write(args[0]);
    }
}
