package org.dsa;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorVsComparable {
    public static void main(String[] args) {
        Employe1[] emp = new Employe1[5];
        emp[0] = new Employe1("rak",29,1);
        emp[1] = new Employe1("rak1",22,3);
        emp[2] = new Employe1("rak2",21,4);
        emp[3] = new Employe1("aak3",19,4);
        emp[4] = new Employe1("rak4",25,0);
        Arrays.sort(emp,Employe1.NameComparator);
        Arrays.sort(emp,Employe1.SalaryComparator);
        System.out.println(Arrays.toString(emp));

    }
}
 class Employe1 implements Comparable<Employe1>{
    String name;
    Integer age;
     Integer salary;
    Employe1(String nm, int age, int salary){
        this.name=nm;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employe1 o) {
        return this.name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }
    @Override
     public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Name : ").append(this.name).append("|  ");
        str.append("Age : ").append(this.age).append("|  ");
        str.append("Salary : ").append(this.salary).append("\r\n");
        return str.toString();
    }

    public static Comparator<Employe1> NameComparator=new Comparator<Employe1>() {
        @Override
        public int compare(Employe1 o1, Employe1 o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
     public static Comparator<Employe1> SalaryComparator=new Comparator<Employe1>() {
         @Override
         public int compare(Employe1 o1, Employe1 o2) {
             return o1.getSalary().compareTo(o2.getSalary());
         }
     };
}

