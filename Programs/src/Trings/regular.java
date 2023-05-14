package Trings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular 
{

    public static void main(String[] args) {
        String s="rhfsdd1124545bsdhfgusdjhnvahjfjh";
        Pattern p=Pattern.compile(".*[0-9].*");
        System.out.println(p);
        Matcher m=p.matcher(s);
        System.out.println(m);
        boolean n=m.matches();
        System.out.println(n);
    }
}
