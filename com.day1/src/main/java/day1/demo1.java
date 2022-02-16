package day1;

/**
 * @author zhangshiliang
 * @Description 判断101-200之间有多少个素数，并输出所有素数
 * @create 2022-02-14 10:00 上午
 */
public class demo1 {

    public static void main(String[] args) {
        int count=0,b = 0;
        for (int i = 101; i<=200; i++){
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    b = 0;
                    break;
                }else {
                    b=1;
                }
            }
            if (b != 0){
                count ++;
                System.out.print(i + ",");
            }
        }
        System.out.println("素数个数：" + count);
    }
}
