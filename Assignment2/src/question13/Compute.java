package question13;

//(1) Define an interface Compute with a method int computer(int n, int m). 
//(2) Design four classes to implement this interface respectively to complete addition, subtraction, multiplication and division operations. 
//(3) Design a class UseCompute, which contains methods: public void useCom(Compute com, int one, int two),
//	 This method can use the passed object to call the computer method to complete the operation and output the result of the operation. 
//(4) Design a main class Test, call the method useCom in UseCompute to complete addition, subtraction, multiplication and division operations. 




public interface Compute {
	 int computer(int n, int m);
}
