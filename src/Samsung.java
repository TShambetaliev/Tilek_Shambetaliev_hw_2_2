public class Samsung extends Phone{

    private int versionAndroid;
    public Samsung(String modelName, int memory, int versionAndroid) {
        super(modelName, memory);
        this.versionAndroid=versionAndroid;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Версия Андроида: " + versionAndroid);
    }
}
