
public class Student3 {

	void goToSchool(int id ,String name)
	{
		System.out.println(id+"   "+name);
		
	}
	public static void main(String[] args) {
		Student3 a = new Student3();
		a.goToSchool(1, "APSAR");
		
		//Student3 p = new Student3();
		a.goToSchool(2, "ANZAR");
		
		//Student3 m = new Student3();
		a.goToSchool(3, "ASHRAF");
	}
}
