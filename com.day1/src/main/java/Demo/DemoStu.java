package Demo;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-30 9:38 上午
 */
public class DemoStu {

    String name;
    int pwd;

    public void adminInfo(){
        System.out.println("姓名：" + name + "，密码：" + pwd);
    }

    public void modifyInfo(){

    }

    public static void main(String[] args) {
        DemoStu demoStu1 = new DemoStu();
        demoStu1.name = "admin1";
        demoStu1.pwd = 111111;
        demoStu1.adminInfo();

        DemoStu demoStu2 = new DemoStu();
        demoStu2.name = "admin2";
        demoStu2.pwd = 222222;
        demoStu2.adminInfo();

        DemoStu demoStu3 = new DemoStu();
        demoStu3.name = "admin3";
        demoStu3.pwd = 333333;
        demoStu3.adminInfo();

        Scanner stu = new Scanner(System.in);
        boolean isFlag = true;
        while (isFlag){
            System.out.println("请输入姓名：");
            String name = stu.next();
            System.out.println("请输入密码：");
            int pwd = stu.nextInt();
            if (name.equals("admin1") && pwd == 111111){
                System.out.println("请输入新密码：");
                int passwd = stu.nextInt();
                System.out.println("密码修改成功，您的新密码为：" + passwd);
            }else{
                System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
                break;
            }
        }
    }
}
