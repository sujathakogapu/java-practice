package com.example.arrays;

import java.util.Scanner;
/*
8.Write a program to find the average of all elements in an array.
  Input:
  Enter the size of the array: 5
  Enter the array elements: 10 20 30 40 50
  Output:
  The average of all elements in array is 30.0
*/
public class AverageOfElementsInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");//5
		int length = scanner.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the array elements:");//10,20,30,40,50
		for (int i = 0; i < length; i++) {//0<5;1,1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {//0<5;1,1<5;2,2<5;3,3<5;4,4<5;5,5<5->false
			sum = sum + arr[i];//0+10,10+20,30+30,60+40,100+50->150
		}
		double average = sum / length;//150/5->30.0 because datatype is double
		System.out.println("the avarege of given array is:" + average);//30.0
		scanner.close();
	}
}
