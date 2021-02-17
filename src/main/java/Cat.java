public class Cat extends Animal{

    public Cat () {
        String name;
    }

    public Cat (String name){
        this.name = name;
    }

    public void run (int run) {
        System.out.println("Кот " + name + " пробежал " + run + " метров");
    }

    public void swim (String swim) {
        System.out.println("Кот " + name + swim);
    }
}
