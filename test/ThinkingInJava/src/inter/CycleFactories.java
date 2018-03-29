package inter;

import static util.Print.*;

/**
 * Title: CycleFactories.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017 <br>
 * Create DateTime: 2018年3月19日 下午4:10:13 <br>
 *
 * @author gaoxing
 */
interface Cycle {
	void method1();

	void method2();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {

	private Unicycle(){
		
	}
	
	public static final CycleFactory unicycleFactory = new CycleFactory() {
		
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
	@Override
	public void method1() {
		print("Unicycle method1");
	}

	@Override
	public void method2() {
		print("Unicycle method2");
	}
}


class Bicycle implements Cycle {

	private Bicycle() {
		
	}
	
	public static final CycleFactory bicycleFactory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
	
	@Override
	public void method1() {
		print("Bicycle method1");
	}

	@Override
	public void method2() {
		print("Bicycle method2");
	}

}


class Tricycle implements Cycle {

	private Tricycle(){
		
	}
	public static final CycleFactory tricycleFactory = new CycleFactory() {
		
		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
	@Override
	public void method1() {
		print("Tricycle method1");
	}

	@Override
	public void method2() {
		print("Tricycle method2");
	}

}

public class CycleFactories {
	public static void cycleFactory(CycleFactory cycleFactory) {
		Cycle cycle = cycleFactory.getCycle();
		cycle.method1();
		cycle.method2();
	}

	public static void main(String[] args) {
		cycleFactory(Unicycle.unicycleFactory);
		cycleFactory(Bicycle.bicycleFactory);
		cycleFactory(Tricycle.tricycleFactory);
	}
}