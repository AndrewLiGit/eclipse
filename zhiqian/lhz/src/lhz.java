
public class lhz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test L=new Test("李怀振",170.0,54);
          System.out.println(L.talk());
	}

}
class Test{
	String name;
	double tall;
	double weight;
	public Test(String n,double t,double w){
		name=n;
		tall=t;
		weight=w;
	}
	String talk(){
	   return "姓名："+name+"，身高："+tall+"，体重："+weight;	
	}
}