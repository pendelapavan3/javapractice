package Practices;

public class ThreadDemo extends Thread {
    public void run()
    {
        System.out.println("current thread name:" + Thread.currentThread().getName()); // gets you the name of current runnig thread.
        System.out.println("run() method called");
    }
}
class Java{
    public static void main(String []args) 
    {
      ThreadDemo t = new ThreadDemo();
      t.start();
    }
}