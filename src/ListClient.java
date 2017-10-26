//a client of a class that implements ListInterface
//found in DSA p370

public class ListClient
{
	public static void main(String[] args)
	{
		testList();
	}
	
	public static void testList()
	{
		ListInterface<String> runnerList = new AList<>();
		//runnerList has only methods in ListInterface
		
		runnerList.add("16");
		runnerList.add(" 4");
		runnerList.add("33");
		runnerList.add("27");
		displayList(runnerList);
		
	}
	
	public static void displayList(ListInterface<String> list)
	{
		int numberOfEntries = list.getLength();
		System.out.println("The list contains " + numberOfEntries + " entries, as follows:");
		
		for(int position = 1; position <= numberOfEntries; position++)
		System.out.println(list.getEntry(position) + " is entry " + position); 
		
		System.out.println();
	}	//end displayList
}