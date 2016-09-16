package toptal.codility.second_try;

public class TaskThree {

	public static void main(String[] args) {
		System.out.println(solution("ABBCC"));
	}
	 public static String solution(String S) {
		 StringBuilder output = new StringBuilder();
		 
		 for(int i = S.length()-2 ; i> 0 ; i--){
	        	if(convert(S.substring(i ,i + 2)) != "."){
	        		output.insert(0, convert(S.substring(i ,i + 2)));
	        	}else{
	        		output.insert(0, S.substring(i ,i + 2));
	        	}
	        }
		 return output.toString();
	    }
	 
	 private static String convert(String input){
		 if(input.equals("AB")){
//			 return "AA";
			 return "A";			 
		 }
		 else if(input.equals("BA")){
//			 return "AA";
			 return "A";
			 }
		 else if(input.equals("CB")){
//			 return "CC";
			 return "C";
		 }
		 else if(input.equals("BC")){
//			 return "CC";
			 return "C";
		 }
		 else if(input.equals("AA"))
			 return "A";
		 else if(input.equals("CC"))
			 return "C";
		 
		 else return ".";
	 }
}
