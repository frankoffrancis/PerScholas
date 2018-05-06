package CoreJava.utils;

public class OracleQueries {
	
	public static final String GETSTUDENTBYGMAIL = "Select * from student "
			+ "where email = ?"; 

	public static final String GETALLINSTRUCTOR = "Select * from instructor";
	
	public static final String GETINSTRUCTORBYGMAIL = "Select * from instructor "
			+ "where email = ?";
	
	public static final String GETALLCOURSES = "select * from course"; 
	
	public static final String GETCOURSESBYINSTRUCTORID = "select distinct COURSE.COURSE_ID, COURSE.COURSE_NAME, COURSE.MINIMUN_GPA from  course "
			+ " join teaching on course.course_id = teaching.course_id "
			+ "where teaching.instructor_id = ?";
	
	public static final String REGISTERSTUDENTTOCOURSE = "insert into attending "
			+ " (course_id, student_id) "
			+ "values (?,?)";
	public static final String GETSTUDENTCOURSE = "select course.course_id, course.course_name, instructor.full_name, instructor.email "
			+ "from attending inner join course on  attending.course_id = course.course_id "
			+ "inner join teaching on course.course_id = teaching.course_id "
			+ "inner join instructor on teaching.instructor_id = instructor.instructor_id "
			+ "where attending.student_id = ? ";
	
	public static final String ASSIGNTEACHERTOCOURSE  = "INSERT into teaching (course_id, instructor_id) "
			+ "values(?,?)"; 
	
	public static final String GETTEACHER = "select * from teaching "
			+ "inner join teaching on instructor.instructor_id = teaching.instructor_id "
			+ "inner join course on teaching.course_id = course.course_id";
	
}
