package Demo;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-27 9:31 上午
 */
public class DemoFor {

    public static void main(String[] args) {

        int[] num = {23,21,13,16,34,31};

        for (int i=0; i<num.length-1; i++){
            for (int j=0; j<num.length-1-i;j++){
                if (num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("排序结果：");
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
