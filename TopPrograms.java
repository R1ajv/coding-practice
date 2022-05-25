package com.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class MySorting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer d1 =(Integer) o1;
		Integer d2 = (Integer)o2;
		if(d1 > d2)
		return 1;
		if(d2 > d1)
			return -1;
		else		
			return 0;
	}
	
}
public class TopPrograms {

	/*
	 * public static List<Integer> genrate(int series) { // Armstrong number
	 * 
	 * return Stream.iterate(0, i->++i) .filter(i -> i ==
	 * Stream.of(String.valueOf(i).split("")) .map(Integer::valueOf) .map(n ->
	 * (n*n*n)) .mapToInt(n->n) .sum()) .limit(series)
	 * .collect(Collectors.toList()); }
	 */
	public static void main(String[] args) {
		
 		TreeSet data = new TreeSet(new MySorting());
 		data.add(1);
 		data.add(134);
 		data.add(112);
 		data.add(88);
 		
 		System.out.println(data);
		// Armstrong number

		/*
		 * List<Integer> generate = TopPrograms.genrate(2);
		 * System.out.println(generate); //Fabonacii series
		 * 
		 * 
		 * IntStream.range(1, 10_000_000) .filter((n) -> { int c = 0, temp = n; while
		 * (temp > 0) { c += Math.pow(temp % 10, Integer.toString(n).length()); temp /=
		 * 10; } return c == n; }).forEach(System.out::println);
		 * 
		 * 
		 * int num , a = 0 , b = 0 , c =1; Scanner sc = new Scanner(System.in); num =
		 * sc.nextInt();
		 * 
		 * System.out.println("Fibonacci Series of the number is:");
		 * 
		 * for( int i = 0 ; i < num ; i++) {
		 * 
		 * a = b; b = c; c = a + b;
		 * 
		 * System.out.println(a + " "); }
		 * 
		 * 
		 * int[] arr = {100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 ,};
		 * 
		 * int largest = 0 ; int secondLargest = 0 ;
		 * 
		 * System.out.println("Given array is:");
		 * 
		 * for(int i = 0 ; i< arr.length ; i++) {
		 * 
		 * System.out.println(arr[i] + "\t"); }
		 * 
		 * for(int i = 0 ; i < arr.length ; i++) {
		 * 
		 * if(arr[i]> largest) {
		 * 
		 * secondLargest = largest ; largest = arr[i]; }else if(arr[i] > secondLargest)
		 * { secondLargest = arr[i]; } }
		 * 
		 * System.out.println("Largest number :"+ largest );
		 * System.out.println("Second Largest Number :"+ secondLargest);
		 * 
		 * String str = "Rajeev"; Map<Object, Long> list =Arrays.asList(str.split(""))
		 * .stream() .map(ch-> ch)
		 * .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		 * 
		 * System.out.println(list);
		 */

		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";

		// removing white spaces from string

		String ar = Arrays.asList(str1.split(" ")).stream().map(h -> h.toLowerCase()).collect(Collectors.joining(""));
		System.out.println(ar);

		/*
		 * int[][] arr = { {1,2,3}, {2,3,4}, {5,6,7} };
		 * 
		 * int rows=0 , cols = 0 , sumRow ,sumCol ;
		 * 
		 * rows = arr.length ; cols = arr[0].length ;
		 * 
		 * for (int i = 0; i < rows; i++) {
		 * 
		 * sumRow = 0;
		 * 
		 * for (int j = 0; j < cols; j++) {
		 * 
		 * sumRow = sumRow + arr[i][j]; }
		 * 
		 * System.out.println("Sum of :" + (i + 1) + " row :" + sumRow); }
		 * 
		 * for (int i = 0; i < cols; i++) {
		 * 
		 * sumCol = 0;
		 * 
		 * for (int j = 0; j < rows; j++) {
		 * 
		 * sumCol = sumCol + arr[j][i]; }
		 * 
		 * System.out.println("Sum of :" + (i + 1) + " col :" + sumCol); }
		 */

		/*
		 * for(int[] a: arr) { for(int b: a) { System.out.println(""); } }
		 */

		/*
		 * int[] value = new int[5];
		 * 
		 * value[0] = 1; value[1] = 1; value[2] = 1; value[3] = 1; value[4] = 1;
		 * 
		 * for( int i = 0 ; i < value.length ; i++) { value[i] = i + 1 ;
		 * System.out.println("element at index " + i + " is :"+ value[i]); }
		 */

		/*
		 * int[][] ss = new int [2][3];
		 * 
		 * for( int[] arrr : ss) { for(int ab : arrr) { System.out.println(ab); } }
		 * 
		 * 
		 * for(int i = 0 ; i< ss.length ; i++) { for(int j = 0 ; j< ss[i].length ; j++)
		 * { System.out.println(ss[i][j]); } }
		 */

		/*
		 * int[] x = {1,2,3}; int[] y = {5,6};
		 * 
		 * x =y ; y = x ; for(int e : x) { System.out.println(e); }
		 * 
		 * for(int e: y) { System.out.println(e); }
		 */

		/*
		 * ArrayList al = new ArrayList(); System.out.println(al.size());
		 * 
		 * ArrayList al1 = new ArrayList(10); al1.add(11); al1.add(true);
		 * al1.add("John"); al1.add(11.23);
		 * 
		 * Iterator it = al1.iterator(); while(it.hasNext()) {
		 * 
		 * System.out.println(it.next());
		 * 
		 * 
		 * if(it.next()!= 11) {
		 * 
		 * }
		 * 
		 * }
		 * 
		 * LinkedList ll = new LinkedList(); ll.add(10); ll.add(1, 12); ll.set(1, 11);
		 * 
		 * System.out.println(ll);
		 * 
		 * ll.removeLast(); System.out.println(ll);
		 * 
		 * ll.addFirst(12); System.out.println(ll);
		 * 
		 * // Vector v = new Vector(Collection c) ;
		 * 
		 * 
		 * Vector v = new Vector(); v.add(11); v.add("test"); System.out.println(v);
		 * 
		 * v.remove(0); System.out.println(v.get(0));
		 * 
		 * Stack stack = new Stack(); stack.push(1); stack.push(10); stack.push(111);
		 * 
		 * 
		 * 
		 * stack.pop(); System.out.println(stack);
		 * System.out.println(stack.search(10));;
		 */
		
		
		/*
		 * Vector v = new Vector();
		 * 
		 * for(int i = 0 ; i< 9 ; i++){
		 * 
		 * Scanner sc = new Scanner(System.in); Integer value = sc.nextInt();
		 * v.addElement(value); }
		 * 
		 * System.out.println("Vector :"+ v);
		 * 
		 * Enumeration e = v.elements();
		 * 
		 * while(e.hasMoreElements()) { Integer element = (Integer) e.nextElement();
		 * 
		 * if(element % 3 == 0) { System.out.println(element); } }
		 */
		
		
		/*
		 * ArrayList<Integer> arr = new ArrayList<Integer>(); arr.add(12); arr.add(23);
		 * arr.add(36); arr.add(45);
		 * 
		 * Iterator iterator = arr.iterator();
		 * 
		 * while(iterator.hasNext()) { Integer r = (Integer) iterator.next();
		 * 
		 * if(r%3 == 0) { System.out.println(r); }else { iterator.remove(); } }
		 */
		
		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.add("Rajeev");
		 * list.add("Ramesh"); list.add("Jay"); list.add("Kushal"); list.add("KKK");
		 * 
		 * ListIterator<String> li =list.listIterator();
		 * 
		 * while(li.hasNext()) { String item = li.next();
		 * 
		 * if(item.equals("Jay")) { li.add("Veeru"); }if(item.equals("Kushal")) {
		 * li.add("Mangal"); }if(item.equals("Rajeev")) { li.remove(); }
		 * if(item.contains("KKK")){ li.set("Kaushall"); } } System.out.println(list);
		 */
		
		
		/*
		 * List<Integer> number = Arrays.asList(1,2,3,3,4,4,5,6,6,7,7,7,7,8);
		 * Map<Integer, Long> duplicates =number .stream()
		 * .collect(Collectors.groupingBy(Integer::intValue , Collectors.counting()));
		 * System.out.println(duplicates);
		 */
		
		//Armstrong number
		
		/*
		 * int num = 0 ; int rem; int c; int arm = 0 ;
		 * 
		 * System.out.println("Enter any Number :"); Scanner sc = new
		 * Scanner(System.in); num = sc.nextInt(); c = num ; while(num>0) { rem = num %
		 * 10; arm = (rem*rem*rem) + arm ; num = num/10; } if(c==arm) {
		 * System.out.println("Armstrong number"); }else {
		 * System.out.println("Not a Armstrong Number"); }
		 */
		
		
		int[] a = {12,34,34,55,67,4,4,8,9,9};
		int temp ;
		for(int i = 0 ; i< a.length ; i++) {
			int flag=0;
			for(int j = 0 ; j < a.length -1 - i ; j++)
			{
				
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] =  a[j+1];
					a[j+1] = temp;
					flag = 1;
				} 
					 
			}
			
			if(flag==0)
				break;
		}
		
		List<int[]> list = Stream.of(a).distinct().collect(Collectors.toList());
		
		for(int[] l : list) {
			for(int value : l) {
				System.out.println(value);
			}
		}
		
		List<Integer> list1 = Arrays.asList(12,34,34,55,67,4,4,8,9,9);

		//Read more: https://www.java67.com/2018/06/how-to-remove-duplicates-from-stream-in-java8-distinct-example.html#ixzz7PBlgfgfe
		
		//int[] a1 = {12,34,34,55,67,4,4,8,9,9};
		
		System.out.println("-----------------------------------");
		
	 List<Integer> list2 =list1.stream().sorted().distinct().collect(Collectors.toList());
	//	List<int[]> list1 = Stream.of(a1).distinct().collect(Collectors.toList());
		
		for(Integer l : list2) {
			
				System.out.println(l);
		}
		
		System.out.println("-----------------------------------");
		
		List<Integer> ll =	list1.stream().filter(m->m%2 !=0).map(k-> k*k).collect(Collectors.toList());
		
		System.out.println(ll);
	}
}
