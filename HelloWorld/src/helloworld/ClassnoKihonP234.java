package helloworld;

//車のクラス
class CarP234
{
	int num;
	double gas;
	
	void show() 
	{
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class ClassnoKihonP234
{
	public static void main(String[] args)
	{
		CarP234 car1;
		car1 = new CarP234();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}
