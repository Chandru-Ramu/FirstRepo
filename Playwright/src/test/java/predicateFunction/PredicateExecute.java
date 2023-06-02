package predicateFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExecute {

	public static void main(String[] args) {
		
		List<StudentsRecord> studentsList = new ArrayList<StudentsRecord>();
		
		StudentsRecord record1 = new StudentsRecord();
		record1.setName("Boopathy");
		record1.setRollNo(1001);
		record1.setPassedOutYear(2018);
		record1.setTutor("Duraisingam");
		
		StudentsRecord record2 = new StudentsRecord();
		record2.setName("Chandrasekar");
		record2.setRollNo(1002);
		record2.setPassedOutYear(2018);
		record2.setTutor("Saravanan");
		
		StudentsRecord record3 = new StudentsRecord();
		record3.setName("Gantharaj");
		record3.setRollNo(1003);
		record3.setPassedOutYear(2020);
		record3.setTutor("Daniel");
		
		StudentsRecord record4 = new StudentsRecord();
		record4.setName("Gowtham");
		record4.setRollNo(1004);
		record4.setPassedOutYear(2019);
		record4.setTutor("Margrate");
		
		studentsList.add(record1);
		studentsList.add(record2);
		studentsList.add(record3);
		studentsList.add(record4);
		
		//getStudentRecords(studentsList, s -> s.getName().equalsIgnoreCase("Chandrasekar"));
		
		//getStudentRecords(studentsList, s -> s.getPassedOutYear()==2018);
		getStudentRecords(studentsList, s-> s.getTutor().startsWith("D"));

	}
	
	private static void getStudentRecords(List<StudentsRecord> studentsList, Predicate<StudentsRecord> studentPredicate ) {
		
		for (StudentsRecord studentsRecord : studentsList) {
			if (studentPredicate.test(studentsRecord)) {
				
				System.out.println(studentsRecord.getName());
				System.out.println(studentsRecord.getRollNo());
			}
		}
		
	}
	
	

}
