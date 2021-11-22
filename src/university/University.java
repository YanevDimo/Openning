package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public String registerStudent(Student student) {
        if (this.capacity > this.students.size()) {
            if (students.contains(student)) {
                return "Student is already in the Exam14April2021.university";
            } else {
                students.add(student);
                return String.format("Added student %s %s", student.getFirstName(), student.getLastName());
            }
        }
        return "No seats in the Exam14April2021.university";
    }

    public String dismissStudent(Student student) {
        if (this.students.contains(student)) {
            this.students.remove(student);
            return "Removed student " + student.getFirstName() + " " + student.getLastName();
        }
        return "Student not found";
        //  String removeStudent;
        //
        //        if (students.contains(student)) {
        //            students.removeIf(s -> s.equals(student));
        //            removeStudent = "Removed student " + student.getFirstName() + " " + student.getLastName();
        //        } else {
        //            removeStudent = "Student not found";
        //        }
        //
        //
        //        return removeStudent;
        //    }
    }

    public Student getStudent(String firstName, String lastName){
        Student student = null;
        for (Student s : this.students) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)){
                student = s;
            }
        }
        return student;
    }

    public String getStatistics() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < this.students.size(); i++) {
//            if (i == students.size() - 1) {
//                stringBuilder.append(String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s"
//                        , students.get(i).getFirstName(),
//                        students.get(i).getLastName(), students.get(i).getBestSubject()));
//            } else {
//                stringBuilder.append(String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s"
//                        , students.get(i).getFirstName(),
//                        students.get(i).getLastName(), students.get(i).getBestSubject()));
//                stringBuilder.append(System.lineSeparator());
//            }
//        }
//        return stringBuilder.toString();

            StringBuilder builder = new StringBuilder();
                for (Student student : students) {
                    builder.append("==Student: First Name = " + student.getFirstName()
                            + ", Last Name = " + student.getLastName()
                            + ", Best Subject = " + student.getBestSubject());
                    builder.append(System.lineSeparator());
                }

                    return builder.toString();
    }

}
