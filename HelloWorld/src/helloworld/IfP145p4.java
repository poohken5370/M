package helloworld;
import java.io.*;

public class IfP145p4 {
	public static void main(String[] args)throws IOException{
		System.out.println("0から10までの整数を入力してください。");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		
		if(num >= 0 && 10 >= num) {
			System.out.println("正解です。");	
			//num == true という比較になってしまい、これは型が違うためコンパイルエラーになります。
		}
		else{
			System.out.println("まちがいです。");
			//else に条件を書くことはできません（条件を使うなら else if を使います）。
			//else の後にはブロック {} または文が直接続きます。

		}
	}

}
