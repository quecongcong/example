package inter;

/**
 * Title: Adventure.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月15日 下午3:04:49 <br>
 *
 * @author gaoxing
 */
interface CanFight {
	int VALUES = 5;
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanClimb{
	void climb();	
}
class ActionCharacter {
	public void fly() {
		
	}
}
class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly,CanClimb{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}
	
	public static void u(CanSwim x) {
		x.swim();
	}
	
	public static void v(CanFly x) {
		x.fly();
	}
	
	public static void w(ActionCharacter x) {
		x.fly();
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		System.out.println(CanFight.VALUES);
		t(hero);
		u(hero);
		v(hero);
		w(hero);
	}
}
