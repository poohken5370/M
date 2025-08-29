package helloworld;

public class For05 
{
	public static void main(String[] args)
	{
		int sum =0;
		
		for(int i = 0; ; i++) {
			sum += i;
			System.out.println("i=" + i + " のとき、合計 = " + sum);
			
			if(sum >= 100) {
				break;
			}
		}
	}
}
