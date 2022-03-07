package day1;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * @create 2022-02-16 5:39 下午
 */
public class demo5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入分数：");
        int source = input.nextInt();
        switch (source/10){
            case 9:
                System.out.println("该同学成绩为A");
                break;
            case 8:
            case 7:
                System.out.println("该同学成绩为B+");
                break;
            case 6:
                System.out.println("该同学成绩为B");
                break;
            default:
                System.out.println("该同学成绩为C");
                break;
        }
    }
}
