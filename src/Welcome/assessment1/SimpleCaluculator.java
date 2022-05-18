package Welcome.assessment1;

public class SimpleCaluculator {
    public static void main(String[] args) {
        int a= 5, b=10;
        char op= '+';
        switch(op){
            case '+':
                System.out.println(a+b);
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
            case '/':
                System.out.println(a/b);


        }
    }
}
