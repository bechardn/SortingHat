import java.util.Arrays;

public class SelectionSort extends PapaSort{
	
	
	public SelectionSort(int[] l, String name)
	{
		super(l, name);
	}
	
	public void executeAlgorithm()
	{
		//loop through numbers, find biggest one
		
		
		for(int j = 0; j < getList().length - 1; j++)
		{
			//int biggest = myList[j];
			int biggest = getElement(0);
			int bigLoc = 0;
		
		for(int i = 0 + 1; i < getList().length - j; i++)
		{
			if(biggest < getElement(i))
			{
				biggest = getElement(i);
				bigLoc = i;
			}
		}
		
		//swap
		swap(bigLoc, super.getList().length - 1 - j);
		
	}
	}
	

}
