package operator;

/**
 * Title: Dog.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年2月28日 下午6:11:56 <br>
 *
 * @author gaoxing
 */
public class Dog {
	String name;
	String says;
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(int i,String says){
		this(says);
	}
	public Dog(String says){
		
	}
	public Dog(int i){
		this(i, "blank");
	}
	void bark(int i,String say,Dog dog){
		System.out.println("int:"+say);
		this.bark(say);
		bark(say);
		System.out.println(this == dog);
	}
	void bark(String say){
		System.out.println("say"+say);
	}
	static void bark(){
		main(new String[]{});
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();	
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff!";
		Dog dog2 = new Dog();
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		System.out.println("dog1的名字:"+dog1.name+"  dog1叫声:"+dog1.says);
		System.out.println("dog2的名字:"+dog2.name+"  dog2叫声:"+dog2.says);
		Dog dog3 = dog1;
		System.out.println(dog1 == dog3);
		System.out.println(dog1.equals(dog3));
		
		dog1.bark(1, "汪汪",dog2);
	}
}
