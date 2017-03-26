import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//Test2.getStudent("StudentTest");
		StudentTest s = (StudentTest)ReflectTest2.getStudent("StudentTest");
		System.out.println(s.getName());
	}
	public static Object getStudent(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException  {
		Class c = Class.forName(className);
		Object o = c.newInstance();
		Field[] fields = c.getDeclaredFields();
		/*for(int i=0;i<fields.length;i++){
			System.out.println(fields[i].getName());
		}*/
		//拿到属性的名字
		String string = fields[0].getName().toString();
		//拼接属性方法名
		String methodName = "set"+string.replaceFirst(string.substring(0, 1), string.substring(0, 1).toUpperCase());
//		System.out.println(methodName);
		//反射出来这个方法
		Method method = c.getDeclaredMethod(methodName, new Class[]{String.class});
		method.invoke(o, "tom");
		return o;		
	}
}
class StudentTest{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}