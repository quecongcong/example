package multiplexing;

import util.Print;

/**
 * Title: Liquid.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月9日 下午2:53:56 <br>
 *
 * @author gaoxing
 */
public class Liquid extends Detergent{
	@Override
	public void scrub() {
		append(" Liquid.scrub() ");
	}
	
	public void sterilize() {
		append(" sterilize() ");
	}
	
	public static void main(String[] args) {
		Liquid liquid = new Liquid();
		liquid.dilute();
		liquid.scrub();
		liquid.apply();
		liquid.sterilize();
		Print.print(liquid);
	}
}
