package helloworld;

public class EnzanshiP102 {
	public static void main(String[] args) {
		int num1=5;
		int num2=4;
		
		double div=(double)num1/num2;
		//double div=num1/num2;と入力してしまうと、どちらもintの型のため計算結果が1.0と表示されてしまいます。
		//そのため、P100で学んだように、どちらか一方をdouble型にキャスト変換して、計算を行う必要があります。
		System.out.println("5/4は"+div+"です。");
	}

}
