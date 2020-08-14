package p1;

import java.util.Comparator;

public class CompareEmpSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.empSalary > o2.empSalary)
			return 1;
		else if (o1.empSalary < o2.empSalary)
			return -1;
		else
			return 0;
	}

}
