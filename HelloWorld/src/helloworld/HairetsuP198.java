package helloworld;

public class HairetsuP198 
{
	public static void main(String[] args)
	{
		int[] test = {80,60,22,50,75};
		
		for(int i = 0; i < 5; i++) { 
			//ここの「i+5」のところの5を、test.lengthに初めからしておくと、後々の訂正が楽になる。
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
		}
		System.out.println("テストの受験者は" + test.length + "です。");				 
	}
}
