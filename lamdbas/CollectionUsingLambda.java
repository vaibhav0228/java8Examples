import java.util.*;
class CollectionUsingLambda{
	public static void main(String[] args){
		List<Integer> integerCollection = new ArrayList<Integer>();
		integerCollection.add(50);
		integerCollection.add(100);
		integerCollection.add(20);
		integerCollection.add(-5);
		System.out.println("List Contains: "+ integerCollection);
		Comparator<Integer> ascendingComparator = (number1, number2) -> (number1 < number2) ? -1 : (number1 > number2) ? 1 : 0;
		Collections.sort(integerCollection, ascendingComparator);
		System.out.println("Ascending List Contains: "+ integerCollection);
		Comparator<Integer> descendingComparator = (number1, number2) -> (number1 < number2)? 1 : (number1 > number2) ? -1 : 0;
		Collections.sort(integerCollection, descendingComparator);
		System.out.println("Descending List Contains: "+ integerCollection);
	}
}