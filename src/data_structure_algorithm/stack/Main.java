package data_structure_algorithm.stack;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Đào Anh Thành", LocalDate.of(2000, 2, 29), "Australian" );
        Student stu2 = new Student("Trần Tú Mai", LocalDate.of(1999, 10, 6), "Japanese" );
        Student stu3 = new Student("Trần Thị Min", LocalDate.of(2000, 8, 27), "Vietnamese" );
        Student stu4 = new Student("Trần Diễm Quỳnh", LocalDate.of(2000, 8, 4), "Vietnamese" );
        Student stu5 = new Student("Nguyễn Đăng Trình", LocalDate.of(2000, 4, 2), "Vietnamese" );
        Student stu6 = new Student("Phạm Minh Châu", LocalDate.of(2000, 3, 10), "Bristish" );
        Student stu7 = new Student("Nastasha Romanov", LocalDate.of(2000, 2, 29), "Rusian" );
        Stack<Student> sa = new StudentArrayStack(10);
        // Stack<Student> sa = new StudentLinkedListStack();
        System.out.println("Stack is " + sa.isEmpty() != null?"empty":"not empty");
        sa.push(stu1);
        sa.push(stu2);
        sa.push(stu3);
        sa.push(stu4);
        sa.push(stu5);
        sa.push(stu6);
        sa.push(stu7);
        System.out.println("Stack is " + sa.isEmpty() != null?"empty":"not empty");
        System.out.println(sa.peek().toString());
        System.out.println("**Number of students: " + sa.getLenght());
        sa.pop();
        sa.pop();
        sa.pop();
        sa.pop();
        sa.pop();
        sa.pop();
        System.out.println(sa.peek().toString());
        System.out.println("**Number of students: " + sa.getLenght());


    }
}
