package p1;

import java.util.ArrayList;
import java.util.Collections;

public class ClientComparator {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(109, "Madhura", 150000));
		empList.add(new Employee(801, "Mayuri", 95000));
		empList.add(new Employee(151, "Prasad", 120000));
		empList.add(new Employee(200, "Piyusha", 90000));

		Collections.sort(empList, new CompareEmpId());
		System.out.println("Sorted Employee list : According to Employee ID \n" + empList + "\n");
		Collections.sort(empList, new CompareEmpName());
		System.out.println("Sorted Employee list : According to Employee Name \n" + empList + "\n");
		Collections.sort(empList, new CompareEmpSalary());
		System.out.println("Sorted Employee list : According to Employee Salary \n" + empList);
	}

}
