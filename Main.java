import java.util.Objects;
import java.util.Scanner;
class Student{
    private String FIO;
    private int Date;
    private String Address;
    private String Phone;
    private int Course;
    private String Facult;

    Student(String FIO, int Date, String Address, String Phone, int Course, String Facult){
        this.FIO = FIO;
        this.Date = Date;
        this.Address = Address;
        this.Phone = Phone;
        this.Course = Course;
        this.Facult = Facult;
    }

    public String getFIO(){
        return this.FIO;
    }

    public void setFIO(String FIO){
        this.FIO = FIO;
    }

    public String getAddress(){
        return this.Address;
    }

    public void setDate(int Date){
        this.Date = Date;
    }

    public int getDate(){
        return this.Date;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    public String getPhone(){
        return this.Phone;
    }

    public void setCourse(int Course){
        this.Course = Course;
    }

    public String getFacult(){
        return this.Facult;
    }

}
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        students[0] = new Student("Иванов И. И.", 2023, "г. Москва", "+795335356", 1, "1");
        students[1] = new Student("Петров П. П.", 2022, "г. Санкт-Петербург", "+7953545356", 2, "2");
        students[2] = new Student("Сидоров Н. А.", 2021, "г. Москва", "+795335386", 3, "3");

        for (Student student : students) {
            System.out.println(student.getFIO());
        }

        System.out.println("Введите факультет: ");
        String facult = scanner.nextLine();
        for (Student student : students) {
            if (Objects.equals(student.getFacult(), facult))
                System.out.println(student.getFIO());
        }

        System.out.println("Введите год обучения: ");
        int date = scanner.nextInt();
        for (Student student : students) {
            if (student.getDate() > date)
                System.out.println(student.getFIO());
        }
    }
}