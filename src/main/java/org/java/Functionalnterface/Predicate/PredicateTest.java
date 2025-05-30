package org.java.Functionalnterface.Predicate;

import java.util.function.Predicate;
// Predicate<T> ---> boolean
class Employee{

    String name;
    int salary;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

}
public class PredicateTest {
    public static void main(String[] args) {
        // Predicate<T>: checks if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10)); // Output: true

        // Check employee salary and age condition
        Employee emp = new Employee();
        emp.setSalary(200000);
        emp.setAge(19);
        emp.setName("Ash");

        Predicate<Employee> p1 = e -> e.salary>10000 && e.age > 18;
        System.out.println("Result : "+p1.test(emp));

        // Checking if name characters are more than 5 or not
        Predicate<Employee> p2 = e -> e.name.length() > 5;
        System.out.println("checking if name characters are more than 5 or not : " + p2.test(emp));
    }
}
