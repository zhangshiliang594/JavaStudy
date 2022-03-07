package day2;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-03-01 5:15 下午
 */
public class demo3 {

    public static void main(String[] args) {
        long a,b = 0,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字a的值：");
        a = input.nextInt();
        System.out.println("请输入需要相加的数n：");
        int n = input.nextInt();
        int i = 0;
        while (i < n){
            b = b+a;
            sum = b+sum;
            a = a*10;
            i++;
            System.out.println(b);
        }
        System.out.println(sum);
    }
}
