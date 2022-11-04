package P06ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03OpinionPoll {

    static class Person{
        private String name;
        private int age;

        public Person (String name, int age){
            this.name=name;
            this.age=age;
         }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String data= scanner.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            if (age>30){
                Person person = new Person(name,age);
                personList.add(person);
            }
        }
        for (Person person : personList){
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
