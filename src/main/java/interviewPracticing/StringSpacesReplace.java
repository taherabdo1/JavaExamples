package interviewPracticing;

public class StringSpacesReplace {

	public String solution(char[] input){
		StringBuffer result=new StringBuffer();
		int begin=0;
		int end=0;
		int spaces=0;
		for(int i = 0 ; i < input.length ; i++){
			//to handle the spaces at the end of the input.
			if(i == input.length-1 && spaces > 0){
				break;
			}
			if(input[i] == ' '){
				spaces++;
				if(i < input.length-1 && input[i+1] == ' '){
					continue;
				}
				result.append(new String(input , begin , end+1));
				for (int j  =0 ; j < spaces ; j++){
					result.append("%20");					
				}
				begin = i+1;	//reinitialize
				spaces=0;
			}
			else{
				end = i-begin;
			}
		}
		result.append(new String(input , begin , end+1));
		
		return result.toString();
	}
}
