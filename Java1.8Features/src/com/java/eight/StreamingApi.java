package com.java.eight;
import java.util.ArrayList;
import java.util.stream.Stream;
public class StreamingApi {

	public static void main(String[] args) {
		 
		ArrayList<Integer> myList=new ArrayList<>();
		
		for(int i=10;i<100;i++)
		{
			myList.add(i);
		}
		
	
		//sequential order in collection API implements Stream(I) and ParallelSream
		Stream<Integer> Sequential=myList.stream();
		Stream<Integer> heighNumbers=Sequential.filter(p->p>20);
		heighNumbers.forEach(p->
		{System.out.println(p);});
			

		//Parallel order
		Stream<Integer> parlleel=myList.parallelStream();
		Stream<Integer> heighNo=parlleel.filter(p->p>20);
		heighNo.forEach(p->{System.out.println(p);});
		
		
		
		//in Single Line
		myList.stream().filter(p->p>20).forEach(p->{System.out.println(p);});;
		
		
		
	}
}
