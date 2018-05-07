package CoreJava.utils;

public class OracleQueries {
	
	public static final String GETSTUDENTBYGMAIL = "Select * from student "
			+ "where email = ?"; 

	public static final String GETALLINSTRUCTOR = "Select * from instructor ";
	
	public static final String GETINSTRUCTORBYGMAIL = "Select * from instructor "
			+ "where email = ?";
	
	public static final String GETALLCOURSES = "select * from course"; 
	
	public static final String GETCOURSESBYINSTRUCTORID = "select distinct COURSE.COURSE_ID, COURSE.COURSE_NAME, COURSE.MINIMUN_GPA FROM COURSE  \r\n" + 
			"         join teaching on course.course_id = teaching.course_id \r\n" + 
			"			   where teaching.instructor_id =?";
	
	public static final String REGISTERSTUDENTTOCOURSE = "insert into attending "
			+ " (course_id, student_id) "
			+ "values (?,?)";
	public static final String GETSTUDENTCOURSE = "Select distinct course.course_name, instructor.full_name, instructor.email " + 
			"      from course inner join attending on attending.course_id = COURSE.course_id " + 
			"      inner join teaching on teaching.COURSE_ID = attending.COURSE_ID " + 
			"      inner JOIN INSTRUCTOR on teaching.INSTRUCTOR_ID = INSTRUCTOR.INSTRUCTOR_ID " + 
			"      inner join student on student.STUDENT_ID = attending.STUDENT_ID " + 
			"      where attending.STUDENT_ID=?";
	
	public static final String ASSIGNTEACHERTOCOURSE  = "INSERT into teaching (course_id, instructor_id) "
			+ "values(?,?)"; 
	
	public static final String GETTEACHER = "select course.course_name, course.minimun_gpa , instructor.full_name , instructor.email from instructor "
			+ "inner join teaching on instructor.instructor_id = teaching.instructor_id "
			+ "inner join course on teaching.course_id = course.course_id "
			;
	
}
