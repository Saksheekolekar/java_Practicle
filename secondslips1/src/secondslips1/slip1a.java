package secondslips1;

class  slip1a extends Thread
{
		public void run()
		{
		try 
		{
		for(char i='A';i<'Z';i++)	
		{
			System.out.print(" "+i);
			sleep(2000);
		}
		} 
		catch (Exception e) 
		{
			System.out.println("Error="+e);
		}	
		}
  public static void main(String[] args) 
  {
	  slip1a a=new slip1a();
	   a.start();
    }
}