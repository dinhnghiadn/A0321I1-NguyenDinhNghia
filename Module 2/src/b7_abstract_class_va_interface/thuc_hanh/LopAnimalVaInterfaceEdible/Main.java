package b7_abstract_class_va_interface.thuc_hanh.LopAnimalVaInterfaceEdible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger(); // Kiểu dữ liệu Animal, đối tượng Tiger
        animals[1] = new Chicken(); // Kiểu dữ liệu Animal, đối tượng Chicken
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) { // nếu animal là 1 đối tượng chicken
                Edible edibler = (Chicken) animal; // ép kiểu tường minh về kiểu dữ liệu chicken (con)
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
