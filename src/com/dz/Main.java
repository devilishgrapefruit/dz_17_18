package com.dz;

import java.util.regex.Matcher; // используется для поиска в тексте нескольких вхождений регулярного выражения
import java.util.regex.Pattern;// применяется для определения регулярных выражений,
                                      //для которого ищется соответствие в строке
public class Main {

    public static void main(String[] args) {
        // 1 задание
        String substr = "abcdefghijklmnopqrstuv18340"; 
        String str = "abcdefghijklmnoasdfasdpqrstuv18340";
        Pattern pattern = Pattern.compile(str);
        Matcher matcher1 = pattern.matcher(substr);
        boolean matches1 = matcher1.matches();
        System.out.println(matches1);
        Matcher matcher2 = pattern.matcher(str);
        boolean matches2 = matcher2.matches();
        System.out.println(matches2);
        // 2 задание
        Pattern patternMac = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Matcher m1 = patternMac.matcher( "aE:dC:cA:56:76:54" );
        boolean matcherMac1 = m1.matches();
        System.out.println(matcherMac1);
        Matcher m2 = patternMac.matcher("01:23:45:67:89:Az");
        boolean matcherMac2 = m2.matches();
        System.out.println(matcherMac2);
        // 3 задание
        Pattern patternPrice = Pattern.compile("(((\\d\\d)(.\\d\\d))|(\\d\\d))( )((USD)|(RUB)|(EU))");
        Matcher mat1 = patternPrice.matcher("22 UDD");
        boolean matcherPrice1 = mat1.matches();
        System.out.println(matcherPrice1);
        Matcher mat2 = patternPrice.matcher("23.78 USD");
        boolean matcherPrice2 = mat2.matches();
        System.out.println(matcherPrice2);

    }
}