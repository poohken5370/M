package helloworld;

//車のクラス
class CarP248
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	void show()
	{
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class ClassnoKihonP248
{
	public static void main(String[] args)
	{
		CarP248 car1 = new CarP248();
		
		int number = 1234;
		double gasolin = 20.5;
		
		car1.setNumGas(number, gasolin);
	}

}
