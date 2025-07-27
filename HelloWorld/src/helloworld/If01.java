package helloworld;
import java.io.*;

/**
 * If01クラスは、試験点数を入力すると3種類の成績評価を出力するプログラムです。
 * @author みく
 */
public class If01 {

    /**
     * mainメソッド
     * 試験の点数(0～100)を入力し、
     * ケース1：合格／不合格
     * ケース2：たいへんよくできました／よくできました／ざんねんでした
     * ケース3：優／良／可／不可
     * をそれぞれ出力します。
     * @param args コマンドライン引数（このプログラムでは使用しません。）
     */
    public static void main(String[] args) throws IOException {
        System.out.println("試験の点数(0～100)を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int scr = Integer.parseInt(str);

        if (scr < 0 || scr > 10) {
            System.out.println("正しい点数を入力してください。（0～100）");
            return;
        }

        // ケース1
        System.out.println("【ケース1】");
        if (scr >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        // ケース2
        System.out.println("【ケース2】");
        if (scr >= 80) {
            System.out.println("たいへんよくできました。");
        } else if (scr >= 60) {
            System.out.println("よくできました。");
        } else {
            System.out.println("ざんねんでした。");
        }

        // ケース3
        System.out.println("【ケース3】");
        if (scr >= 80) {
            System.out.println("優");
        } 
        else if (scr >= 70) {
            System.out.println("良");
        } 
        else if (scr >= 60) {
            System.out.println("可");
        }
        else {
            System.out.println("不可");
        }
    }
}
