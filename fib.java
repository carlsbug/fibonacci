import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	public static int fibonacci(int num)
	{
//		Map<Integer, Integer> fib = new HashMap<>();
		int fib[] = new int[num+1];
		int f;
		for(int i = 0; i <= num; i++)
		{
			if(i <= 1)
				fib[i] = i;
			else
			{
				f = fib[i-1] + fib[i-2];
				fib[i] = f;
			}
		}
		return fib[num];
	}
	public static void main(String args[])
	{
		
		System.out.println(fibonacci(6));
	}
}
