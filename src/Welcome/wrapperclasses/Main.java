package Welcome.wrapperclasses;

public class Main {
    public static void main(String[] args) {
        Example example=new Example();
        System.out.println(example.getI());

        Integer integer=new Integer(5);
        int i= integer;
        System.out.println(integer);
        Float fl=new Float(6);
        float f= fl;
        System.out.println(fl);
    }
}
