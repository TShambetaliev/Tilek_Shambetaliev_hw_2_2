public class Main {
    public static void main(String[] args) {
        //заметка для себя. другой способ вызова
        /*createObject("Xiaomi").print();
        createObject("Samsung").print();
        createObject("Iphone").print();*/

Phone[] phones = {createObject("Xiaomi"), createObject("Samsung"),
        createObject("Iphone")};
        for (int i = 0; i < phones.length; i++) {
phones[i].print();
        }
    }
public static Phone createObject (String className) {
        Phone phone = null;
        switch (className){
            case "Xiaomi":
        phone = new Xiaomi(" Xiaomi Redmi ", 256, " Black ");
                break;
            case "Samsung":
                phone = new Samsung(" Samsung Galaxy ", 128, 12);
                break;
            case "Iphone":
                phone = new Iphone(" Iphone 11 pro max ", 256, 9.8);
                break;
        }
        return phone;
}
}