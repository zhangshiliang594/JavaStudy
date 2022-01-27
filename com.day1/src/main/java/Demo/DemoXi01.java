package Demo;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description 以表格形式输出5笔购物金额及总金额
 * @create 2022-01-26 2:22 下午
 */
public class DemoXi01 {

    public static void main(String[] args) {
        //创建double类型数组
        double[] money = new double[5];
        //输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入会员本月消费记录");
        //循环输入
        for (int i = 0; i<money.length; i++){
            System.out.println("请输入第" + (1+i) + "笔购物金额：");
            money[i] = scanner.nextDouble();
        }
        System.out.println("");
        //总金额
        double sum = 0;
        System.out.println("序号\t\t" + "金额(元)");
        //循环打印输出
        for (int i=0; i< money.length; i++){
            System.out.println((i+1) + "\t\t" + money[i]);
            sum+=money[i];
        }
        System.out.println("总金额\t\t" + sum);
    }
}
