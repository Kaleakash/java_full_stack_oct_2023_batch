package abc;

public class Manager extends Employee{
private int numberOfEmp;

void readMgr() {
	System.out.println("Enter number of employee working under him");
	numberOfEmp = sc.nextInt();
}
void disMgr() {
	System.out.println("Number of employee is "+numberOfEmp);
}
}
