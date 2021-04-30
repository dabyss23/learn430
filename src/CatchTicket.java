

public class CatchTicket {
    public static void main(String[] args) {
        PersonOne p = new PersonOne();
        Thread[] t = new Thread[10];
        for (int i = 1; i < 4; i++) {
            t[i] = new Thread(p, "窗口" + i);
            t[i].start();
        }
    }
}