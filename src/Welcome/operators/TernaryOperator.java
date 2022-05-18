package Welcome.operators;

public class TernaryOperator {
    public static void main(String[] args){
        int num1=8, num2=10, res;
        System.out.println(" First num is=" +num1);
        System.out.println("second num is=" +num2);

            res=(num1>num2)?num1/num2:num1+num2;

        System.out.println("result is=" +res);
    }
}
