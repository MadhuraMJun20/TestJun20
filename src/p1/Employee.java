package p1;

/*Assignment : 38 
Employee class having attribute -> empid, empname, empsalary.
A) Use comparable to sort all employees based on empid.
----------------------------------------------------------------------
B) Use comparator to sort all employees based on empid.
C) Use comparator to sort all employees based on empname.
D) Use comparator to sort all employees based on salary.*/
public class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	double empSalary;
	
	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName= empName;
		this.empSalary= empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.empId > o.empId)
			return 1;
		else if (this.empId < o.empId)
			return -1;
		else
			return 0;
	}
	
	public String toString() {
		return empId+ " : " +empName+ " : " +empSalary;
		
	}
}
