
public class BubbleSort extends PapaSort{

	public BubbleSort(int[] l, String name) 
	{
		super(l, name);
	}
	
	private boolean bubbleIt(int end)
	{
		boolean didSwap = false;
		
		for(int i = 0; i < end; i++)
		{
			
			if(getElement(i) > getElement(i + 1))
			{
				swap(i, i + 1);
				didSwap = true;
			}
			
		}
		return didSwap;
//			int biggest = i;
//			int question = i + 1;
//			
//			for(int j = i +1; j < getList().length; j++)
//			{
//				if(biggest > question)
//				{
//					swap(biggest, question);
//				}
//			}
//		}
		
	}
	

	@Override
	public void executeAlgorithm() {
		// TODO Auto-generated method stub
		
		boolean notDone = true;
		int bubbleEnd = getList().length - 1;
		do {
			notDone = bubbleIt(bubbleEnd);
			if(notDone)
			{
				bubbleEnd -= 1;
			}
		//System.out.println(this);
			
		} while(notDone && bubbleEnd >= 1);
		


		
	}

}
