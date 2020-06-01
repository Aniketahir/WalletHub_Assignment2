package com.mainAssignment;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class myGeneralMethods {
	public class ListComparator { 
		 public String  getSimilarItem(List listOne, List listTwo)
		 {
	         Collection<String> similar = new HashSet<String>( listOne );
	         Collection<String> different = new HashSet<String>();
	         different.addAll( listOne );
	         different.addAll( listTwo );

	         similar.retainAll( listTwo );
	         return  similar.toString();
	         //System.out.printf("One:%s%nTwo:%s%nSimilar:%s%nDifferent:%s%n", listOne, listTwo, similar, different);	 
		 }
		 
		 public String  getDifferentItem(List listOne, List listTwo)
		 {
			 System.out.println(listOne);
			 System.out.println(listTwo );
			 Collection<String> similar = new HashSet<String>( listOne );
	         Collection<String> different = new HashSet<String>();
	         different.addAll( listOne );
	         different.addAll( listTwo );
	         similar.retainAll( listTwo );
	         different.removeAll( similar );
	         return  different.toString();
	         //System.out.printf("One:%s%nTwo:%s%nSimilar:%s%nDifferent:%s%n", listOne, listTwo, similar, different);
		 }
}
}
