class SkipTest {
	
	private static void printSkipFields(){
		try(String s = new String("")){
			String skipLine = "Hey skip you skip skip can skip skip skip see skip skip skip skip the skip skip skip skip skip skip skip skip skip skip skip skip is skip skip skip skip skip skip skip not skip skip skip skip skip skip skip skip displayed skip skip skip skip skip skip skip skip skip";
			System.out.println("Skipline:" + skipLine);
			String[] skipWords = skipLine.split(" ");
			//System.out.println("Total skip line length: "+ skipWords.length);
			for(int currentSkip = 1; currentSkip < skipWords.length; currentSkip++){
				//System.out.println("currentSkipValue: "+currentSkip
				int skipValueToDisplay = 0;
				if(currentSkip > 1){
					skipValueToDisplay = getSkipCount(currentSkip) -1;
					if( skipValueToDisplay > skipWords.length -1){
						break;
					}
				}
				System.out.print(skipWords[skipValueToDisplay] + " ");
			}
		}catch(Exception ex){
		}
	}
			
	
	private static int getSkipCount(int currentSkip){
		//System.out.println("Deriving skipValue for: "+ currentSkip);
		int skipValue = 0;
		for(int skipCounter = currentSkip; currentSkip >= 1; currentSkip --){
			skipValue = skipValue + currentSkip;
		}
		//System.out.println("Skip value to display: "+ skipValue);
		return skipValue;
	}
	
	public static void main(String[] args){
		printSkipFields();
	}
}