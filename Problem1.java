
public class Problem1 {

	
public static void main(String[] args) {
	
	long startTime = System.nanoTime();

	//Test array
	int[] testArray={1,2,2,1,2,2,4,1};
	

	
	//returns start and end index of the subset
	int result[]=execute(testArray, 8);
	
	for(int i= result[0];i<=result[1];i++)
	{
		System.out.print(testArray[i]+",");
	}

	
	long endTime   = System.nanoTime();
	long totalTime = endTime - startTime;
	
	System.out.println("");
	System.out.println("running time (in nano sec)"+totalTime);
	
}



	public static int[] execute(int A[],int k)
	{
		int sum=0;
		int startIndex=0,endIndex=-1;
		int[] resultArray=new int[2];
		
		boolean flag=false;
		
		//TO find initial Sub Array with sum greater than K
		for(int i=0;i<A.length ;i++)
		{
			sum=sum+A[i];
			
			if(sum >= k)
			{
				endIndex=i;
				
				while(sum >= k )
				{
					sum=sum-A[startIndex];
					startIndex++;
					flag=true;
				
				}
				
				if(flag)
				{
					startIndex--;
					sum=sum+A[startIndex];
						
				}
				flag=false;
				
				break;
			}
			
		
			
			
		}
	
		int difference=endIndex-startIndex;

		
		flag=false;
		int tempStart=startIndex;
		for(int i=endIndex+1;i<A.length;i++)
		{
			sum=sum+A[i];
			
			while(sum >= k )
			{
				sum=sum-A[tempStart];
				tempStart++;
				flag=true;
				
			}
			
			if(flag)
			{
				tempStart--;
				sum=sum+A[tempStart];
				flag=false;
			}
			
			//check if current solution is best
			if(difference >= (i-tempStart) && sum >= k)
			{
				
				difference=i-tempStart;
				startIndex=tempStart;
				endIndex=i;
			}
			
			
		}
		
		
		resultArray[0]=startIndex;
		resultArray[1]=endIndex;
		return resultArray;
		
	}


public int[] readTextFile(String fileName)
{
	
	///TODO reads text from file and makes int array
	return null;
	
}
	
	
	
}
