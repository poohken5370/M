package helloworld;
import java.io.*;

public class ForP168 {
	public static void main(String[] args)throws IOException{
		System.out.println("成績を入力してください。");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res) {
		case 1:
		case 2:
			System.out.println("もう少しがんばりましょう");
			break;
		case 3:
		case 4:
			System.out.println("この調子でがんばりましょう");
			break;
		case 5:
			System.out.println("たいへん優秀です。");
			break;
			default:
				System.out.println("1~5間での成績を入力してください。");
		}
	}

}
