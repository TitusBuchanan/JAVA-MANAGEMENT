package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;


    //Constructor creating new Student objects by initializing values
    public Student(int id, String name, int grade ){
        this.feespaid = 0;
        this.feestotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }



}
