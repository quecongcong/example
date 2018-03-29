package initializeandclear;

/**
 * Title: Burrito.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月7日 下午5:26:20 <br>
 *
 * @author gaoxing
 */
public class Burrito {
	
	Spiciness degree;
	public Burrito(Spiciness degree) {
		// TODO Auto-generated constructor stub
		this.degree = degree;
	}
	
	public void describe(){
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMINIG:
		default:
			System.out.println("maybe too hot.");
			break;
		}
	}
	
	public static void main(String[] args) {
		Burrito 
			plain = new Burrito(Spiciness.NOT),
			greenChile = new Burrito(Spiciness.MEDIUM),
			jalapeno = new Burrito(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
			
				
	}
}
