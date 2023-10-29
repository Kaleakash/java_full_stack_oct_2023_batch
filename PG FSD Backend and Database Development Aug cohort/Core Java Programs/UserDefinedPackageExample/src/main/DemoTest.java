package main;
import bean.Employee;
import college.Attendance;
//import school.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		
		Attendance att1 = new Attendance();
		att1.display();
		school.Attendance att2 = new school.Attendance();
		att2.display();
		Employee emp = new Employee();
		emp.disEmp();
	}

}
