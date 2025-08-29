package helloworld;
import java.io.*;

public class For02 
{
	public static void main(String[] args)throws IOException
	{      
		        // ユーザーに入力してもらう
		        System.out.print("表示したい段を入力してください (1～9): ");
		        BufferedReader br = 
		        		new BufferedReader(new InputStreamReader(System.in));

		        String str = br.readLine();
		        int dan = Integer.parseInt(str);
		        
		        // 入力された段を表示
		        if (dan >= 1 && dan <= 9) {
		            for (int i = 1; i <= 9; i++) {
		                System.out.println(dan + " × " + i + " = " + (dan * i));
		            }
		        } else {
		            System.out.println("1～9の数字を入力してください！");
		        }
		    }
	}

