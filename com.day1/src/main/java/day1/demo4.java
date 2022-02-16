package day1;

import java.sql.SQLOutput;
import java.util.*;
/**
 * @author zhangshiliang
 * @Description
 * @create 2022-02-16 5:23 下午
 */
public class demo4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = input.nextInt();
        int k = 2;
        System.out.print(n + "=");
        while (k<=n){
            if (k==n){
                System.out.print(n);
                break;
            }else if (n % k == 0){
                System.out.print(k + "*");
                n = n / k;
            }
            else k++;
        }
    }
}
