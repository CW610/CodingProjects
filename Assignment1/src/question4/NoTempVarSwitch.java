package question4;

public class NoTempVarSwitch {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		
		System.out.println("X before the switch is " + x);
		System.out.println("Y before the switch is " + y);
		
		x=x+y; // x is now 25
		y=x-y; // y is now 10
		x=x-y;
		
		System.out.println("X after the switch is " + x);
		System.out.println("Y after the switch is " + y);
		

	}

}
