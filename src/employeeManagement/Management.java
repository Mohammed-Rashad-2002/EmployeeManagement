package employeeManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Management {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean b = true;
		List<EmployeeDetails> employee = new ArrayList();
//		List<EmployeeDetails> employeeremove=new ArrayList<EmployeeDetails>();
		while (b) {
			System.out.println("Press 1 to Add Employee");
			System.out.println("Press 2 for show Employee");
			System.out.println("Press 3 for delete Employee");
			System.out.println("Press 4 for exit");
			int no=sc.nextInt();
			switch (no) {
			case 1: {
				System.out.println("Enter Employee Name:");
				String eName = sc.next();
				System.out.println("Enter Employee Id: ");
				int eId = sc.nextInt();
				System.out.println("Enter Branch : ");
				String branch = sc.next();
				System.out.println("Enter salary : ");
				int salary = sc.nextInt();
				employee.add(new EmployeeDetails(eName, eId, branch, salary));
				break;
			}
			case 2:{
				if (employee.size()>0) {
					for (EmployeeDetails employeeDetails : employee) {
						System.out.println(employee);
					}
				}else {
					System.out.println("No data found");
				}
				
				break;
			}
			case 3:{
				System.out.println("Enter Employee id");
				int id=sc.nextInt();
				if (employee.size()>0) {
					
					for (int i = 0; i < employee.size(); i++) {
						if (employee.get(i).getEmpId()==id) {
							employee.remove(i);
						}
					}
					System.out.println("Successfully Removed");
				} else {
					System.out.println("No such data found\n add an employee");
				}
				
				break;
			}
			case 4:{
				b=false;
				break;
			}
			default:
				System.out.println("Enter Valid Number");
				break;
			}
		}
	}
}
