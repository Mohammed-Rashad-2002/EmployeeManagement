package employeeManagement;

public class EmployeeDetails {
	String empName;
	int empId;
	String branch;
	int salary;
	
	public EmployeeDetails(String empName, int empId, String branch, int salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.branch = branch;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empName=" + empName + ", empId=" + empId + ", branch=" + branch + ", salary=" + salary
				+ "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
