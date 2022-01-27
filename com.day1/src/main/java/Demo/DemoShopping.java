package Demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description 求4家店的最低手机价格
 * @create 2022-01-27 10:26 上午
 */
public class DemoShopping {

    public static void main(String[] args) {

        int[] jiage = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入4家店的价格：");
        int i = 0;
        while (i<jiage.length){
            System.out.print("第"+(i+1)+"家店的价格：");
            jiage[i] = scanner.nextInt();
            i++;
        }
        int min = jiage[0];
        for (int j = 0; j<jiage.length; j++){
            if (min > jiage[j]){
                min = jiage[j];
            }
        }
        System.out.println("最低价格是：" + min);
//        Arrays.sort(jiage);
//        System.out.println("最低价格是：" + jiage[0]);
    }
}
