public class Students {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Students(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if ((note1 >= 0) && (note1 <= 100)) {
            this.c1.notes = note1;
        }
        if ((note2 >= 0) && (note2 <= 100)) {
            this.c2.notes = note2;
        }
        if ((note3 >= 0) && (note3 <= 100)) {
            this.c3.notes = note3;
        }
    }
    void isPass(){
        this.avarage=(this.c1.notes+this.c2.notes+this.c3.notes)/3.0;
        if (this.avarage>55){
            System.out.println("Sınıfı Geçti.");
            this.isPass=true;
        }else{
            System.out.println("Sınıfta Kaldı.");
            this.isPass=false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.notes+"Notu\t:"+ c1.notes);
        System.out.println(c2.notes+"Notu\t:"+ c2.notes);
        System.out.println(c3.notes+"Notu\t:"+ c3.notes);
        System.out.println("Ortalaması :"+ this.avarage);
    }

}
