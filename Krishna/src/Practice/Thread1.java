package Practice;
class Thread1 extends Thread
{  
    public void run(){  
      System.out.println("running...");  
    }  
    public static void main(String args[])
    {  
     Thread1 t1=new Thread1();  
     t1.run();                         
    }  
   }  