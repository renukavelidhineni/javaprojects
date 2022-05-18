package Welcome.stringInJava;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer(" hi good morning all", " ");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
            str.countTokens();
            System.out.println(str.countTokens());
            StringTokenizer str2 = new StringTokenizer("time is now 1.08 am", " ");
            while (str2.hasMoreTokens()) {
                System.out.println(str2.nextToken());

               // System.out.println(str.equals(str2));
                //System.out.println(str2.nextElement());


            }

        }
    }
}
