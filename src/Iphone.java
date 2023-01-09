public class Iphone extends Phone{

    private double sizeScreen;
    public Iphone(String modelName, int memory, double sizeScreen) {
        super(modelName, memory);
        this.sizeScreen = sizeScreen ;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Размер экрана: " + sizeScreen);
    }
}
