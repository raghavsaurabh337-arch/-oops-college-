class MyThread extends Thread {
    public void run() {
        System.out.println("Daemon Thread running");
    }
}

public class demo{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setDaemon(true);  
        t1.start();
    }
}