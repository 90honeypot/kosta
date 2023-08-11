package P0807;

// ------ ex1 --------
class Person {
    String name;
    String num;
    String dept;

    public void printInfo() {
        System.out.printf("name: %s / num: %s / dept: %s\n", name, num, dept);
    }
}

class Student extends Person {
    String[] courses = new String[10];

    @Override
    public void printInfo() {
        System.out.printf("name: %s / num: %s / dept: %s / courses: %s\n", name, num, dept, courses[0]);
    }
}

class Employee extends Person {
    String job;

    @Override
    public void printInfo() {
        System.out.printf("name: %s / num: %s / dept: %s / job: %s\n", name, num, dept, job);
    }
}

class Professor extends Person {
    String[] courses = new String[10];

    @Override
    public void printInfo() {
        System.out.printf("name: %s / num: %s / dept: %s / courses: %s\n", name, num, dept, courses[0]);
    }
}

// ------ ex2 --------
class GrandParent {
    String name;

    public GrandParent() {
        name = "GrandParent";
        System.out.println("GrandParent 생성자");
    }

    public void method1() {
        System.out.println(" name: " + name);
    }
}

class Parent extends GrandParent {
    int age;

    public Parent() {
        name = "Parent";
        age = 23;
        System.out.println("Parent 생성자");
    }
    @Override
    public void method1() {
        System.out.println(" name: " + name + " / age: " + age);
    }
}

class Child extends Parent {
    String hobby;

    public Child() {
        name = "Child";
        age = 12;
        hobby = "공놀이";
        System.out.println("Child 생성자");
    }

    @Override
    public void method1() {
        System.out.println(" name: " + name + " / age: " + age + " / hobby: " + hobby);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        // ------ ex1 --------
        {
            Person p1 = new Person();
            p1.num = "1";
            p1.name = "person";
            p1.dept = "COM";

            Student s1 = new Student();
            s1.num = "2";
            s1.name = "student";
            s1.dept = "COM2";
            s1.courses[0] = "PROG";

            Employee e1 = new Employee();
            e1.num = "3";
            e1.name = "employee";
            e1.dept = "COM3";
            e1.job = "KKK";

            Professor pr1 = new Professor();
            pr1.num = "4";
            pr1.name = "professor";
            pr1.dept = "COM4";
            pr1.courses[0] = "PROG";

            // System.out.printf("%s %s %s\n", p1.num, p1.name, p1.dept);
            p1.printInfo();
            // System.out.printf("%s %s %s %s\n", s1.num, s1.name, s1.dept, s1.courses[0]);
            s1.printInfo();
            // System.out.printf("%s %s %s %s\n", e1.num, e1.name, e1.dept, e1.job);
            e1.printInfo();
            // System.out.printf("%s %s %s %s\n", pr1.num, pr1.name, pr1.dept,
            // pr1.courses[0]);
            pr1.printInfo();

        }

        // ------ ex2 --------
        {
            GrandParent gp = new GrandParent();
            gp.method1();
            Parent p = new Parent();
            p.method1();
            Child c = new Child();
            c.method1();
            
        }
    }
}
