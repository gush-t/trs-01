package com.gu.study.newJDK8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author gushaohua
 *
 */

public class StreamStudy {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("bbb");
		list.add("aaa");
		System.out.println(sortJdk8(list));
		
	}

	
	
	public static List<String> sortJdk8(List<String> list){
		Collections.sort(list, (s1,s2) ->s2.compareTo(s1) );
		return list;
		
	}

}
