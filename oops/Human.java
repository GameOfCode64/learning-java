public class Human {
    private String name;
    private int age;
    private float salary;
    private boolean isMarried;
    static long population;

    public Human(String name, int age, boolean isMarried, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        this.population += 1;
    }
}
