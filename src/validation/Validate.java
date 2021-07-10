package validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.core.app.Department;
import com.core.app.Employees;

import EmployeeHandler.EmployeeHandler;
import  validation.*;
//list=(e1,e2,e3)

public class Validate {
	public static int validateId(int id,ArrayList<Integer> listId) throws EmployeeHandler {
		for(Integer temp : listId){
			if(temp==id){
				throw new EmployeeHandler("Id is already present");
			}
		}
		return id;
	}
	//hr->HR->HR
	public static Department validateDepartment(String depart) {
	  return Department.valueOf(depart.toUpperCase());
		
	}
}
