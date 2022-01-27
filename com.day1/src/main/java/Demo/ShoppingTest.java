package Demo;

/**
 * @author zhangshiliang
 * @Description 显示五件特价商品
 * @create 2022-01-26 11:37 上午
 */
public class ShoppingTest {
    public static void main(String[] args) {
        String source[] = {"Java基础","Python基础","PHP基础","C++基础","Html入门"};
        //不能等于，0-4已经有5个元素了
        for (int i = 0; i < source.length; i++){
            System.out.print(source[i] + " ");
        }
    }
}
