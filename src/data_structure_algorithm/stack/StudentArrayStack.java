package data_structure_algorithm.stack;
/**
 * @author Dao Anh Thanh
 * @description
 *  <p>
 *      Store object in an array is good for indexing and searching quicker. But the downside is its capable of extention.
 *  </p>
 */
public class StudentArrayStack implements Stack<Student>{

    private final static int MAXIMUM = 3000;
    private Student[] stu; 
    // private int desiredCapability;
    private int numberOfEntries;
    
    public StudentArrayStack(){
        this(MAXIMUM);
    }

    public StudentArrayStack(int desiredCapability) {
        if (desiredCapability <= MAXIMUM){
            stu = new Student[desiredCapability];
            numberOfEntries = 0;
        }
        else{
            throw new IllegalStateException("Largest number of student in StudentArray allowed is " + MAXIMUM); 
        }

    }

    @Override
    public boolean isEmpty() {
        if (numberOfEntries > 0){
            return false;
        }
        return true;
    }

    @Override
    public boolean push(Student x) {
        if(numberOfEntries > MAXIMUM-1){
            System.err.println("Student stack full");
            return false;
        }
        stu[++numberOfEntries]=x;
        System.out.println(x.getName() + " is pushed to stack successfully!");
        return true;
    }

    
    //TODO: find another way to do delete.
    @Override
    public Student pop() {
        if(numberOfEntries==0){
            System.err.println("Stack student is empty!");
            return null;
        }
        return stu[numberOfEntries--];
    }

    @Override
    public Student peek() {
        return stu[numberOfEntries];
    }

    @Override
    public int getLenght(){
        return numberOfEntries;
    }    

    
    
}
