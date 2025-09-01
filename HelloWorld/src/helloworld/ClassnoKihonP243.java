package helloworld;

//車のクラス
class CarP243
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	void show()
	{
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
public class ClassnoKihonP243 
{
	public static void main(String[] args)
	{
		CarP243 car1 = new CarP243();
		
		int number = 1234;
		double gasolin = 20.5;
		
		car1.setNum(number);
		car1.setGas(gasolin);
	}
	
	
}
}