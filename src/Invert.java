
public class Invert {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.print("a="+a+" b="+b);
		a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(" a="+a+" b="+b);
		

	}

}
