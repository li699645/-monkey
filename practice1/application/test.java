import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String s : list) {
     System.out.println(s); // 合法
        }
    }
}
