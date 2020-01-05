
import java.util.*;
class ThreadUsingLambda {
	public static void main(String[] args){
		Runnable r = ()-> {
			for(int i = 0; i < 5; i++){
				System.out.println("Child Thread -1");
			}
		};
		Thread newThread = new Thread(r);
		newThread.start();
		for(int i = 0; i < 5; i++){
			System.out.println("Main Thread -1");
		}
	}
}