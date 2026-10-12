package hierarchial_inheritance;

public class Son extends Father {
	

	public static void main(String[] args) {
		Son obj= new Son();
		obj.method1(2, 10);
		obj.method2();

	}
	public void method2(){
		System.out.println("hierarchial inheritance");
		
	}

}
