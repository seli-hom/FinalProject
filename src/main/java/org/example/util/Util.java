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
        if (strIn.isEmpty()){
            return null;
        }

        for (int i = 0; i < names.length; i++){
            String fName1 = names[i].substring(0, 1).toUpperCase();
            String fName2 = names[i].substring(1).toLowerCase();
            String fullName = fName1 + fName2;
            strOut += fullName;
            if (i == names.length - 1){
                break;
            } else {
                strOut += " ";
            }
        }
        return strOut;
    }
}
