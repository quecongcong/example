public class Demo{
	{
		System.out.println("普通代码块1");
	}
	static{
		System.out.println("静态代码块");
	}
	public Demo(){
		System.out.println("构造代码块");
	}
	{
		System.out.println("普通代码块2");
	}
	public int execute(){
		assert(0>1);
		return 100;
	}
	public static void main (String[]arg){
		Demo demo = new Demo();
		Demo demo1 = new Demo();
		demo.execute();
	}
}