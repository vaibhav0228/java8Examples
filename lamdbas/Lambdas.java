import java.util.function.*;

public class Lambdas {
	
	//static Function<String,Integer> s = s-> s.length();
	//static Function<Integer,Integer> n = (a,b) -> a+b;
	public static void main(String[] args){
		//System.out.println("Mumbai string length is :" + s.apply("mumbai"));
		AddNumbers addNum = (numOne,numTwo) -> numOne + numTwo;
		System.out.println("Addition of  of " +args[0] +" & "+ args[1] +" is :" + addNum.addNumber(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		addNum.subtractNumber(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}

@FunctionalInterface
interface AddNumbers {
	public int addNumber(int numberOne, int numberTwo);
	
	public default int subtractNumber(int numberOne, int numberTwo) {
		int subtractedNumber = numberTwo - numberOne;
		System.out.println("Sybtraction of " + numberTwo +" & "+ numberOne +" is :" + subtractedNumber);
		return subtractedNumber;
	}
}