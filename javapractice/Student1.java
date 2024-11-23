/*The following program shows the use of this() to avoid the name-space collision.*/
class Student {
    int rollno;
    String name, course;
    float fee;

    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student(int rollno, String name, String course, float fee) { 
        this(rollno, name, course);
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

class Student1 {
    public static void main(String args[]) {
     
        Student s1 = new Student(110, "Vishwa", "c++");
        Student s2 = new Student(111, "Ravana", "java", 4400.0f);

        s1.display();
        s2.display();
    }
}
