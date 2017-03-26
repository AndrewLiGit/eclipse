package com.briup.md06;

public enum Weekday {
	MONDAY{
		public void nextDay(){
			System.out.println("Next day is Tuesday...");
		}
	},TUESDAY{
		public void nextDay(){
			System.out.println("Next day is Wednesday...");
		}		
	},WEDNESDAY{
		public void nextDay(){
			System.out.println("Next day is Thursday...");
		}		
	},THURSDAY{
		public void nextDay(){
			System.out.println("Next day is Friday...");
		}		
	},FRIDAY{
		public void nextDay(){
			System.out.println("Next day is Saturday...");
		}	
	},SATURDAY{
		public void nextDay(){
			System.out.println("Next day is Sunday...");
		}		
	},SUNDAY{
		public void nextDay(){
			System.out.println("Next day is Monday...");
		}		
	};
	public abstract void nextDay();
	public static void main(String args[]){
		Weekday wd = Weekday.MONDAY;
		wd.nextDay();
	}
}
