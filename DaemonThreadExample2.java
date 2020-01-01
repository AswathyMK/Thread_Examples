
public class DaemonThreadExample2 extends Thread 
{
	public void run()
	{
	System.out.println("Thread name :"+Thread.currentThread().getName());//return the name of current thread
        System.out.println("Check if its DaemonThread:"+Thread.currentThread().isDaemon());//checks the thread is Daemon Thread or not.
	
	}

	public static void main(String[] args) 
	{
		DaemonThreadExample2 t1=new DaemonThreadExample2();//Creating object for Daemonthread
		DaemonThreadExample2 t2=new DaemonThreadExample2();//Creating object for user thread
		//t1.start();//Here it makes exception
		//Exception at the Thread is already started.
		t1.setDaemon(true);
		t1.start();//to avoid exception start after setDaemon()
		t2.start();

	}

}
