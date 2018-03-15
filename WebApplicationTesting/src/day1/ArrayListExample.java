package day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		/*int a=30;
		a=20;
		System.out.println(a);*/
		
		List<String>a = new ArrayList<>();
		a.add("Amar");
		a.add("Hello");
		a.add("Hi");
		a.add("Chello");
		
		/*System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));*/
		
		for(int i=0;i<4;i++)
		{
			System.out.println(a.get(i));
		}
		
		

	}

}
