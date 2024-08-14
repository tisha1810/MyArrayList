public class Runner {
    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();
        stringCollection.add("Hello");
        stringCollection.add("Boris");
        System.out.println(stringCollection);
        stringCollection.add("i am");
        stringCollection.add("Doris");
        System.out.println(stringCollection);
        stringCollection.setByIndex(8, "The End!");
        System.out.println(stringCollection);
        stringCollection.setByIndex(6,"LaLaLa");
        System.out.println(stringCollection);
        System.out.println(stringCollection.size());
        System.out.println(stringCollection.contains("Doris"));
    }
}
