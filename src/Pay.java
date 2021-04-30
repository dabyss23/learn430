import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Pay implements Runnable {

    private static Lock lock = new ReentrantLock();

    private String name;

    public Pay(){

    }
    public Pay(String name){
        this.name=name;
    }

    private int nums=8;

    private boolean flag = true;//判断抢购是否成功

    @Override
    public void run() {
        while (flag){
            try{
                Thread.currentThread().sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            buy();
        }

    }

    public synchronized void buy(){
            if(nums<=0){
                flag=false;
                return;
            }
            nums--;
            System.out.println(Thread.currentThread().getName()+"抢购成功，还剩"+nums+"张票");
        }
}