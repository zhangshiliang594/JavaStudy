package Demo;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-02-14 8:55 上午
 */
public class Demopaixu {

    public static void main(String[] args) {

        int[] l = {23,12,34,31,27,21,18,8,3};

        for (int i = 0; i< l.length-1;i++){
            for (int j = 0;j<l.length-1-i;j++){
                if (l[j]>l[j+1]){
                    int temp = l[j];
                    l[j] = l[j+1];
                    l[j+1] = temp;
                }
            }
        }
        System.out.print("排序结果：");
        for (int i : l){
            System.out.print(i + " ");
        }
    }
}
