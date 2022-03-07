package Demo;

/**
 * @author zhangshiliang
 * @Description
 * @create 2022-03-04 9:30 上午
 */
public class phone {

    String name;
    String color;
    String jine;

    public void getphonename(String name){
        System.out.println("手机型号:" + name);
    }

    public void getphonecolor(String color){
        System.out.println("手机颜色：" + color);
    }

    public void getphonejine(String jine){
        System.out.println("手机价格：" + jine);
    }

    public void phone(){
        System.out.println("发送短信");
    }

}
