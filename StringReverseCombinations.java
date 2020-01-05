import java.util.*;

public class StringReverseCombinations {
	
	private static String[] possibleCombinations(String input){
		List<String> possibleReverseCombinationsAL = new ArrayList<String>();
		if(input != null && input.trim().length() == 1){
			return new String[]{input.trim()};
		}
		if(input != null && input.trim().length() > 1){
			int inputLength = input.length();
			String reverseString = "";
			for(int startStringLength = 1; startStringLength < inputLength; startStringLength++){
				reverseString = "";
				for(int parseString = startStringLength; parseString < inputLength;parseString++){
					reverseString = reverseString + input.charAt(parseString);
				}
				for(int remainingString = 0; remainingString < startStringLength; remainingString++){
					reverseString = reverseString + input.charAt(remainingString);
				}
				possibleReverseCombinationsAL.add(reverseString);
			}
			String[] finalCombinations = new String[possibleReverseCombinationsAL.size()];
			possibleReverseCombinationsAL.toArray(finalCombinations);
			return finalCombinations;
		}
		return null;
	}
	
	public static String[] possibleCombinationsUsingSubString(String input){
		List<String> possibleReverseCombinationsAL = new ArrayList<String>();
		input = input.trim();
		if(input != null && input.length() == 1){
			return new String[]{input};
		}
		if(input != null && input.length() > 1){
			int inputLength = input.length();
			
			for(int stripStart = 1; stripStart < inputLength; stripStart++){
				String reverseString = "";
				String prefix = input.substring(0,stripStart);
				String suffix = input.substring(stripStart,inputLength);
				reverseString = suffix + prefix;
				possibleReverseCombinationsAL.add(reverseString);
			}
			String[] finalCombinations = new String[possibleReverseCombinationsAL.size()];
			possibleReverseCombinationsAL.toArray(finalCombinations);
			return finalCombinations;
		}
		return null;
	}
		
	
	public static void main(String[] args){
		if(args[0].trim().length() == 0){
			System.out.println("Usage: Please provide valid input");
			System.exit(0);
		}
		/*String[] returnedCombinations = possibleCombinations(args[0]);
		for(String combination : returnedCombinations){
			System.out.println(combination);
		}*/
		
		String[] returnedCombinations = possibleCombinationsUsingSubString(args[0]);
		for(String combination : returnedCombinations){
			System.out.println(combination);
		}
		
		
	}
}