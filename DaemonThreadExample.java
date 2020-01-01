
public class DaemonThreadExample extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon())//checking for daemon Thread
		{
			System.out.println("Daemon Thread work. ");
		}
		else
		{
			System.out.println("User thread work. ");
		}
	}
	

	public static void main(String[] args) 
	{
		
		 DaemonThreadExample t1=new  DaemonThreadExample();//creating thread.
		 DaemonThreadExample t2=new  DaemonThreadExample();
		 DaemonThreadExample t3=new  DaemonThreadExample();
		 t1.setDaemon(true);//now it is daemon thread
		 t1.start();
		 t2.start();
		 t3.setDaemon(true);
		 t3.start();
		 
			

	}

}
