package animal;

public class Review04 {

    public static void main(String[] args) {

        Human tanaka = new Human(25, "田中 太郎", "電車");
        tanaka.say();
        tanaka.think();

        Human suzuki = new Human(30, "鈴木 次郎", "野球");
        suzuki.say();
        suzuki.think();

        Human sato = new Human(20, "佐藤 花子", "映画");
        sato.say();
        sato.think();

    }
}
