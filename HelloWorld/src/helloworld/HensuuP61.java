package helloworld;
import java.io.*;

public class HensuuP61 {
	public static void main(String[] args) throws IOException{
		System.out.println("文字列を入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		//入力された文字列をあらわすｓｔｒを利用する
		
		System.out.println(str+"が入力されました。");
	}
	

}
