import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 创建一个String数组，按照 “用户名”,“年龄” 储存几个用户信息
 * 使用Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，并遍历ArrayList集合
 * 同时满足两个要求：姓名长度大于2，年龄小于28岁
 */
public class test {
    public static void main(String[] args) {

        String[] users=new String[]{"威宁阿萨,28","军车拿分,30","奥法,17","感染sf,14","abc,19"};

        List<String> res=select(p1->p1.split(",")[0].length()>2,p2->Integer.parseInt(p2.split(",")[1])<28,users);

        res.forEach(System.out::println);

    }

    private static List<String> select(Predicate<String> predicate1, Predicate<String> predicat2, String[] users){

        ArrayList<String> result= new ArrayList<>();

            for (String u:users){
                if(predicate1.and(predicat2).test(u)){
                    result.add(u);
                }
            }

        return result;
    }
}







