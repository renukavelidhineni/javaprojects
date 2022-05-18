package Welcome.overloadingAndOverriding;

public class Times extends Watches{
    @Override
    public void name(String name1) {
        super.name(name1);

    }


    @Override
    public void name(long prise) {
        super.name(prise);
    }
}