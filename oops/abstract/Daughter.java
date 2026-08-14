public class Daughter extends Parent {
    String profession;

    public Daughter(String profession) {
        this.profession = profession;
    }
    @Override
    void career() {
        System.out.println("I want to be a " + profession);
    }

}