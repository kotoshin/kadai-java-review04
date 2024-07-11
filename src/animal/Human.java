package animal;

public class Human extends Animal implements Thinkable {

    private String hobby;

    public Human() {

    }

    public Human(int age, String name, String hobby) {
        super(age, name);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }
}