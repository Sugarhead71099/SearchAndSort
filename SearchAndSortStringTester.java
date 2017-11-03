import java.util.Arrays;

public class SearchAndSortStringTester
{

	public static void main(String[] args)
	{
		String[] myArray = {"Anthony", "Barbara", "Bob", "Chris", "Dwayne", "Elena", "Frank", "Gauss", "Johnny", "Stevie", "Wayne", "Zebra", "christopher", "jimmy", "sonja"};
		String[] needsSorting1 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] needsSorting2 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] needsSorting3 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		
		
		System.out.println("3 tests for linear search:");
		System.out.print((SearchAndSortString.linearSearch(myArray, "Gauss") == 7) + ", "); 
		System.out.print((SearchAndSortString.linearSearch(myArray, "Anthony")==0) + ", ");
		System.out.print(SearchAndSortString.linearSearch(myArray, "Izzo")==-1);
		System.out.println();
		
		System.out.println("3 tests for binary search:");
		System.out.print((SearchAndSortString.binarySearch(myArray, "sonja")==14) + ", ");
		System.out.print((SearchAndSortString.binarySearch(myArray, "Zebra")==11) + ", ");
		System.out.print(SearchAndSortString.binarySearch(myArray, "humpty dumpty")==-1); //1013 is not in the array, so linearSearch should return -1
		System.out.println();
		

		System.out.println("4 tests for bubble sort:");
		System.out.print(isSorted(SearchAndSortString.bubbleSort(myArray)) + ", "); //should return true
		System.out.print(isSorted(needsSorting1) + ", ");//should return false
		System.out.print(isSorted(SearchAndSortString.bubbleSort(needsSorting1)) + ", ");//should return true
		System.out.print(isSorted(needsSorting2) + ", ");//should return false
		System.out.print(isSorted(SearchAndSortString.bubbleSort(needsSorting2)) + ", ");//should return true
		System.out.print(isSorted(needsSorting3) + ", "); //should return false
		System.out.print(isSorted(SearchAndSortString.bubbleSort(needsSorting3)));//should return true
		System.out.println();
	
	
		String[] needsSorting4 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] needsSorting5 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] needsSorting6 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		
		System.out.println("4 tests for selection sort:");
		System.out.print(isSorted(SearchAndSortString.selectionSort(myArray)) + ", "); //should return true
		System.out.print(isSorted(needsSorting4) + ", ");//should return false
		System.out.print(isSorted(SearchAndSortString.selectionSort(needsSorting4)) + ", ");//should return true
		System.out.print(isSorted(needsSorting5) + ", ");//should return false
		System.out.print(isSorted(SearchAndSortString.selectionSort(needsSorting5)) + ", ");//should return true
		System.out.print(isSorted(needsSorting6) + ", "); //should return false
		System.out.print(isSorted(SearchAndSortString.selectionSort(needsSorting6)));//should return true
		System.out.println();
	
		String[] needsSorting7 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] needsSorting8 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] needsSorting9 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		
		System.out.println("4 tests for insertion sort:");
		System.out.print(isSorted(SearchAndSortString.insertionSort(myArray)) + ", "); //should return true
		System.out.print(isSorted(needsSorting7) + ", ");//should return false
		System.out.print(isSorted(SearchAndSortString.insertionSort(needsSorting7)) + ", ");//should return true
		System.out.print(isSorted(needsSorting8) + ", ");//should return false
		System.out.print(isSorted(SearchAndSortString.insertionSort(needsSorting8)) + ", ");//should return true
		System.out.print(isSorted(needsSorting9) + ", "); //should return false
		System.out.print(isSorted(SearchAndSortString.insertionSort(needsSorting9)));//should return true
		System.out.println();
		
	}

	
	private static boolean isSorted(String[] values)
	{
		for(int i = 0; i < values.length - 1; i++)
		{
			if(values[i].compareTo(values[i + 1]) > 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static String display(String[] values)
	{
		String result = "";
		for(int i = 0; i < values.length; i++)
		{
			result = result + "subscript[" + i + "] = " + values[i] + "\n";
		}
		
		return result;
	}
	
	


	

}
