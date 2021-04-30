import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PersonOne implements Runnable{
    private  int  count=10;
    final private int num=count;
    Lock lock= new ReentrantLock();

    @Override
    public void run() {
        while (count>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            sale();
            lock.unlock();
        }
    }
    public  void sale(){

        if (count>0){
            System.out.println(Thread.currentThread().getName()+"正在出售第"+(num-count+1)+"张票");
            count--;
        }

    }
}