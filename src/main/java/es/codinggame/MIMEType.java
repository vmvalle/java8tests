package es.codinggame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MIMEType {

    public static void main(String [] args) {
        HashMap<String, String> MIMEtypes = new HashMap<>();
        MIMEtypes.put("html", "text/html");
        MIMEtypes.put("png", "image/png");

        List<String> files = new ArrayList<>();
        files.add("test.html");
        files.add("noextension");
        files.add("portrait.png");
        files.add("doc.TXT");

        for (String file : files) {
            String extension = null;
            String[] s = file.split("\\.");
            if(s.length == 2 && MIMEtypes.containsKey(extension = s[1].toLowerCase())) {
                System.out.println(MIMEtypes.get(extension));
            } else {
                System.out.println("UNKNOWN");
            }
        }


    }


}
