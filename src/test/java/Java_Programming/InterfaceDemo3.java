package Java_Programming;

public class InterfaceDemo3 implements InterfaceDemo,InterfaceDemo2 
{
	
	public void Mobiles()
	{
		System.out.println("Samsung");
	}
	
	public void Houses()
	{
		System.out.println("Villa");
	}
	public  void Animal()
	{
		System.out.println("Dog");
	}
	public void Vehicle()
	{
		System.out.println("Lambo");
	}
	public void Vehicle(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		InterfaceDemo3 DD= new InterfaceDemo3();
		DD.Mobiles();
		DD. Houses();
		DD.Animal();
		DD.Vehicle();
		DD.Vehicle(10);

	}

}
