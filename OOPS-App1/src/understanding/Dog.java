package understanding;

/* such entity class is known as Java Bean Class */
public class Dog {

	private String name = "dfvrf";
	private int age = 0;
	//-----
	/*
	 *  Constructor is a Special method
	 *  it has same name as class name
	 *  it cannot return values 
	 *  it use to set the default values 
	 *  
	 *  note : --- self learning
	 * 
	 * */

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	/* constructor with arguments is optional 
	 * and cannot be created by compiler automatically*/
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}





	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public String getName()
	{
		// --- add some secure code
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	
	
}
