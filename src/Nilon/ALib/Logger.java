package Nilon.ALib;

import jdk.jfr.Unsigned;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * logging class
 */
public class Logger {
    @Unsigned
    public static byte exists = 0;
    private static void makeLogFile() {
        try {
            File myObj = new File("ALibLog.log");
            if (myObj.createNewFile()) exists = 0;
            else exists = 1;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void log(String toLog) throws IOException {
        if(exists == 0){
            FileWriter fw = new FileWriter("ALibLog.log", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(toLog);
            bw.newLine();
            bw.close();
        } else if (exists == 1) {
            makeLogFile();
            System.out.println("a");
            log(toLog);
        }
    }
}


