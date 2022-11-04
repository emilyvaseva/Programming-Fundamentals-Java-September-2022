package P06ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents=Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int studentCount = 1; studentCount <=countStudents ; studentCount++) {
            String data = scanner.nextLine();
            String [] dataParts=data.split(" ");
            String firstName = dataParts[0];
            String lastName=dataParts[1];
            double grade= Double.parseDouble(dataParts[2]);

            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student:studentList) {
            System.out.println(student);
        }
    }

    public static class Student{
        private String name;
        private String lastName;
        private double grade;

        public Student(String name, String lastName, double grade) {
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.name,this.lastName,this.grade);
        }
    }

}
