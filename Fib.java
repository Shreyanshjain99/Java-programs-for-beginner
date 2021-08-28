//Check if the number comes in fibonacci series.
//0,1,1,2,3,5,8,13,21,34,55,....... (This is fibonacci series)
import java.util.*;

class Fib{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int fib[]= new int[t];
		for(int i=0;i<t;i++)
		{
			fib[i]=scan.nextInt();//36,8,5
		}

		
		for(int j=0;j<t;j++)
		{
			if(checkFib(fib[j]))
			{
			System.out.println("YES");
			}
			else
			{
			System.out.println("NO");
			}
		}
		scan.close();
	}

	static Boolean checkFib(double b) {
		return ifSquare(5*b*b + 4) || ifSquare(5*b*b-4);
		
	}

	static Boolean ifSquare(double a) {//324
		Double ans= Math.sqrt(a);//18
		return (ans*ans == a);	
	}
}


