class MusicPlayer extends Thread
{
	public void run()
	{
		System.out.println("Music is playing");
	}
}
class MsWord implements Runnable
{
	public void run()
	{
		System.out.println("Typing MS wod document");
	}
}
public class ThreadExample_3 {

	public static void main(String[] args) {
		Runnable obj1=new MsWord();
		MsWord obj2=new MsWord();
		MusicPlayer thread2=new MusicPlayer();
		
		Thread thread1=new Thread(obj1);
		
	    thread1.start();
	    thread2.start();

	}

}
