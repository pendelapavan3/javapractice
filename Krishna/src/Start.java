package Practices;

public class Start implements Runnable
{
    public void run() {
         System.out.println("Thread 456");
    }
    public static void main(String[] args) {
        Start s = new Start();
Thread T = new Thread(s);
T.start();
    }
}
