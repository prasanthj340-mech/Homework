class InsertDSA
{
	public static void main(String[] args)
	{
		int ar[] = {5,10,15,20,25,30};
		int pos = 4;
		int value = 18;

		int br[] = new int[ar.length+1];
		for(int i = 0;i<pos-1;i++)
		{
		    br[i]=ar[i];
		}
     		br[pos-1]=value;
		for(int i = pos-1;i<ar.length;i++)
		{
		    br[i+1]=ar[i];
		}


		for(int i = 0;i<br.length;i++)
		{
		    System.out.print(br[i]+",");
		}
	}
}