package CoreJava.DAO;

import java.util.List;

import CoreJava.Models.Teaching;
import CoreJava.systemsInterfaces.TeachingDAOI;

public class TeachingDAO  implements TeachingDAOI{

	@Override
	public int assignInstructorToCourse (int course_id, int instructor_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Teaching> getInstructorsCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
