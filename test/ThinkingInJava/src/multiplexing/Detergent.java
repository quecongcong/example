package multiplexing;

import util.Print;

/**
 * Title: Detergent.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月9日 下午2:19:16 <br>
 *
 * @author gaoxing
 */
public class Detergent extends Cleanser{
	
	@Override
	public void scrub() {
		append(" Detergent.scurb() ");
		super.scrub();
	}
	
	public void foam() {
		append(" foam() ");
	}
	
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		Print.print(x);
		Print.print("Testing base class:");
		Cleanser.main(args);
	}
}
