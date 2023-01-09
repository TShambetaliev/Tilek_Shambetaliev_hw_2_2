public abstract class Phone implements Printable {
    private String modelName;
    private int memory;


    public Phone(String modelName, int memory) {
        this.modelName = modelName;
        this.memory = memory;
    }

    @Override
    public void print() {
        System.out.println("Название модели: " + modelName + "\nОбъем памяти: " + memory);
    }
}
