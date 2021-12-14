package nested_class;

import java.time.LocalDate;
import java.util.Comparator;

public class Spartan {

    private int id;
    private String name;
    private String course;
    private LocalDate startDate;

    public Spartan(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public Spartan(int id, String name, String course, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", startDate=" + startDate +
                '}';
    }

    public static class SpartanComparator implements Comparator<Spartan> {

        @Override
        public int compare(Spartan o1, Spartan o2) {
            return o1.getName().compareTo(o2.getName());
        }

    }

}
