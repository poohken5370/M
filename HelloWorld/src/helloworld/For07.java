package helloworld;
import java.io.*;

public class For07 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        
        int[] lists = new int[5];
        
        // 入力
        for(int i = 0; i < lists.length; i++) {
            System.out.print((i + 1) + "人目の年齢を入力してください: ");
            String str = br.readLine();
            lists[i] = Integer.parseInt(str);
        }

        // 出力（20才以上を全部表示）
        boolean found = false;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] >= 20) {
                System.out.println(lists[i] + "才");
                found = true;
            }
        }

        if (!found) {
            System.out.println("20才以上は存在しません。");
            //🔹if (!found) の意味
            //found っていうのは true / false を入れるための変数（boolean型）
            //! は 「否定（NOT）」 っていう演算子
            //!true → false
            //!false → true
            //だから、
            //👉 if (!found)
            //＝「もし found が false だったら」という意味になるんだよ💡
        }
    }
}
