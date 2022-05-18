package Welcome.assessment1;

public class SwapNumers {
    public static void main(String[] args) {
        int a = 10, b = 15;
        int c;
        System.out.println("before swap a:" + a);
        c = b;
        a = b;
        b = c;
        System.out.println("after swap a:" + a);
        char ch1 = 'v';
        char ch2 = 'r';
        char ch3;
        System.out.println("before swap ch1:" + ch1);
        ch3 = ch1; ch1 = ch2; ch2 = ch3;
        System.out.println("after swap ch1:" + ch1);
        float i= 4.5f;
        float j= 4.0f;
        float k;
        System.out.println("before swap i:" + i);
        k = j; i = j; j= k;
        System.out.println("after swap i:" + i);

    }

}