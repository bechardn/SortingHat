import java.util.Arrays;

public class SortingHat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int howMany = 10;
		
		int numList[] = getRandom(howMany);
		int numList1[] = numList.clone();
		//System.out.println(Arrays.toString(numList));
		

//		MergeSortNR msNR = new MergeSortNR(numList, "MS Non-Recursive");
//		doTiming(msNR);
//		//System.out.println(msNR);

		MergeSortRecursive msR = new MergeSortRecursive(numList, "MS Recursive");
		doTiming(msR);
		//System.out.println(msR);
		listCheck2(numList);

		
//		int howMany = 10000;
		int[ ] nums = getRandom(howMany);
//		int[ ] nums0 = getAscendingOrder(howMany);
//		int[ ] nums1 = nums0.clone();
//		int[ ] nums2 = getRandom(howMany);
//		int[ ] nums3 = getDescendingOrder(howMany);
//		int[ ] nums3A = nums3.clone();
//
//
//
//		//System.out.println(Arrays.toString(nums0));
//		//System.out.println(Arrays.toString(nums1));
//		
//		
//		SelectionSort sSort = new SelectionSort(numList, "Selection Sort");
//		doTiming(sSort);
		//System.out.println(sSort);
////		
//		BubbleSort bSort = new BubbleSort(nums, "Bubble Sort");
//		doTiming(bSort);
////		//System.out.println(bSort);
//		InsertionSort inS = new InsertionSort(nums3A, "Insertion Sort");
//		doTiming(inS);
//		//System.out.println(inS);
////		InsertionSort inSW = new InsertionSort(nums3, "Insertion Sort Worst");
////		doTiming(inSW);
//		//System.out.println(inSW);

		
	}
	
	public static void doTiming(PapaSort s)
	{
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime(); 
		
		s.executeAlgorithm();
		
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		
		long theTime = end - start;
		long theTime2 = end2 - start2;
		
		if(s.getLength() <= 100)
		{
			System.out.println("The time for " + s.getSortName() + " is: " + theTime2 + " nano seconds");
			//System.out.println(sSort);
			//System.out.println(bSort);


		} else 
		{
			System.out.println("The time for " + s.getSortName() + " is: " + theTime + " milli seconds");
			//System.out.println(sSort);
			//System.out.println(bSort);


		}
		
	}
	

	public static int[ ] getRandom(int n)
	{
		int [ ] nlist = new int[n];
		
		for(int i = 0; i < nlist.length; i ++) 
		{
			nlist[i] = (int)(Math.random() * 1000);
		}
		
		
		return nlist;
		
	}
	
	public static int [ ] getAscendingOrder(int n)
	{
	int [ ] nlist = new int[n];
		
		for(int i = 0; i < nlist.length; i ++) 
		{
			nlist[i] = i + 1;
		}
		
		
		return nlist;
	}
	
	public static int [ ] getDescendingOrder(int n)
	{
	int [ ] nlist = new int[n];
		
		for(int i = 0; i < nlist.length; i ++) 
		{
			nlist[i] = nlist.length - i;
		}
		
		
		return nlist;
	}
	
	public static void listCheckAsc(int[] l)
	{
		if(l != null)
		{
			int lastVale = l[0];
		}
	}
	
	public static boolean listCheck2(int[] l)
	{
		for(int i = 0; i < l.length - 1; i++)
		{
			if(l[i] > l[i + 1])
			{
				return false;
			}
		}
		return true;
	}

}
