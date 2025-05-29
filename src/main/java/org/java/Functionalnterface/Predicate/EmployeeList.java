package org.java.Functionalnterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeList {
    String name;
    double salary;

    EmployeeList(String name,double salary){
        this.name = name;
        this.salary=salary;
    }
}
class Test
{
    public static void main(String[] args) {
        ArrayList<EmployeeList> l = new ArrayList<EmployeeList>();
            l.add(new EmployeeList("Ash",1000.0));
            l.add(new EmployeeList("Anushka",2000.0));
            l.add(new EmployeeList("Arjun",3000.0));
            l.add(new EmployeeList("Awees",4000.0));
            l.add(new EmployeeList("Shiva",5000.0));
            l.add(new EmployeeList("Adarsh",7000.0));

        Predicate<EmployeeList> p = e -> e.salary > 2000;
        for(EmployeeList e1 : l){
            if(p.test(e1)){
                System.out.println(e1.name+":"+e1.salary);
            }
        }
    }

}
