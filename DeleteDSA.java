class DeleteDSA
{
	public static void main(String[] args)
	{
		int ar[] = {5,10,15,20,25,30};
		int pos = 3;
		

		int br[] = new int[ar.length-1];
		for(int i = 0;i<pos-1;i++)
		{
		    br[i]=ar[i];
		}
     		
		for(int i = pos-1;i<ar.length-1;i++)
		{
		    br[i]=ar[i+1];
		}


		for(int i = 0;i<br.length;i++)
		{
		    System.out.print(br[i]+",");
		}
	}
}