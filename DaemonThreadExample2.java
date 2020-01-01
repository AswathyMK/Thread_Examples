
public class DaemonThreadExample2 extends Thread {
	public void run()
	{
	System.out.println("Thread name :"+Thread.currentThread().getName());
	System.out.println("Check if its DaemonThread:"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadExample2 t1=new DaemonThreadExample2();
		DaemonThreadExample2 t2=new DaemonThreadExample2();
		t1.start();
		//Exception at the Thread is already started.
		t1.setDaemon(true);
		t2.start();

	}

}
