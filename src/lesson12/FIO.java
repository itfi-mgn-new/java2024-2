package lesson12;

import java.io.Serializable;

public class FIO implements Serializable {
	private static final long serialVersionUID = -6806633386814588948L;
	
	String	family = "ivanov";
	String	name = "ivan";
	String	patroname = "ivanovich";
	int		age = 21;
transient Object x = new Object();

	public FIO(String family, String name, String patroname, int age) {
		this.family = family;
		this.name = name;
		this.patroname = patroname;
		this.age = age;
		System.err.println("djskjdhfjfh");
	}

	@Override
	public String toString() {
		return "FIO [family=" + family + ", name=" + name + ", patroname=" + patroname + ", age=" + age + "]";
	}
}
