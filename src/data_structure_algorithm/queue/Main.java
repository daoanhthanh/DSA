package data_structure_algorithm.queue;

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
        Queue<Student> queue = new StudentArrayQueue(10);
        queue.enQueue(stu1);
        queue.enQueue(stu2);
        queue.enQueue(stu3);
        queue.enQueue(stu4);
        queue.enQueue(stu5);
        queue.enQueue(stu6);
        queue.enQueue(stu7);
        queue.printAllElements();
        
    }
}
