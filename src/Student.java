public class Student {
    String name;
    String sername;
    String fakulty;
    int course;
    int grupp;

    public Student(String name, String sername, String fakulty, int course, int grupp) {
        this.name = name;
        this.sername = sername;
        this.fakulty = fakulty;
        this.grupp = grupp;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }
}
