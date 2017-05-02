
public class Place 
{

	public static void main(String[]args)
	{
		Dog dog = new Dog(64);
		placement(dog.getPlace());
	}
	
	public static void placement(int place, int upper)
	{
		for(int i = 1 ; i <= 100 ; i++)
		{
			if(i==place)
				continue;
			if(i >= 10 && i < 20)
				System.out.println(i + "th");
			
			for(int k = 0; k < 100; k+=10)
			{	
				if(k == 10)
					continue;
				calculate(k,k+10,i);
			}
		}
	}
	
	public static void calculate(int lower, int upper, int i)
	{
		if (i>lower && i<upper)
		{
			i = i-lower;
			switch (i) {
			case 1:
				System.out.println((i+lower)+"st");
				break;
			case 2:
				System.out.println((i+lower)+"nd");
				break;
			case 3:
				System.out.println((i+lower)+"rd");
				break;
			default:
				System.out.println((i+lower)+"th");
				break;
			}
		}
		i+=lower;
	}
}

