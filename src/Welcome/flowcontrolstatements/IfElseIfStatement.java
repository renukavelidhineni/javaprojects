package Welcome.flowcontrolstatements;

public class IfElseIfStatement {
    public static void main(String[] args){
        int var1=2, var2=3, res;
        res=var1+var2;
        float div=(float) (var1/var2);
        System.out.println("divison="+ div);
        System.out.println("addition="+ res );
        if(var1!=var2){
            System.out.println(" not equal");
            if(var2>var1){
                System.out.println(" var2 is big");
                if(res==var2){
                    System.out.println(" it is equal");
                }
                else{
                    System.out.println(" it is not equal");

                    }
                }
            }

        }

    }

