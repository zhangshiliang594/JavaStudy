package Demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description 将一组乱序字符进行排序
 * @create 2022-01-26 6:18 下午
 */
public class DemoXi03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] strings = {'a','c','u','b','e','p','f','z'};
        System.out.print("原字符排序：");
        for (int i = 0; i < strings.length; i++){
            System.out.print(strings[i] + " ");
        }
        Arrays.sort(strings);
        System.out.print("\n升序排列：");
        for (int j = 0; j < strings.length; j++){
            System.out.print(strings[j] + " ");
        }
        System.out.print("\n降序排序后：");
        for (int k = 0; k< strings.length; k++){
            for (int s = strings.length-1;s>=k+1;s--){
                if (strings[s] > strings[s-1]){
                    int temp = strings[s-1];
                    strings[s-1] = strings[s];
                    strings[s] = (char) temp;
                }
            }
        }
        for (int i=0; i<strings.length; i++){
            System.out.print(strings[i] + " ");
        }
    }
}
