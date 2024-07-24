package lesson8;

import java.util.Arrays;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = Days.class;
		System.err.println("Name: "+cl.getName());
		System.err.println("PArent: "+cl.getSuperclass());
		System.err.println("Constr: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
	
		// Days.Monday.name();
		// Days.Monday.ordinal();
		Days	d = Days.Monday;
		
		
		if (d == Days.Monday) {
			// kdksdjkjsld
		}
		
		Class	et = EnumTest.class;
		
		System.err.println("MEthods: "+Arrays.toString(et.getDeclaredMethods()));
		
		switch (d/*.ordinal()*/) {
			case Monday/*.ordinal()*/:
				break;
			case Tuesday/*.ordinal()*/:
				break;
			case Wednesday/*.ordinal()*/:
				break;
			default:
				throw new UnsupportedOperationException("Enum item ["+d+"] is not supported yet");
		}
	}

}

/* final */ enum Days /*extends java.lang.Enum*/ {
	Monday("Понедельник"), // = new Days("Monday",0)
	Tuesday("Вториник"), // = new Days("Tuesday",1)
	Wednesday("Среда"); // = new Days("Wednesday",2)
	/* Days(String, int) {} */
	
	private final String russian;
	private Days(final String russian) {
		this.russian = russian;
	}
	
	public String getRussianName() {
		return russian;
	}
}
