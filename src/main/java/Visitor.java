public class Visitor {

    private int age;
    private Double height;
    private Double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getMoney() {
        return money;
    }
}
