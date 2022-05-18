package Welcome.overloadingAndOverriding;

public class Watches {
    public  void name(String name1){
        System.out.println("watch name is:" +name1);

    }
    public  void name(long prise){
        System.out.println("watch prise is:" +prise);


    }

    public static void main(String[] args) {
        Watches wt=new Watches();
        wt.name("fastrack");
        wt.name(2000);
        Times tm= new Times();
        tm.name("times");
        tm.name(3500);
        Watches model= new Times();
        model.name("samsung");
        model.name(3000);






    }


}
