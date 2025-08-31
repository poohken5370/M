package helloworld;
import java.io.*;

public class For09
{
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        // 商品情報（購入日, 商品名, 金額）
        String[][] orders = {
            {"2024/01/01", "マウス", "3000"},
            {"2024/01/10", "キーボード", "4000"},
            {"2024/01/12", "モニター", "14000"}
        };

        // 振込日だけ入力させる（固定データの4列目に入れる）
        String[] payments = new String[orders.length];
        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i][1] + " の振込日(なければ空Enter): ");
            payments[i] = br.readLine();
        }

        // 出力
        System.out.println("\n--- 注文一覧 ---");
        for (int i = 0; i < orders.length; i++) {
            String purchaseDate = orders[i][0];
            String productName  = orders[i][1];
            String price        = orders[i][2];
            String paymentDate  = payments[i];

            if (paymentDate.equals("")) {
                // 未入力なら「未納」
                System.out.println("購入日:" + purchaseDate
                        + ", 商品名:" + productName
                        + ", 金額:" + price + "円, 未納");
            } else {
                // 入力済みなら振込日は出さない
                System.out.println("購入日:" + purchaseDate
                        + ", 商品名:" + productName
                        + ", 金額:" + price + "円");
            }
        }
	}
}
