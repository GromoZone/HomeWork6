public class Dog extends Animal {

    public Dog() {
        String name;
    }

    public Dog(String name) {
        this.name = name;
    }

    public void run(int run) {
        System.out.println("Пес " + name + " пробежал " + run + " метров");
    }

    public void swim(int swim) {
        System.out.println("Пес " + name + " проплыл " + swim + " метров");
    }
}