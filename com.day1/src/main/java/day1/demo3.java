package day1;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-02-15 5:19 下午
 */
public class demo3 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i<= 999; i++){
            int s = i /100;
            int j = i / 10 % 10;
            int k = i % 10;
            if (s*s*s + j*j*j + k*k*k == i){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.print("\n水仙花数字总共有：" + count);
    }
}
