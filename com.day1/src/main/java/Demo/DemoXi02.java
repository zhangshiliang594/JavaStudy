package Demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description 循环录入5位学员成绩，进行升序排列后输出结果
 * @create 2022-01-26 3:43 下午
 */
public class DemoXi02 {

    public static void main(String[] args) {

        int[] source = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5位学员的成绩：");
        for (int i=0; i < source.length; i++){
            source[i] = scanner.nextInt();
        }
        Arrays.sort(source);
        System.out.println("学员成绩按升序排列：");
        for (int j = 0; j< source.length; j++){
            System.out.print(source[j] + " ");
        }
    }


}
