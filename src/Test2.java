
//买东西
public class Test2 {

    public static void main(String[] args) {

        Pay pay = new Pay();

        Thread threadA = new Thread(pay,"张三");
        Thread threadB = new Thread(pay,"李四");
        Thread threadC = new Thread(pay,"王五");

        threadA.start();
        threadB.start();
        threadC.start();

    }

}
