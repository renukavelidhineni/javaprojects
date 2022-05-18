package Welcome.productapplication;

import Welcome.loopingstatements.ProductInformation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Products {
    public static void main(String[] args) {
        ProductInformation p1 = new ProductInformation();
        p1.setPno(66566);
        p1.setPname("soap");
        p1.setPrate(26.50);
        p1.setPdisc(5.0);
        ProductInformation p2 = new ProductInformation();
        p2.setPno(66567);
        p2.setPname("ball");
        p2.setPrate(15.25);
        p2.setPdisc(3.0);
        ProductInformation p3 = new ProductInformation();
        p3.setPno(66568);
        p3.setPname("pen");
        p3.setPrate(10.00);
        p3.setPdisc(1.5);
        List<ProductInformation> l1 = new ArrayList<>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i).getPname());
            System.out.println(l1.get(i).getPno());
            System.out.println(l1.get(i).getPrate());
        }
                double discofp1 = p1.prate - p1.pdisc;
                System.out.println("p1 disc is:" + discofp1);
                double discofp2 = p2.prate - p2.pdisc;
                System.out.println("p2 disc is:" + discofp2);
                double discofp3 = p3.prate - p3.pdisc;
                System.out.println("p3 disc is:" + discofp3);

            }
        }



