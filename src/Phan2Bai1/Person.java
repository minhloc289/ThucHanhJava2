package Phan2Bai1;
import java.util.Scanner;
abstract class Person {
    private String name;
    private int age;
    public Person(){};
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        age = sc.nextInt();
    }
    public abstract void show();
}
