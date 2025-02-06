import java.util.*;
public class CountOccurence {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String to Check:");
	String input=sc.next();
	int count=0;
    char[] nArray=input.toCharArray();
  System.out.println(nArray[3]);
	 for (int i = 0; i < nArray.length; i++) 
	 {
		char temp=nArray[i];
		if(temp==0){
			continue;
			}
		else{
			for (int j = i+1; j < nArray.length; j++) {
				if(nArray[i]==nArray[j])
				{ 
					count ++;
					nArray[j]= (Character) null;
					
				}
				nArray[i]= (Character) null;
				if(count>0)
				{
					System.out.println("Occurence of  "+input.charAt(i)+" is " + count);
				}
				
				count=0;
				 
			}
		}
		}
		  
		
		
		
	}
	
	
	}

