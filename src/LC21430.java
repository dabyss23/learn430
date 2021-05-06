import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

//给你一个整数数组 nums ，除某个元素仅出现 一次外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
public class LC21430 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{0, 0, 1, 1, 0, 1, 99};
        HashMap<Integer, Integer> res = new HashMap<>();
        for(Integer index:nums){
            if(res.containsKey(index)){
                res.put(index,res.get(index)+1);
            }else{
                res.put(index,0);
            }
        }
        for (Map.Entry<Integer,Integer> result:res.entrySet()){
            if(result.getValue()==0){
                System.out.println(result.getKey());
                break;
            }
        }

        System.out.println("dskfjsldfj");

        System.out.println("数量的快捷方式的方式");
    }

}