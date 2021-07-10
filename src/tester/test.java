package tester;

import java.time.LocalDate;
import java.util.*;
import Compartor.*;
import static validation.Validate.*;

import EmployeeHandler.EmployeeHandler;
import com.core.app.Department;
import com.core.app.Employees;

public class test {


	public static void main(String[] args){

		Map<Integer,Employees> empMap = new HashMap<>();
		List<Employees> empList = new ArrayList<>();
		boolean exit = false;
		try(Scanner sc = new Scanner(System.in)){
			while(!exit) {
				try{
				//int id, String name, Department department, LocalDate dob, LocalDate hiredate
				System.out.println("1.Add Employee 100.Exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the id, name , deparment , dob ,hiredate");
					ArrayList<Integer> id = new ArrayList<>(empMap.keySet());
					Employees e = new Employees(validateId(sc.nextInt(), id), sc.next(), validateDepartment(sc.next()), LocalDate.parse(sc.next()), LocalDate.parse(sc.next()));
					empMap.put(e.getId(),e);
					empList.add(e);
					// 1 harshit hr 1998-07-18 2020-01-01    -2
					//2 akash hr 1998-12-01 2020-01-01   -3
					//3 shivendra sales 1998-05-18 2019-01-01    -1
					break;
					case 2:
						ArrayList<Employees> temp = new ArrayList<>(empMap.values());
						System.out.println("Map output");
						temp.forEach(System.out::println);
						System.out.println("List output");
						empList.forEach(System.out::println);
						break;
					case 3:
						Collections.sort(empList);
						break;
					case 4:
						Collections.sort(empList,new SortDate());
						break;

				}

			}catch (EmployeeHandler employeeHandler) {
				employeeHandler.printStackTrace();
				}
			sc.nextLine();

			}

	}
}}
