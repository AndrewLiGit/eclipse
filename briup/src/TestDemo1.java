
class  People{
	int age;
	public void chang(int i){
		i++;
		//return i;
	}
	public void chang2(People p){
		p = new People();
		p.age++;
	}
	public void chang3(People p,int i){
		p.age++;
		i++;
	}
} 

public  class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           People people = new People();
           int a = 0;
           people.chang(people.age);
           System.out.println(people.age);
       
//           People people = new People();
           people.chang2(people);
           System.out.println(people.age);
           
//           People people = new People();
           people.chang3(people,people.age);
           System.out.println(people.age);
	}

}
