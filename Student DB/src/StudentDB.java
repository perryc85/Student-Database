
public class StudentDB {
	
	private static int id = 100;
	private String name;
	private String email;
	private String SSN;
	private String userID;
	private String courses = "";
	private static final double costOfCourse = 3000;
	private double balance = 0.0;
	
	public StudentDB(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		id++;
		setEmail();
		setUserId();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + id + "@pace.edu";
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * ((max-min)));
		random = random + min;
		userID = id + "" + random + SSN.substring(5);
	}
	
	public void enroll(String course) {
		this.courses = courses + " " +course;
		balance += costOfCourse;
	}
	
	public void pay(double amount) {
		balance -= amount;
		System.out.println("Your new balance is: $" + balance + " following your payment.");
	}
	
	public void checkBalance() {
		System.out.println("Your current tuition bill for the semester is: " + balance);
	}
	
	public void showCourses() {
		System.out.println("You are currently enrolled in: " + courses);
	}
	
	public String toString() {
		return "[Name: " + name + "]\n" + "[Email: " + email + "]\n" + "[User ID: " + userID + "]\n" + 
			   "[Courses:" + courses + "]\n" + "[Balance: " + balance + "]\n";
	}
	
}

