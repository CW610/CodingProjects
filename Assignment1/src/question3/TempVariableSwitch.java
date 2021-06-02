package question3;

public class TempVariableSwitch {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		int s;
		
		System.out.println("Int a before the switch " + a );
		System.out.println("Int b before the switch " + b);
		s =a;
		a = b;
		b = s;
		System.out.println("Int a after the switch " + a );
		System.out.println("Int b after the switch " + b);
		

	}

}
