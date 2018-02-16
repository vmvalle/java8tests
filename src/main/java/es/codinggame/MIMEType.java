package es.codinggame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MIMEType {

    public static void main(String [] args) {
        HashMap<String, String> MIMEtypes = new HashMap<>();
        MIMEtypes.put("wav", "audio/x-wav");
        MIMEtypes.put("mp3", "audio/mpeg");
        MIMEtypes.put("pdf", "application/pdf");

        List<String> files = new ArrayList<>();
        files.add("a");
        files.add("a.wav");
        files.add("b.wav.tmp");
        files.add("test.vmp3");
        files.add("pdf");
        files.add(".pdf");
        files.add("mp3");
        files.add("report..pdf");
        files.add(".mp3.");
        files.add("final.");

//        Failure
//        Found:  UNKNOWN
//        Expected:  application/pdf

        for (String file : files) {
            String extension = null;
            String[] s = file.split("\\.");
            if(s.length >= 2 && MIMEtypes.containsKey(extension = s[s.length - 1].toLowerCase()) && !file.substring(file.length() - 1).equals(".")) {
                System.out.println(MIMEtypes.get(extension));
            } else {
                System.out.println("UNKNOWN");
            }
        }


    }


}
