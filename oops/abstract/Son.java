public class Son extends Parent {

    String profession;

    public Son(String profession) {
        this.profession = profession;
    }
    
    @Override
    void career() {
        System.out.println("I want to be a " + profession);
    }

}