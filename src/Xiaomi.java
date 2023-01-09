public class Xiaomi extends Phone{
    private String color;
    public Xiaomi(String modelName, int memory, String color) {
        super(modelName, memory);
        this.color=color;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Цвет телефона: " + color);
    }
}
