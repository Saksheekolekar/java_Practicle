package tasks;

public class SameLength {

	public static void main(String[] args) {
        
        String[] arr = {"ram", "sham", "sita", "gita", "krushna", "madhav"};
        DisplayElemets(arr);
    }

    public static void DisplayElemets(String[] arr) 
    {
        int n = arr.length;
        boolean[] printed = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            if (printed[i]) 
            {
                continue;
            } 
            
            int length = arr[i].length();
            System.out.print("Elements with Length "+length+" :");
            System.out.print(arr[i]);
            printed[i] = true;
            
            
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j].length() == length)
                {  
                    System.out.print("= " + arr[j]);     
                    printed[j] = true;
                }
            }
            System.out.println();
        }
    }
}
