package helloworld;
import java.io.*;

/**
 * @author みく
 * If10クラスは、性別と年齢を入力し、保険料を出力するプログラムです。
 */
public class If10 {

    /**
     * mainメソッド
     * 性別（"男性"または"女性"）と年齢を入力し、条件に応じた生命保険料を出力します。
     * @param args コマンドライン引数（このプログラムでは使用しません）
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("性別を入力してください。（男性または女性）");
        String gender = br.readLine();

        System.out.println("年齢を入力してください。");
        int age = Integer.parseInt(br.readLine());

        int price = 0;

        if (gender.equals("男性")) {
            if (age >= 80) {
                price = 8000;
            } else if (age >= 50) {
                price = 7000;
            } else if (age >= 30) {
                price = 5000;
            }
        } else if (gender.equals("女性")) {
            if (age >= 80) {
                price = 7000;
            } else if (age >= 50) {
                price = 6000;
            } else if (age >= 30) {
                price = 4500;
            }
        } else {
            System.out.println("性別の入力が正しくありません。");
            return; // 終了
        }

        if (price > 0) {
            System.out.println("あなたの保険料は " + price + " 円です。");
        } else {
            System.out.println("年齢が対象外です。");
        }
    }
}
