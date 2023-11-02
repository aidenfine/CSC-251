package chapter10.encapsulation;

public class Student {
    private String name;
    private int age;

    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
