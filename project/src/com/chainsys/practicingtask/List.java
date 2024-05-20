package com.chainsys.practicingtask;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class List {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 

		int N=sc.nextInt(); 
		ArrayList<Integer> l=new ArrayList(); 
		int getnum;  


		for(int i=0;i<N;i++)
		{
			getnum=sc.nextInt(); 

			l.add(getnum);   

		}

		int Q=sc.nextInt(); 

		for(int i=0;i<Q;i++)

		{

			String query=sc.next();  

			if(query.equals("Insert"))
			{
				int index=sc.nextInt();
				int num=sc.nextInt();
				l.add(index,num);
			} 

			if(query.equals("Delete"))
			{
				int index=sc.nextInt();
				l.remove(index);
			}

		}
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");  
		}

	}
}

