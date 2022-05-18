package Welcome.stringInJava;

public class StringBufferProg {
    public static void main(String[] args) {
        StringBuffer sb1= new StringBuffer("hi");
        StringBuffer sb2= new StringBuffer(" good morning");
        System.out.println(sb1.append(sb2));
        //System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb2.append(" vinnu"));
        //System.out.println(sb2);
        StringBuffer sb3= new StringBuffer((sb1));
        System.out.println("both strings is :" + sb3.append(sb2));
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println("modified sb3 is :" +sb3.delete(16,29));
        //System.out.println(sb3);
        System.out.println(sb3.replace(0,15," bye"));
        sb3.reverse();
        System.out.println("reverse of string sb3: " + sb3);
        sb1.delete(2,15);
        //modiified sb1
        System.out.println( sb1.append('i'));
        System.out.println(sb2.capacity());











    }
}
