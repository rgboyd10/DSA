import java.util.*;
import java.security.SecureRandom;
import java.math.BigInteger;
public class CommonElements implements Comparable<CommonElements>
{
	public static void main(String[] args)
	{
			//TEST CASE #1
		/*
			Comparable[] col1 = {"banana","apple","pear","banana","pomegranate","pineapple","cherry","jujube","cherry","orange"};
			Comparable[] col2 = {"quince","raspberry","banana","lemon","apple","banana","cherry","blueberry","jujube","mango"};
			Comparable[] col3 = {"plum","pomegranate","lime","banana","jujube","blueberry","apple","cherry","grape","banana"};
			Comparable [][] collections = {col1, col2, col3};
		*/
		
			 //TEST CASE #2
			 /*
			 Comparable[] col1 = {"dog","dog","dog","bird","cat"};
			 Comparable[] col2 = {"cat","dog","cow","shark","snake"};
			 Comparable[] col3 = {"dog","cat","bird","bird","snake"};
			 Comparable[] col4 = {"cow","cow","yellow","dog","cat"};
			 Comparable[] col5 = {"dog","cat","cat","cow","snake"}; 
			 Comparable[][] collections = {col1, col2, col3, col4, col5};
			 */
		
			//TEST CASE #3
			/* 
			Comparable [] col1 = {};
			Comparable[][] collections = {col1}; 
			 */
			 
			
			 //TEST CASE #4
		/*
			Comparable[] col1 = {"rat","animal","dog","bob","are"};
			Comparable[] col2 = {"nuns","rat"};
			Comparable[] col3 = {"toilet","algorithms","are","funny","and","my","specialty","nuns","rat","what?"};
			Comparable[][] collections = {col1, col2, col3};
		 */
		  		
			for(int b = 0; b < collections.length; b++)
			{
				collections[b] = sort(collections[b]);	
			}
						
	Comparable[] commonElements = findCommonElements(collections);
		
	for(int p = 0; p < commonElements.length; p++)
		{
			if(commonElements[p]!= null)
			System.out.println(commonElements[p]);
		}
	}
	
	public static Comparable[] findCommonElements(Comparable[][] collections)
		{
		int comparisons = 0;
		int numOfCollections = collections.length; //gets the number of Comparable arrays
		
		Comparable[] queryCollections = new Comparable[collections[0].length]; // sets the first comparable array as the primary comparison

//creates the commonElements array with size equal to sum of all columns
		int sum = 0;
		for(int p = 0; p < collections.length; p++)
		{
			sum = sum + collections[p].length;
		}	
		Comparable[] commonElements = new Comparable[sum];
		
//sorts collections in alpha order
		for(int s = 0; s < collections.length; s++)
		{
			collections[s] = sort(collections[s]);
		}
		
// sets the first comparable array as the queryCollections
		for(int a = 0; a < queryCollections.length; a++)	
		{
		 queryCollections[a] = collections[0][a];
		}

		int stPoint = 0;
		int numofCommonElements = 0;
	
		Comparable[] temp = new Comparable[sum];

	for(int x = 0; x < queryCollections.length; x++)
	{
	for(int b = 1; b < numOfCollections;)
		{
			for(int y = stPoint; y < collections[b].length; y++)
			{
				comparisons++;
				if(queryCollections[x].compareTo(collections[b][y]) == 0)
				{
					commonElements[x] = collections[b][y];
					stPoint = b;
					b++;
					break;
				}
				
				comparisons++;
				if(queryCollections[x].compareTo(collections[b][y]) != 0 && y == collections[b].length -1)
				{
				b = numOfCollections -1;
				break;
				}	
			}
			b++;
		}
	}
		int finalComps = getComparisons(comparisons);
		System.out.println("The number of comparisons that were performed is " + finalComps + "."+ "\n");
		
		return commonElements;
}
	
	public static int getComparisons(int comparisons)
	{
		int comparison = comparisons;
		return comparison;
	}

	public static Comparable[] sort(Comparable[] objArray)
	{
		Comparable temp;
		int j;
		for(int i = 0; i < objArray.length; i++)
		{
			temp = objArray[i];
			
			for(j = i; j > 0 && temp.compareTo(objArray[j-1]) < 0; j--)
				objArray[j] = objArray[j-1];
				
				objArray[j] = temp;
			
		}
		return objArray;
	}	
}