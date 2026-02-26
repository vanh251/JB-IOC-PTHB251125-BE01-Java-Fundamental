package vanh.StreamAPI;

import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //tao 1000 so ngau nhien
        Random random = new Random();
//        random.nextInt(100);

        Collection<Integer> randomList = Stream.generate(()->random.nextInt(100)).distinct().limit(100).toList();
        System.out.println(randomList);

        //loc cac so le
        randomList.stream().filter(num -> num % 2==1).filter(num-> num > 50)
                .forEach(System.out::println);

        //Tinh tong cac so chan
        int rs =randomList.stream().filter(num -> num %2 ==0)
                .reduce(0,(val, tmp) -> val + tmp);
        System.out.println(rs);

        // Min Max
        int res =randomList.stream().min((o1, o2) -> o1 - o2).get();
        System.out.println(res);
        res =randomList.stream().max((o1, o2) -> o1 - o2).get();
        System.out.println(res);


    }
}
