package day2;

import java.util.Arrays;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-03-02 9:45 上午
 */
public class demo4 {

    public static void main(String[] args) {
        System.out.println("打印输出1-1000的所有完数");
        for (int i=1;i<=1000;i++){
            int t = 0;
            for (int j = 1; j <= i / 2; j++){
                if (i%j == 0){
                    t = t+j;
                }
            }
            if (t==i){
                System.out.print(i + " ");
            }
        }
        int[] Arrary = {1,2,3,4,5};
        System.out.println(Arrays.toString(Arrary));
    }
}
