package vanh.LamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        demo((x,y) -> x+y);
        IMath cal1 = (x,y) -> x-y;
        demo(cal1);

        // Danh sach Functional Interface dung san:  consumer, predicate, function, supplier
        Predicate<Integer> isEven = n -> n%2==0;
        System.out.println(isEven.test(10));

    }

    public static void demo (IMath cal){
        int a =100, b=10;
        int rs = cal.calculate(a,b);
        System.out.println(rs);
    }
}
