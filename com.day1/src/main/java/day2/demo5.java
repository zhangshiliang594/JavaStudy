package day2;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-03-02 10:07 上午
 */
public class demo5 {

    public static void main(String[] args) {
        int h = 100; int sum = 0;
        for (int i=0;i<10;i++){
            sum = sum + h;
            h = h / 2;
        }
        System.out.println("弹跳10次总距离：" + sum);
        System.out.println("弹跳10次此时的高度：" + h);
    }
}
