
public class Animal {

	private String Name;
	private int Age;
	
	// Constructor
	public Animal(String name, int age) {
		this.Name = name;
		this.Age = age;
	}
	
	// Getters / Setters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	// Methods
	public String ToString() {
		return "This animals name is: " + Name + " and he is : " + Age + " years old";
	}
	
	
	
}
