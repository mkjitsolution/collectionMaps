package q2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		int arr[] = { 4, 8, 45, 9, 13, 11 };

		arr = bs.doSorting(arr);

		int result = bs.doSearch(arr, 14, 0, arr.length);
		
			
		if(result <= 0) System.out.println("Not Available in List");
		else System.out.println(" Avaliable in list");
	}

	public int[] doSorting(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;

	}

	
	public int doSearch(int arr[], int searchItem, int startPoint, int endPoint) {
		int foundAt = -1;
		boolean found = false;
		
		if(!(searchItem>=arr[startPoint] && searchItem<=arr[endPoint-1]))
		{
			return -1;
		}
		
		int midIndex = (startPoint + endPoint) / 2; // 0+6 = 6/2 :- 3
		int midValue = arr[midIndex]; // 9

		if (midValue == searchItem) {
			found = true;
			foundAt = midValue;
			return foundAt;
		}

		else if (midValue < searchItem) {
			startPoint = midIndex;
			doSearch(arr, searchItem, startPoint, endPoint);
		} else if (midValue > searchItem) {
			endPoint = midIndex;
			doSearch(arr, searchItem, startPoint, endPoint);
		}

		return 0;

	}

}
