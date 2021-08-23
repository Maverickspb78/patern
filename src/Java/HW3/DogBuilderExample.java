package Java.HW3;

public class DogBuilderExample {
    private Dog dog = new Dog();

    public DogBuilderExample name(String name) {
        dog.setName(name);
        return this;
    }

    public DogBuilderExample color(String color) {
        dog.setColor(color);
        return this;
    }

    public DogBuilderExample age(int age) {
        dog.setAge(age);
        return this;
    }

    public Dog build() {
        return dog;
    }
}
