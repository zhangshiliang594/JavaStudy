package Demo;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-26 11:17 上午
 */
public class SushuTest {

    public static void main(String[] args) {

        for (int i = 3; i <= 100; i++){
            boolean k = true;
            for (int n = 2; n < i; n++){
                if (i % n == 0){
                    k = false;
                    break;
                }
            }
            if (k){
                System.out.print(i + " ");
            }
        }
    }
}
