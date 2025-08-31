package helloworld;
import java.io.*;

public class For06 
{
	public static void main(String[] args) throws IOException {
	        BufferedReader br =
	                new BufferedReader(new InputStreamReader(System.in));

	        String[] names = new String[5]; // 名前を入れる配列（5個ぶん）

	        System.out.println("名前を5回入力してください。");

	        // ▼ 入力（通常for文）
	        for (int i = 0; i < names.length; i++) {
	            System.out.print((i+1) + "人目: ");
	            names[i] = br.readLine(); // 入力を配列に格納
	        }
	        System.out.println("\n--- 通常for文で出力 ---");
	        for (int i = 0; i < names.length; i++) {
	            System.out.println((i+1) + "人目: " + names[i]);
	        }
	        
	        // ▼ 入力（拡張for文）
	        System.out.println("\n--- 拡張for文で出力 ---");
	        for (String n : names) {
	            System.out.println(n);
	        }
	}
}