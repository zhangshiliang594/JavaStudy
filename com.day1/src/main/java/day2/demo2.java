package day2;

import java.util.Scanner;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-03-01 2:51 下午
 */
public class demo2 {
    public static void main(String[] args) {

        int digital = 0;
        int character = 0;
        int blank = 0;
        int other = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = input.nextLine();
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i=0;i<len;i++){
            if (chars[i]>='0' && chars[i]<='9'){
                digital++;
            }else if (chars[i]>= 'a'&&chars[i]<='z' || chars[i]>='A'&&chars[i]<='Z'){
                character++;
            }else if (chars[i] == ' '){
                blank++;
            }else{
                other++;
            }
        }
        System.out.println("====================");
        System.out.println("数字个数为：" + digital);
        System.out.println("字母个数为：" + character);
        System.out.println("空格个数为：" + blank);
        System.out.println("其他个数为：" + other);
    }
}
