package dconnect;


public class dsa
{
public static void main(String[] args) 
{
	//Check if pair with given Sum exists in Array (Two Sum)
	int temp ,sum=9;
	String exi="No";
	 int[] arr;
	 
     // allocating memory for 5 integers.
     arr = new int[4];

     // initialize the first elements of the array
     arr[0] = 3;

     // initialize the second elements of the array
     arr[1] = 02;

     // so on...
     arr[2] = 1;
     arr[3] = 0;
    
    int n=arr.length;
	
	
	for(int i=0;i<n;i++)
	{
	 for(int j=0;j<n;j++)
	{
		if(arr[i]+arr[j]==sum)
		{
			System.out.print(arr[i]+"+"+arr[j]+"\n");
			exi="yes";
		    break;
		}
     
	}
	 
	}
	System.out.println("present ? "+exi);
}
}
