package practice3;

public class CountCharacterOccurence {

	public static void main(String[] args) {
	
		String s ="java automation selenium oracle oops api"; 
		
		int totalCount = s.length();
		
		int afterRemoveCount = s.replace("i","").length();
		
		int count = totalCount - afterRemoveCount;
		
		System.out.println("Total count of Character : "+count);
		

	}

}
