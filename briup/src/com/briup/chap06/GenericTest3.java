package com.briup.chap06;

import java.util.*;

public class GenericTest3<T extends Collection> {


	public static void main(String args[]) {

		GenericTest3<ArrayList> gt = 
			new GenericTest3<ArrayList>();
	    GenericTest3<HashSet> gt2 = 
			new GenericTest3<HashSet>();
//		GenericTest3<HashMap> gt3 = 
//			new GenericTest3<HashMap>();

		
	}
}
