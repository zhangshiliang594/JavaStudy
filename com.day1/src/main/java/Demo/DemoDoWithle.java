package Demo;

/**
 * @author zhangshiliang
 * @Description do while
 * @create 2022-01-27 9:20 上午
 */
public class DemoDoWithle {

    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        do {
            if (i % 2 == 0){
                result += i;
            }
            i++;
        }while (i <= 100);
        System.out.print(result);
    }
}
