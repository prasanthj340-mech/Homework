class BinarySearchRecur
{
	public static void main(String[] args)
	{
		int ar[] = {3,5,7,9,11,13,15,17,19,21};
		int target = 19;

		int start = 0;
		int end = ar.length-1;
		
		BinarySearchRecur bs = new BinarySearchRecur();
		int result = bs.Bsearch(ar,target,start,end);

		if(result==-1)
                {
		   System.out.println("Target Value Not Found");
		}
		else
		{
		   System.out.println("Target Value is Found and Index : "+result);
		}


	}

	int Bsearch(int br[], int tar,int start, int end)
	{
		if(start>end)
		{
			return -1;
		}

		int mid = (start+end)/2;

		if(br[mid]==tar)
		{
			return mid;
		}
		else if(br[mid]>tar)
		{
			return Bsearch(br,tar,start,mid-1);
		}
		else
		{
			return Bsearch(br,tar,mid+1,end);
		}
	
	}
}