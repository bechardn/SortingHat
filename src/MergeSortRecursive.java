
public class MergeSortRecursive extends PapaSort{

	public MergeSortRecursive(int[] l, String sortName) {
		super(l, sortName);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void executeAlgorithm() {
		// TODO Auto-generated method stub
		
		mergeSort(0, this.getLength() - 1);

		
	}
	
	private void mergeSort(int lStart, int lEnd)
	{
		int lMid = (lStart + lEnd) / 2;
	
		if(lEnd > lStart)
		{
			mergeSort(lStart, lMid);
			mergeSort(lMid + 1, lEnd);
			
			merge(lStart, lMid, lMid + 1, lEnd);

		}
	}
	
	private void merge(int start1, int end1, int start2, int end2)
	{
		//System.out.println("Hi merge this");
		int l1 = start1;
		int l2 = start2;

		int [] temp = new int[(end1-start1 + 1) + (end2-start2 + 1)];
		int tPointer = 0;
		
		while(l1 <= end1 && l2 <= end2)
		{
			if(this.getElement(l1) <= this.getElement(l2))
			{
				temp[tPointer] = this.getElement(l1);
				l1++;
			} else
			{
				temp[tPointer] = this.getElement(l2);
				l2++;
			}
			tPointer++;
		}
		
		for(int tp = tPointer; tp < temp.length; tp++)
		{
			if(l1 <= end1)
			{
				temp[tp] = this.getElement(l1);
				l1++;
			} else
			{
				temp[tp] = this.getElement(l2);
				l2++;
			}
		}

		
		for(int i = start1, t = 0; i <= end2; i++ , t++)
		{
			this.setElement(i, temp[t]);
		}
	}

}
