package week4.databaseex;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "grade")
    private double grade;

    public Student(){ }

    public Student(long id, String name, double grade){
        this.id=id;
        this.name=name;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                "name=" + name + '\'' +
                "grade=" + grade +
                "}";
    }

}
