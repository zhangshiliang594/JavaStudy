package Demo;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-01-30 10:22 上午
 */
public class DemoMun {

    Scanner input = new Scanner(System.in);

    public void LoginPage(){
        while(true){
            System.out.println("欢迎进入垃圾废物登录页面\n");
            System.out.println("1、登录系统\n");
            System.out.println("2.退出系统\n");
            System.out.println("=====================================");
            System.out.println("请输入选择功能：");
            int choose = input.nextInt();
            if (choose == 1){
                mainPage();
                break;
            }
            else if(choose == 2){
                System.out.println("系统退出成功。");
                break;
            }
            else{
                System.out.println("输入错误。。。");
                break;
            }
        }
    }

    public void mainPage(){

        for (;;){
            System.out.println("欢迎进入垃圾功能选择页面\n");
            System.out.println("1.客户信息管理\n");
            System.out.println("2.真情回馈\n");
            System.out.println("===========================");
            System.out.println("请选择，输入0返回上一级页面。。。");
            int choose = input.nextInt();
            if (choose == 0){
                LoginPage();
                break;
            }
            else if(choose == 1){
                custPage();
                break;
            }
            else if(choose == 2){
                sendPage();
                break;
            }
            else{
                System.out.println("输入错误，请重新输入。");
            }
        }

    }

    public void custPage(){

        while(true){
            System.out.println("欢迎进入垃圾功能选择页面>客户信息管理页面");
            System.out.println("==========================\n");
            System.out.println("1.添加用户\n");
            System.out.println("2.修改用户\n");
            System.out.println("3.删除用户\n");
            System.out.println("==========================");
            System.out.println("请选择，输入0返回上一级页面。");
            int choose = input.nextInt();
            if (choose == 0){
                mainPage();
                break;
            }
            else if(choose == 1){
                System.out.println("执行添加用户");
                System.out.println("请输入用户信息");
                String stu = input.next();
                System.out.println("添加用户成功，用户：" + stu);
                break;
            }
            else if(choose == 2){
                System.out.println("执行修改用户");
                System.out.println("输入需要修改用户信息");
                String stu1 = input.next();
                System.out.println("修改用户信息成功，用户：" + stu1);
                break;
            }
            else if(choose == 3){
                System.out.println("执行删除用户");
                System.out.println("输入需要删除用户信息");
                String stu2 = input.next();
                System.out.println("删除用户信息成功，用户：" + stu2);
                break;
            }
            else {
                System.out.println("输入错误");
                break;
            }
        }

    }

    public void sendPage(){

        while (true)
        {
            System.out.println("欢迎进入垃圾功能选择页面>真情回馈页面");
            System.out.println("==============================");
            System.out.println("1.积分赠送\n");
            System.out.println("2.幸运大抽奖\n");
            System.out.println("=============================");
            System.out.println("请选择，输入0返回上级页面");
            int choose = input.nextInt();
            if (choose == 0){
                mainPage();
                break;
            }
            else if(choose == 1){
                System.out.println("赠送100积分");
                break;
            }
            else if(choose == 2){
                System.out.println("抽中100块");
                break;
            }
            else {
                System.out.println("回家吃屎");
                break;
            }
        }
    }
}
