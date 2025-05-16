package helloworld;
import java.io.*;
public class Enzanshi12 {
	public static void main(String[] args)throws IOException{
		System.out.println("あなたについて教えてください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("名");
		String str1=br.readLine();
		
		System.out.println("姓");
		String str2=br.readLine();
		
		System.out.println("あなたの名前は"+str2+str1+"です。");
	}

}
