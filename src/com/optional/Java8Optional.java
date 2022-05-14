package com.optional;

import java.util.Date;
import java.util.Optional;
public class Java8Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create Optional Object
		//String str=null; if you trying to use null we will get null pointer exception, to avoid null pointer exception
		
		Optional<String> mystr1=Optional.empty();
		Optional<String> mystr2=Optional.of("String");
		Optional<String> mystr3=Optional.ofNullable("Second");
		System.out.println(mystr1);
	
	Optional<Date> emptyDt=Optional.empty();
	System.out.println(emptyDt.orElseGet(()->new Date()));
	
	Optional<Integer> age=Optional.of(20);
	System.out.println("filter="+age.filter(n->n>18 ).get());
	
	Optional<Integer> price=Optional.ofNullable(20);
	System.out.println("mapr="+price.map(n->n*n));
	Optional<Integer> prc=price.map(p->p*p);
	if(prc.isPresent()) {
		System.out.println(prc.get());
	}
	}

}
