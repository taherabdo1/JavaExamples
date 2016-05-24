package hackerRank;

import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        int i = 0 ;
        int j = number.length()-1;
        
        while(k > 0 && i <= j){
        	if(i == j ){
        		break;
        	}
        	if(number.charAt(i) == number.charAt(j)){
        		++i;
        		--j;
        	}
        	else{
        		if(number.charAt(i) > number.charAt(j)){
        			number = number.substring(0 , j) + number.charAt(i) + number.substring(j+1);
        		}
        		else{
        			if(j != number.length()-1){
        				number = number.substring(0 , j) + number.charAt(j) + number.substring(j+1);        				
        			}
        			else{
        				number = number.substring(0 , i) + number.charAt(j) + number.substring(i+1);        				
        				
        			}
        		}
        		k--;
        		i++;
        		j--;
        	}
        }
        // the number is palindrome but not sure if is the biggest
        i = 0 ; 
        j = number.length()-1;
        while(k>0){
        		if(number.charAt(i) != 9 && k > 2){
        			number = number.substring(0 , i) + "9" + number.substring(i+1);
        			if(j < number.length()-1)
        				number = number.substring(0 , j) + "9" + number.substring(j+1);
        			else
        				number = number.substring(0 , j) + "9";
        			
        			k-= 2;
        		}
        		else
        			break;
        	}
      System.out.println(number);  
    }
}
