package Demo;

import java.util.List;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-22 2:25 下午
 */
public class First {
    public static void main(String[] args) {
        System.out.println("hello Java!!!!");
        int a = 18;
        int b = 2;
        int result = a / b ;
        switch (result){
            case 1:
                System.out.printf("星期一");
                break;
            case 2:
                System.out.printf("星期二");
                break;
            default:
                System.out.printf("只有礼拜一到礼拜七");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
        }

    }
}
