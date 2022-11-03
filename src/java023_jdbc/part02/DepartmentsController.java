package java023_jdbc.part02;

import java.util.List;

public class DepartmentsController {
	public DepartmentsController() {

	}

	public List<DepartmentDTO> departmentsAllprocess() {
		DepartmentDAO dao = DepartmentDAO.getInstance();
		return dao.listDepartments();
	}
	
	public List<DepartmentDTO> departmentsSearchProcess(String data){
		DepartmentDAO dao = DepartmentDAO.getInstance();
		return dao.searchDepartment(data);
	}
}
