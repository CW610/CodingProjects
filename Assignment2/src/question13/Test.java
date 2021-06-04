package question13;

public class Test {
	public static void main(String args[])
    {
		
		Compute add = new Addition();
		UseCompute.useCom(add, 13, 7);
		Compute sub = new Subtraction();
		UseCompute.useCom(sub, 13, 7);
		Compute div = new Division();
		UseCompute.useCom(div, 14, 7);
		Compute mult = new Multiplication();
		UseCompute.useCom(mult, 13, 7);
		
		
		
    }

}
