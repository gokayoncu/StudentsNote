public class Main {
    public static void main(String[] args) {
        Teachers t1 = new Teachers("Ahmet", "000", "TRH");
        Teachers t2 = new Teachers("Mehmet", "111", "FZK");
        Teachers t3=new Teachers("Veli","222","BİO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biologi=new Course("Biyoloji","103","BİO");
        biologi.addTeacher(t3);

        Students s1=new Students("Sen","123","4",tarih,fizik,biologi);
        s1.addBulkExamNote(80,50,60);
        s1.isPass();
        System.out.println();
        Students s2=new Students("Ben","231","4",tarih,fizik,biologi);
        s2.addBulkExamNote(50,60,70);
        s2.isPass();
        System.out.println();
        Students s3=new Students("Onlar","321","4",tarih,fizik,biologi);
        s3.addBulkExamNote(70,55,69);
        s3.isPass();
    }
}