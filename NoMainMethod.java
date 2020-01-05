class NoMainMethod {
	static void displayTheSysOut(){
		System.out.println("Am displayed via static block");
	}
	
	static {
		displayTheSysOut();
	}
	
	public static void main(String[] args){
	}
}