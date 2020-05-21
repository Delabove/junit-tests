import java.util.ArrayList;
import java.util.Collection;

public class Student {

   private String name;
   private long id;
   private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getAverage() {
        if(this.grades.size() == 0){
            return 0;
        }
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }

}
