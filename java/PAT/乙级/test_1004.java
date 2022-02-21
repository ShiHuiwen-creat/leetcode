package PAT.乙级;

import java.util.Scanner;

public class test_1004 {
    public static class Student{
        String name;
        String studentId;
        int score;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min = 101;
        int max = -1;
        String name_min = "";
        String name_max = "";
        String student_min = "";
        String student_max = "";
        for(int i = 0;i < n;i++){
            Student student = new Student();
            student.name = input.next();
            student.studentId = input.next();
            student.score = input.nextInt();
            if(student.score > max){
                name_max = student.name;
                student_max = student.studentId;
                max = student.score;
            }
            if(student.score < min){
                name_min = student.name;
                student_min = student.studentId;
                min = student.score;
            }
        }
        System.out.println(name_max+" "+student_max);
        System.out.println(name_min+" "+student_min);

    }
}
