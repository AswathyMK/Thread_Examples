
public class ThreadExample_4 extends Thread 
{
	public void run()
	{
		System.out.println("Am in run method by extending thread");
	}

	public static void main(String[] args) {
		
		ThreadExample_4 t1=new ThreadExample_4();
		t1.start();

	}

}
