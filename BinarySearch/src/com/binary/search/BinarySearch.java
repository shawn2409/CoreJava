package com.binary.search;

public class BinarySearch {

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;

			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			}else {
				last=mid-1;
			}mid=(first+last)/2;
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
