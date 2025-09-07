package helloworld;

/**
 * このプログラムは保険契約リストを出力し、さらに遅延利息金が発生している人の人数をカウントして出力するプログラムです。
 * @author みく
 */
public class For01
{
	/**
	 * mainメソッド
	 * 保険契約者の情報をString型で入力します。
	 * 契約者名とその保険料を出力します。
	 * 遅延利息金がある人の人数をカウントし出力します。
	 * @param args コマンドライン引数(このプログラムでは使用しません。)
	 */
	public static void main(String[] args)
	{
		String[][] list = {
				{"中村", "5000", "2000"},
	            {"田島", "3000", "0"},
	            {"小澤", "4500", "0"},
	            {"大西", "6000", "3500"}
		};
		int lateCount = 0;

		for (int i = 0; i < list.length; i++) {
            String name  = list[i][0]; 
            String price = list[i][1]; 
            String late  = list[i][2]; 

            System.out.println("契約者名:" + name + "  保険料:" + price + "円");
	
            if (Integer.parseInt(late) > 0) {
                lateCount++;
         }
    }        
		 System.out.println("遅延利息金が発生している人数は" + lateCount + "人です。");
}
}
