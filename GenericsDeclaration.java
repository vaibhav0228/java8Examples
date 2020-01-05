import java.util.*;
class GenericsDeclaration {
	List<? extends GenericsDeclaration> anyTypeList = new ArrayList<GenericsChildDeclaration>();
	List<Object> objTypeList = new ArrayList<Object>();
	
	private void addStringToAList(){
		anyTypeList.add(new GenericsChildDeclaration());
		//anyTypeList.add(2);
	}
	
	public static void main(String[] args){
		new GenericsDeclaration().addStringToAList();
	}
	
}

class GenericsChildDeclaration extends GenericsDeclaration {
	
}