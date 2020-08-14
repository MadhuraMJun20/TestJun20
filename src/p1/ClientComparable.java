package p1;

import java.util.ArrayList;
import java.util.Collections;

//A) Use comparable to sort all employees based on empid.
public class ClientComparable {
	public static void main(String[] args) {
		Employee e1 = new Employee(109, "Madhura", 150000);
		Employee e2 = new Employee(801, "Mayuri", 95000);
		Employee e3 = new Employee(151, "Prasad", 120000);
		Employee e4 = new Employee(200, "Piyusha", 90000);

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		System.out.println("Employee List before sorting : \n" + al);

		Collections.sort(al);
		System.out.println("Employee list after sorting : \n" + al);
	}
}
