public class binarySearch{

public static void main(String[] args)
{

//PASTE TEST CASES HERE!!


}
public static Integer binarySearch(Comparable[] objArray, Integer searchObj, Integer low, Integer high)
{	
		Integer mid = 0;
		mid = (low + high) / 2;
		Integer potentialLow = new Integer(0);
		Integer addition = new Integer(1);
		
		if(searchObj.equals(mid))
				{
				return mid;
				}
			else if(searchObj > high)
				{
					return high + addition;
				}
			else if(searchObj.equals(high))
				{
					return searchObj - addition;
				}
			else if(searchObj.equals(low))
			{
				return searchObj;
			}
			else if(searchObj < 0)
			{
				return potentialLow;
			}
			else if(objArray[mid].compareTo(searchObj) < 0)
			{
				low = mid + 1;
				 Integer insertionIndex = binarySearch(objArray, searchObj, low, high);
				 return insertionIndex;
			}
			else if(objArray[mid].compareTo(searchObj) > 0)
			{
				high = mid - 1;
				Integer insertionIndex = binarySearch(objArray, searchObj, low, high);
				return insertionIndex;
			}
			else
				return potentialLow;
	}
}