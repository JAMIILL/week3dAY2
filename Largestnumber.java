package WEEK3DAY2ARRAY;

import java.util.Arrays;

public class Largestnumber{

	public static void main(String[] args) {
		int arr[]= {2,99,45,22,3333,453,12,77,88,123};
		//int len = arr.length;
		Arrays.sort(arr);//arrange the values in ascending order
		for (int i=0;i<arr.length;i++)
		{
			System.out.println( arr[i]+ " ");
			System.out.println( "Second largest number is" +" "+arr[8] );
			
		}

	}

}
