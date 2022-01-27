package Demo;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-27 9:29 上午
 */
public class DemoWhile {

    public static void main(String[] args) {

        int i = 1;
        int result = 0;
        while(i <= 100){
            if (i % 2 == 0){
                result += i;
            }
            i++;
        }
        System.out.println(result);
    }
}
