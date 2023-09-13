package com.collections;

import java.util.Comparator;

public class Comparator1 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
	
	Integer i1=(Integer)o1;//typecasting done
	Integer i2=(Integer)o2;//typecasting done
	
	if(i1<i2) {
		return -48373;	// (+)reverse(larger to smaller		
	}else if(i1>i2) {
		return +100;// (+)no change as it is(larger to smaller)
	}else
	return 0;//if both arae equal
	}

}
