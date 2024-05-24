package org.example.util;

import java.util.Arrays;

public class Util {


    /**
     *  Converts each word in a string to title case
     * @param strIn a string with multiple words
     * @return a string where each word is in title case
     */
    public static String toTitleCase(String strIn){
        String strOut = "";
        String[] names = (strIn.split(" "));

        String fName1 = names[0].substring(0,1).toUpperCase();
        String fName2 = names[0].substring(1).toLowerCase();
        String fullName = fName1 + fName2;
        strOut += fullName;
        String fName3 = names[1].substring(0,1).toUpperCase();
        String fName4 = names[1].substring(1).toLowerCase();
        String fullName2 = fName1 + fName2;
        strOut += fullName2;

        return strOut;
    }
}
