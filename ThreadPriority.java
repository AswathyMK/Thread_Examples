
public class ThreadPriority extends Thread{
	public void run()
	{
		System.out.println("running thread name is "+Thread.currentThread().getName());
		System.out.println("running Thread priority is "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadLocal <Number> obj_local=new ThreadLocal <Number>();
		ThreadLocal <Integer> obj_local=new ThreadLocal <Integer>();
		ThreadLocal<String> obj=new ThreadLocal<String>();
		obj_local.set(100);
		System.out.println("value = "+obj_local.get());
		obj_local.set(90);
		System.out.println("value = "+obj_local.get());
		obj.set("Java");
		System.out.println("value = "+obj.get());
		obj.remove();
		System.out.println("value = "+obj.get());
		obj_local.remove();
		System.out.println("value = "+obj_local.get());
		ThreadPriority m1=new ThreadPriority();
		ThreadPriority m2=new ThreadPriority();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
        
        
        
}
}