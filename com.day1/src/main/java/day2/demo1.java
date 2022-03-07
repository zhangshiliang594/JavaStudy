package day2;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-03-01 2:41 下午
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int r = input.nextInt();
        String grade = r >= 90?"A，你含棒棒！！！" :r >= 60?"B，你就一般般！！！":"C，你是垃圾狗屎💩！！！";
        System.out.println("你的成绩等级为：" + grade);
    }
}
