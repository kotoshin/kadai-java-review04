package animal;

public class Animal {
    private String name; // 名前
    private int age; // 年齢

    public Animal() { // コンストラクタ
    }

    public Animal(int age, String name) {
        this.name = name;
        this.age = age;
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

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}
