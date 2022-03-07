package day2;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-03-02 10:20 上午
 */
public class demo6 {

    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                for (int k=1;k<5;k++){
                    if (i != j && j != k && i != k){
                        System.out.print(i*100 + j*10 + k + " ");
                    }
                }
            }
        }
    }
}
