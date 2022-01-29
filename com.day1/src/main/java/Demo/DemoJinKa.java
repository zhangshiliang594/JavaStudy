package Demo;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-29 11:54 上午
 */
public class DemoJinKa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DemoTest test = new DemoTest();
        System.out.println("请输入你的信用卡积分：");
        test.Cark = scanner.nextInt();
        System.out.println("请输入你的信用卡类型：");
        test.CardType = scanner.next();
        test.kehu();
    }

}
class DemoTest {
    int Cark;
    String CardType;

    public void kehu(){
        System.out.println("积分：" + Cark + "，卡类型：" + CardType);
        if ((Cark <= 1000 || !"金卡".equals(CardType)) && (Cark <= 5000 || !"普通卡".equals(CardType))) {
            return;
        }
        System.out.println("回馈积分500。");
    }
}
