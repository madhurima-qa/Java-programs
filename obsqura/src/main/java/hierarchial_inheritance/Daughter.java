package hierarchial_inheritance;

public class Daughter extends Father{

	public static void main(String[] args) {
	Daughter obj1=new Daughter();
	obj1.method1(5, 8);
	obj1.method3(2, 20);

	}
	public void method3(int a,int b) {
	int sum=a+b;
	System.out.println(sum);

	}

}
