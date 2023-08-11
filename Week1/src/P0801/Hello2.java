package P0801;

public class Hello2 {

    public static void ExContinue() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // ExContinue();

        Person p1 = new Person();
        p1.name = "sangwook";
        p1.age = 33;

        System.out.println(p1.name + " " + p1.age);

    }

}

class Person {
    String name;
    int age;
}
