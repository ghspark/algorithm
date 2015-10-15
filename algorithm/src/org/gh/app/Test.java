package org.gh.app;

import javax.naming.ldap.SortControl;

import org.gh.app.sortinsert.SortInsert;

public class Test {
	public static void main(String[] args){
		 int [] beforenum={1,4,2,6,4,7,5};
		 int[] afternum=null;
		 afternum=SortInsert.sortInsert(beforenum);
		 
		 for(int num:afternum){
			 System.out.println(num);
		 }
	
		
		
		
	}

}
