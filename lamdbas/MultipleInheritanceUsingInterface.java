

class MultipleInheritanceUsingInterface implements Left,Right{
	public void m1(){
		
	}
	
	public void m2(){
		System.out.println("Overriding m2 implementation");
		Left.super.m2();
		Right.super.m2();
	}
	
	public static void main(String[] args){
		//Below satisfies Anonymousnymous class implementation
		Left left = new Left(){
			public void m1(){};
			public void m2(){
				System.out.println("Annonymous inner class m2 method");
			}
		};
		left.m2();
		
		//Below provides multiple inheritance implementation using super keyword
		MultipleInheritanceUsingInterface mi = new MultipleInheritanceUsingInterface();
		mi.m2();
	}
}
@FunctionalInterface
interface Left{
	public void m1();
	
	public default void m2(){
		System.out.println("left m2 method");
	}
}

@FunctionalInterface
interface Right{
	public void m1();
	
	public default void m2(){
		System.out.println("right m2 method");
	}
}