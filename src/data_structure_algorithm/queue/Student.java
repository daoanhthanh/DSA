package data_structure_algorithm.queue;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dob;
    private String nationality;

    public Student(){}

    public Student(String name, LocalDate dob, String nationality) {
        this.name = name;
        this.dob = dob;
        this.nationality = nationality;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", dob=" + dob + ", nationality=" + nationality + "]";
    }
    

}
