package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pets {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String type;
	private String name;
	private int age;
	private String color;
	private boolean hashair;
	
	public Pets() {
		super();
	}
	
	public Pets(String type, String name, int age, String color, boolean hashair) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.color = color;
		this.hashair = hashair;
	}
	
	public Pets(int id, String type, String name, int age, String color, boolean hashair) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.age = age;
		this.color = color;
		this.hashair = hashair;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHashair() {
		return hashair;
	}

	public void setHashair(boolean hashair) {
		this.hashair = hashair;
	}
	
	@Override
	public String toString() {
		return "Pets [id = " + id + ", type = " + type + ", name = " + name + ", age = " + age + ", color = " + color + ", hasHair = " + hashair + "]";
	}
}
