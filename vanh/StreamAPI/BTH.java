package vanh.StreamAPI;

import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class BTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Phương thức tạo stream : .stream()
        // phương thức trung gian: distinct, limit, skip, filter, map, sorted
        // phương thức đầu cuối : foreach , reduce, min, max, count, collect , toList,
        // findAny, findFirst, anyMatch , allMatch

        /*
        Tạo 1 danh sách ngẫu nhiên 100 số từ 0 - 100 (có trùng)
        1. Duyệt và tìm ra các số nguyên tố trong danh sách
        2. Duyệt và tính tổng tất cả các số chia hết cho 3
        3. Đêm số lần xuất hiện của giá trị 10 trong danh sách
        4. Kiểm tra tồn tại của giá trị 50 trong danh sách
        */

        Random random = new Random();
        Collection<Integer> list = Stream.generate(() -> random.nextInt(100)).limit(100).toList();
        System.out.println(list);

        //1. Duyệt và tìm ra các số nguyên tố trong danh sách
        list.stream().filter(BTH::isPrime)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        //2. Duyệt và tính tổng tất cả các số chia hết cho 3
        Integer sum = list.stream().filter(i -> i % 3 == 0).reduce(0, Integer::sum);
        System.out.println(sum);

        //3. Đêm số lần xuất hiện của giá trị 10 trong danh sách
        long cnt = list.stream().filter(i -> i==10).count();
        System.out.println(cnt);

        //4. Kiểm tra tồn tại của giá trị 50 trong danh sách\
        boolean exist = list.stream().anyMatch(n -> n == 50);
        System.out.println(exist?"co":"khong");
    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
