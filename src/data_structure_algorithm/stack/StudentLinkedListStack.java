package data_structure_algorithm.stack;

public class StudentLinkedListStack implements Stack<Student> {

    StackNode root;
    private int count;

    static class StackNode {
        Student x;
        StackNode next;

        StackNode(Student data) {
            x = data;
        }
    }

    @Override
    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean push(Student x) {
        ++count;
        StackNode newNode = new StackNode(x);
        if (root == null) {
            root = newNode;
        }
        StackNode temp = root;
        root = newNode;
        newNode.next = temp;
        System.out.println("Student " + x.getName() + " pushed to stack!");
        return true;
    }

    @Override
    public Student pop() {
        Student popped = new Student();
        if (root == null) {
            System.out.println("Student stack is empty.");
        } else {
            popped = root.x;
            root = root.next;
            count--;
        }

        return popped;
    }

    @Override
    public Student peek() {
        if (root == null) {
            System.out.println("Student stack is empty.");
            return new Student();
        }
        return root.x;
    }

    @Override
    public int getLenght() {
        return count;
    }

}
