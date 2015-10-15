package org.gh.app;

import javax.naming.ldap.SortControl;

import org.gh.app.SortHeap.SortHeap;
import org.gh.app.sortbubble.SortBubble;
import org.gh.app.sortinsert.SortInsert;
import org.gh.app.sortmerge.SortMerge;
import org.gh.app.sortquick.SortQuick;
import org.gh.app.sortselect.SortSelect;
import org.gh.app.sortshell.SortShell;

public class Test {
	public static void main(String[] args){
		 int [] beforenum={1,4,2,6,4,7,5,8};
		 int[] afternum=null;
		 //afternum=SortInsert.sortInsert(beforenum);
		 //afternum=SortSelect.sortSelect(beforenum);
		// afternum=SortBubble.sortBubble(beforenum);
		 //afternum=SortQuick.sortQuick(beforenum);
		 afternum=SortShell.sortShell(beforenum);
		// afternum=SortMerge.sortMerge(beforenum);
		 afternum=SortHeap.sortHeap(beforenum);
		 for(int num:afternum){
			 System.out.println(num);
		 }
	
		
		
		
	}

}
