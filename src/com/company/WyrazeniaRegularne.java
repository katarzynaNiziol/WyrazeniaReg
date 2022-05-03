package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("^[\\d]{2,7}-[\\d]{3}$");
        Matcher m = p.matcher("00-000");

        System.out.println(m.find());
        System.out.println(m.matches());





    }
}
