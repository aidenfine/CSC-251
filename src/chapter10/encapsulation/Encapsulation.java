package chapter10.encapsulation;

public class Encapsulation {
    public static void main(String[] args){
        Student s = new Student();

        s.setName("john");
        s.setAge(2);

        System.out.println(s.getName() + " " + s.getAge());
    }
}
