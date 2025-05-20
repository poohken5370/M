package helloworld;
import java.io.*;

public class IfP145p5 {
	public static void main(String[] args)throws IOException{
		System.out.println("成績を入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int scr=Integer.parseInt(str);
		
		if(scr == 1) {
			System.out.println("もっとがんばりましょう。");
		}
		else if(scr == 2) {
			System.out.println("もう少しがんばりましょう。");
		}
		else if(scr == 3) {
			System.out.println("さらに上をめざしましょう。");
		}
		else if(scr == 4) {
			System.out.println("たいへんよくできました。");
		}
		else if(scr == 5) {
			System.out.println("たいへん優秀です。");
		}
		else {
			System.out.println("1～5で成績を入力してください。");
		}
	}
	
}
