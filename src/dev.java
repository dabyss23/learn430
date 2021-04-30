/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
 */
public class dev {

    public static void main(String[] args) {

        String[] strs = new String[] {"contrast","content","college","contraindication"};
        String str1=strs[0];
        String result=str1;
        for(int i=1;i<strs.length;i++){
            result=method(result,strs[i]);
        }
        System.out.println(result);

    }

    public static String method(String one,String two){
        String res="";
        int num=Math.min(one.length(),two.length());
        for (int i=0;i<num;i++){
            if(one.charAt(i)==two.charAt(i)){
                res +=one.charAt(i);
            }
            else{
                return res;
            }
        }
        return res;
    }




}
