package leet_code;
/*
 * https://leetcode.com/problems/ransom-note/
 *  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ; 
 *  otherwise,  it  will  return  false.   
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 */
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] charsCount = new int[128];
        int[] magazineCharsCount = new int[128];
        //initialize the arrays to use comparison
        for(int i = 0 ; i < 128 ; i++){
        	charsCount[i] = 0;
        	magazineCharsCount[i] = 0;
        }
        
        for(int i = 0 ; i < ransomNote.length() ; i++){
        	charsCount[ransomNote.charAt(i)]++;
        }
        
        for(int i = 0 ; i < magazine.length() ; i++){
        	magazineCharsCount[magazine.charAt(i)]++;
        }
        
        //compare the two arrays now
        for(int i = 0 ; i < 128 ; i++){
        	if(charsCount[i] > magazineCharsCount[i])
        		return false;
        }
        return true;
    }

}
