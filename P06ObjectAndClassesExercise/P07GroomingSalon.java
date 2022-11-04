package P06ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.List;

public class P07GroomingSalon {
    public static void main(String[] args) {
        // Initialize the repository
        GroomingSalon salon = new GroomingSalon(20);

// Initialize entity
        Pet dog = new Pet("Ellias", 5, "Tim");

// Print Pet
        System.out.println(dog); // Ellias 5 - (Tim)

// Add Pet
        salon.add(dog);

// Remove Pet
        System.out.println(salon.remove("Ellias")); // true
        System.out.println(salon.remove("Pufa")); // false

        Pet cat = new Pet("Bella", 2, "Mia");
        Pet bunny = new Pet("Zak", 4, "Jon");

        salon.add(cat);
        salon.add(bunny);

// Get Pet
        Pet pet = salon.getPet("Bella", "Mia");
        System.out.println(pet); // Bella 2 - (Mia)
        //System.out.println(university.getStudent("Rihanna", "Fenty"));

// Count
        System.out.println(salon.getCount()); // 2

// Get Statistics
        System.out.println(salon.getStatistics());
// The grooming salon has the following clients:
//Bella Mia
//Zak Jon

    }

    public static class Pet {
        private String name;
        private int age;
        private String owner;

        public Pet(String name, int age, String owner) {
            this.name = name;
            this.age = age;
            this.owner = owner;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        @Override
        public String toString() {
            return String.format("%s %d - (%s)", name, age, owner);//     "{name} {age} - ({owner})"


        }

    }


    public static class GroomingSalon {
        private List<Pet> data;
        private int capacity;

        public GroomingSalon(int capacity) {
            this.capacity = capacity;
            this.data = new ArrayList<>();
        }

        public void add(Pet pet) {
            if (this.data.size() < this.capacity) {
                this.data.add(pet);
            }
        }

        public int getCount() {
            return this.data.size();
        }
        public boolean remove(String name) {
            int index = findpetIndex(name);

            if (index != -1) {
                data.remove(index);
                return true;
            }

            return false;
        }

        public Pet getPet(String name, String owner) {
            return this.data.stream()
                    .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                    .findFirst().orElse(null);
        }

        private int findpetIndex(String name) {
            for (int i = 0; i < this.data.size(); i++) {
                if (this.data.get(i).getName().equals(name)) {
                    return i;
                }
            }
            return -1;
        }

        public String getStatistics() {
            StringBuilder builder = new StringBuilder("The grooming salon has the following clients:"  + System.lineSeparator());

            for (Pet pet : data) {
                builder.append(pet.getName().toString());
                builder.append(" ");
                builder.append(pet.getOwner().toString());
                builder.append(System.lineSeparator());
            }

            return builder.toString().trim();
        }
    }
}
