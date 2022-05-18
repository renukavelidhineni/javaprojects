package Welcome.overloadingAndOverriding;

public class OverridingDemo extends OverLoading{
    @Override
    int calculate(int a, int b) {
        return super.calculate(a, b);
    }


    float calculate(float a, int b, int c) {
       return a-b+c;
    }
}
