package a04;

public class Test
{

	public static int cnt;
	public static int cnt2;
	
	public static int MAX_ITERATIONS = 20;
	
	public static  void func()
	{
	  cnt++;	
	}
	
	public static void printDump(int n)
	{
		cnt = 0;
		cnt2 = 0;
		System.out.println(n);
		problem_rekursiv(n);
		System.out.println("#func():\t" + cnt);
		System.out.println("#Iterationen:\t" + cnt2);
		System.out.println("============================");
	}
	
	public static void problem_rekursiv(int n)
	{
		
		cnt2++;
		if ( n == 1 ) return; // kein Rechenschritt
		func(); // ein Rechenschritt
		problem_rekursiv(n/2);
		problem_rekursiv(n/2);
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		for(int i = 1; i < MAX_ITERATIONS;i++)
			printDump((int)Math.pow(2,i));
		

	}

}
