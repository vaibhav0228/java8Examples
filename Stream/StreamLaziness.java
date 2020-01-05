import java.util.stream.*;

class StreamLaziness{
	private static void streamLazyness(){
		Stream.of("a1","b1","c1","d1","e")
		.filter(s -> {
			System.out.println("filter: "+s);
			return true;
		}).forEach(s -> System.out.println("forEach: " + s));
	}
	public static void main(String[] args){
		streamLazyness();
	}
}