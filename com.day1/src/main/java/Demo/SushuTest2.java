package Demo;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-26 11:26 上午
 */
public class SushuTest2 {

    public static void main(String[] args) {

        for (int i = 3; i <= 100; i+=2){

            boolean k = true;

            for (int j = 3; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    k = false;
                }
            }
            if (k){
                System.out.print(i + " ");
            }
        }
    }
}
