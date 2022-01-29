package Demo;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-27 11:01 上午
 */
public class DemoMp {

    String name;
    String tickle;
    int age;

    public void info(){
        tickle = age <= 12 ? "免费" : "价格为：12元";
        System.out.println(name + "的年龄为：" + age + "，门票" + tickle + "\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = " ";
        while (true){
            DemoMp person = new DemoMp();
            if (!name.equals("n")){
                System.out.print("请输入姓名：");
                name = scanner.next();
                if (name.equals("n")){
                    System.out.println("退出程序！");
                    break;
                }
                System.out.println("请输入年龄：");
                age = scanner.nextInt();
                person.name = name;
                person.age = age;
                person.info();
            }else {
                break;
            }
        }
    }
}
