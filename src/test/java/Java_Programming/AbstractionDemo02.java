package Java_Programming;

public class AbstractionDemo02 extends AbstractionDemo  {
	
	
	int a;
	int b;
	String name;
	public void Show() {
		
		System.out.println("AbstractClassImplementation");
	}
	
	public void Show(int a)
	{
		
		System.out.println(a);
	}
	public void Show(int b,String name)
	{
		
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		AbstractionDemo02 ab= new AbstractionDemo02();
		ab.Show();
		ab.Show(10);
		ab.Show(12,"Bhavesh");
		
		
	}

}
