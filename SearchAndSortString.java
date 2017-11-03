public class SearchAndSortString {
	
	public static int linearSearch(String[] arr, String target) {
		for(int i = 0; i < arr.length; i++)
			if(arr[i].equals(target))
				return i;
		return -1;
	}
	
	// This takes a specific value and efficiently searches the given array for the index of it
	public static int binarySearch(String[] arr, String value) {
		int min = 0, max = arr.length - 1, middle = 0;
		while(min <= max) {			// run until min and max values meet (make sure they don't cross)
			middle = min + (max - min) / 2;
			if(arr[middle] == value)			// if middle value = wanted value - stop and return
				return middle;
			else if(arr[middle].compareTo(value) > 0)
				min = middle + 1;
			else if(arr[middle].compareTo(value) < 0)
				max = middle - 1;
		}
		return -1;
	}
	
	// This checks values 1-2, 3-4, 5-6, etc... and swaps them depending on which is smaller/larger
		// This runs until no swaps have occurred, meaning that the array is in the proper sorted order
	public static String[] bubbleSort(String[] array) {
		boolean swapped = true;			// set swapped to true to begin first pass
		int j = 0;
		String temp;			// holding variable
		while(swapped) {
			swapped = false;			// set flag to false awaiting a possible swap
			j++;
			for(int i = 0; i < array.length - j; i++) {
				if(array[i].compareTo(array[i + 1]) > 0) {			// change to > for ascending sort
					temp = array[i];			// swap elements
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;			// shows a swap has occured
				}
			}
		}
		return array;
	}
	
	public static String[] selectionSort(String[] arr) {
	    int min;
	    for (int i = 0; i < arr.length; i++) {
	        min = i;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j].compareTo(arr[min]) < 0) {
	                min = j;	
	            }
	        }
	        if (min != i) {
	            final String temp = arr[i];
	            arr[i] = arr[min];
	            arr[min] = temp;
	        }
	    }
	    return arr;
	}
	
	public static String[] insertionSort(String[] arr) {
        String temp;
        for (int i = 1; i <  arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j].compareTo(arr[j - 1]) < 0){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
	}
}
