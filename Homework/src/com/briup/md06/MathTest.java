package com.briup.md06;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MathTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Double,Double> map1 = new HashMap<Double,Double>();
		map1.put(1.0, 2.0);
		Enum ea1 = Enum.ADD;
		ea1.calcu(map1);
		Map<Double,Double> map2 = new HashMap<Double,Double>();
		map2.put(1.0, 2.0);
		Enum ea2 = Enum.SUB;
		ea2.calcu(map2);
		Map<Double,Double> map3 = new HashMap<Double,Double>();
		map3.put(1.0, 2.0);
		Enum ea3 = Enum.MUL;
		ea3.calcu(map3);
		Map<Double,Double> map4 = new HashMap<Double,Double>();
		map4.put(1.0, 2.0);
		Enum ea4 = Enum.DIV;
		ea4.calcu(map4);
	}

}
