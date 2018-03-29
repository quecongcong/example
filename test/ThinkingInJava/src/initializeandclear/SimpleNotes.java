package initializeandclear;

/**
 * Title: SimpleNotes.class<br>
 * Description: <br>
 * Copyright (c) 人和网版权所有 2017    <br>
 * Create DateTime: 2018年3月7日 下午5:54:20 <br>
 *
 * @author gaoxing
 */
public class SimpleNotes {
	Notes notes;
	public SimpleNotes(Notes notes) {
		this.notes = notes;
	}
	
	public void descripe(){
		System.out.print("这是一张:");
		switch (notes) {
		case ONE:
			System.out.println("1元纸币");
			break;
		case FIVE:
			System.out.println("5元纸币");
			break;
		case TEN:
			System.out.println("10元纸币");
			break;
		case TWENTY:
			System.out.println("20元纸币");
			break;
		case FIFTY:
			System.out.println("50元纸币");
			break;
		case HUNDRED:
			System.out.println("100元纸币");
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		SimpleNotes simpleNotes1 = new SimpleNotes(Notes.ONE);
		SimpleNotes simpleNotes5 = new SimpleNotes(Notes.FIVE);
		SimpleNotes simpleNotes10 = new SimpleNotes(Notes.TEN);
		SimpleNotes simpleNotes20 = new SimpleNotes(Notes.TWENTY);
		SimpleNotes simpleNotes50 = new SimpleNotes(Notes.FIFTY);
		SimpleNotes simpleNotes100 = new SimpleNotes(Notes.HUNDRED);
		simpleNotes1.descripe();
		simpleNotes5.descripe();
		simpleNotes10.descripe();
		simpleNotes20.descripe();
		simpleNotes50.descripe();
		simpleNotes100.descripe();
		
		
		System.out.println(new Integer(128) == 128);
		System.out.println(new Integer(10000).equals(10000));
		System.out.println(new String("str") == "str");
	}
}
