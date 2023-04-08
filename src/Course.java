public class Course {
    Teachers tname;
    String name;
    String code;
    String prefix;
    int notes;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int notes = 0;
    }

    void addTeacher(Teachers teachers) {
        if (teachers.branch.equals(this.prefix)) {
            this.tname = teachers;
        }else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }

    }

    void printTeacher() {
        this.tname.print();
    }


}
