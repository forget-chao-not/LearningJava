public class Test
{
	public static void main(String[] args)
	{
		CarShop qijiandian=new CarShop();
		qijiandian.sellCar(new BMW());
		qijiandian.sellCar(new QQ());
		qijiandian.sellCar(new Tesla());
		qijiandian.sellCar(new Tesla());
		qijiandian.sellCar(new QQ());
		System.out.println(" ’»Î¡À£∫"+qijiandian.getTotalMoney());
	}
}

interface Car
{
	double getPrice();
}

class BMW implements Car
{
	public double getPrice()
	{
		return 5000;
	}
}

class QQ implements Car
{
	public double getPrice()
	{
		return 2000;
	}
}

class Tesla implements Car
{
	public double getPrice()
	{
		return 3000;
	}
}

class CarShop
{
	private double money=0;
	
	public void sellCar(Car obj)
	{
		money+=obj.getPrice();
	}
	
	public double getTotalMoney()
	{
		return money;
	}
}