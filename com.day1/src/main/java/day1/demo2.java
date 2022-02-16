package day1;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方
 * @create 2022-02-14 10:28 上午
 */
public class demo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = scanner.nextInt();
        int i = num /100;
        int j = num / 10 % 10;
        int k = num % 10;
        if (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3) == num){
            System.out.print( num + "是水仙花数字...");
        }else{
            System.out.print(num + "不是水仙花数字...");
        }
    }
}
