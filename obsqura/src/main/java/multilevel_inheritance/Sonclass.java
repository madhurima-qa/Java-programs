package multilevel_inheritance;

public class Sonclass extends Child{
public void meth2() {
System.out.println("java");
}
	public static void main(String[] args) {
		Sonclass obj =new Sonclass();
		obj.meth2();
		obj.meth1();
		obj.add(4,2);

	}

}
