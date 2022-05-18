package Welcome.overloadingAndOverriding;

public class OverLoading {
     int calculate(int a,int b){
         return a-b;
    }
    //float calculate(float a,int b,int c){
         //return a+b-c;
   //}

    public static void main(String[] args) {
        OverLoading od=new OverLoading();
        System.out.println(od.calculate(10,5));
       // System.out.println(od.calculate(20,10,5));
        OverridingDemo ord= new OverridingDemo();
        System.out.println(ord.calculate(5,5));
        System.out.println(ord.calculate(5,10,15));
        OverLoading od1=new OverridingDemo();
        System.out.println(ord.calculate(5,15));
        System.out.println(ord.calculate(5,15,25));

    }
}
