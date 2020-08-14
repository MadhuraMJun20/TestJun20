package p1;

import java.util.Comparator;

public class CompareEmpName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.empName == o2.empName)
			return 0;
		if (o1.empName == null)
			return -1;
		if (o2.empName == null)
			return 1;
		return (o1.empName).compareTo(o2.empName);
	}

}
