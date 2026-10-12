package Single.inheritance;

public class Child extends Parent{
	public void method1() {
	System.out.println("inheritance");	
		
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.add(10,20);
		obj.method1();

	}

}
