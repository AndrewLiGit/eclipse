package com.briup.md06;
import java.util.*;
public enum Enum{
	ADD{
		public void calcu(Map<Double,Double> map){
			Set<Map.Entry<Double,Double>> set = map.entrySet();
			Iterator<Map.Entry<Double,Double>> iter = set.iterator();
			while (iter.hasNext()){
				Map.Entry<Double,Double> me = iter.next();
				double key = me.getKey();
				double value = me.getValue();
				System.out.println(key+"+"+value+"="+(key+value));
			}
		}
	},
	SUB{
		public void calcu(Map<Double,Double> map){
			Set<Map.Entry<Double,Double>> set = map.entrySet();
			Iterator<Map.Entry<Double,Double>> iter = set.iterator();
			while (iter.hasNext()){
				Map.Entry<Double,Double> me = iter.next();
				double key = me.getKey();
				double value = me.getValue();
				System.out.println(key+"-"+value+"="+(key-value));
			}
		}		
	},
	MUL{
		public void calcu(Map<Double,Double> map){
			Set<Map.Entry<Double,Double>> set = map.entrySet();
			Iterator<Map.Entry<Double,Double>> iter = set.iterator();
			while (iter.hasNext()){
				Map.Entry<Double,Double> me = iter.next();
				double key = me.getKey();
				double value = me.getValue();
				System.out.println(key+"*"+value+"="+(key*value));
			}
		}
	},
	DIV{
		public void calcu(Map<Double,Double> map){
			Set<Map.Entry<Double,Double>> set = map.entrySet();
			Iterator<Map.Entry<Double,Double>> iter = set.iterator();
			while (iter.hasNext()){
				Map.Entry<Double,Double> me = iter.next();
				double key = me.getKey();
				double value = me.getValue();
				System.out.println(key+"/"+value+"="+(key/value));
			}
		}
	};
	public abstract void calcu(Map<Double,Double> map);
}
	