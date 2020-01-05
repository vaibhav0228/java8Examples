import java.util.stream.*;
import java.util.function.Function;
import java.util.*;
public class FunctionIntJavaTest {
	public static void main(String[] args) {
		//List<Integer> lengthOfString = Streams.map(Arrays.asList("abc","abcd"), (String s) -> s.length());
		Function<String, Integer> stringLength = (String inputStr) -> inputStr.length(); 
		Arrays.asList("abc","abcd").forEach(s -> System.out.println(stringLength.apply(s)));
	}
}