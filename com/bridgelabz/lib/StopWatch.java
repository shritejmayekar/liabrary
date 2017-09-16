
class StopWatch{
	public static long start,stop,elapse;
	public static void start()
	{
		start=System.currentTimeMillis();
	}
	public static void stop()
	{
		stop=System.currentTimeMillis();
		elapse();
	}
	public static void elapse()
	{
		elapse=stop-start;
	}
	public static void showStart()
	{
		System.out.println(start);
	}
	public static void showStop()
	{
		System.out.println(stop);
	}
	public static void showElapse()
	{
		
		System.out.println("The time elapsed:"+elapse+" milliSeconds");
	}
	public static void main(String args[]){

	}
}