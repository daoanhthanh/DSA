package data_structure_algorithm.queue;

public class StudentArrayQueue implements Queue<Student>{
    private final static int MAXIMUM = 1000;
    private int front, rear, size;
    private int capability;
    private Student[] students;

    public StudentArrayQueue(){
        this(MAXIMUM);
    }

    public StudentArrayQueue(int capability){
        if(capability <= MAXIMUM){
            this.capability = capability;
            students = new Student[this.capability];
        }else{
            throw new IllegalStateException("Maximum capability is 1000 students.");
        }
    }

    @Override
    public boolean isFull(){
        return (students.length == capability);
    }

    @Override
    public boolean isEmpty(){
        return (students.length == 0);
    }

    @Override
    public void enQueue(Student x) {
        if(isFull()){
            // return; // use return keyword in void method to jump out of this
            System.out.println("full");
        }
        //TODO:???? clgt
        rear = (rear+1)%capability;
        students[rear] = x;
        size = size+1;
        System.out.println("Student " + x.getName() + " enqueued to array queue.");
    }

    @Override
    public void deQueue() {
        if(isEmpty()){
            System.out.println("The queue is already empty.");
            // return;
        }
        Student x = students[front];
        front = (front + 1)%capability;
        size = size-1;
        System.out.println("Student " + x.getName() + " dequeued from queue.");
    }

    @Override
    public Student front() {
        if(isEmpty()){
            return new Student();
        }
        return students[front];
    }

    @Override
    public Student rear() {
        if(isEmpty()){
            return new Student();
        }
        return students[rear];
    }

    @Override
    public void printAllElements() {
        for(Student x : students){
            System.out.println(x.toString());
        }        
    }

    
}
