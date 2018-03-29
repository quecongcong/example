	public class ClassLoadDemo{
		public static void main(String[]arg){
			System.out.println(ClassLoadDemo.class.getClassLoader());
			System.out.println(ClassLoadDemo.class.getClassLoader().getParent());
			System.out.println(ClassLoadDemo.class.getClassLoader().getParent().getParent());
		}
	}