public class Demo{
	{
		System.out.println("��ͨ�����1");
	}
	static{
		System.out.println("��̬�����");
	}
	public Demo(){
		System.out.println("��������");
	}
	{
		System.out.println("��ͨ�����2");
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