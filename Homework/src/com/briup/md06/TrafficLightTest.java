package com.briup.md06;

public class TrafficLightTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TrafficLight tl = TrafficLight.GREEN;
			tl.setValue(30);
			tl.next();
			TrafficLight t2 = TrafficLight.RED;
			t2.setValue(60);
			t2.next();
			TrafficLight t3 = TrafficLight.YELLOW;
			t3.setValue(5);
			t3.next();
	}

}
