public class Main {
    public static void main(String[] args) {
    Element one = new Element(Integer.valueOf(7));
    one.setKey(58);
    Element two = new Element(Integer.valueOf(19));
    two.setKey(61);
    Element three = new Element(Integer.valueOf(3));
    three.setKey(15);
    DynamicSet testing = new DynamicSet();
    testing.insert(one);
    testing.printAll();
    testing.insert(two);
    testing.printAll();
    testing.insert(three);
    testing.printAll();
    System.out.println();
    testing.search(61).printing();
    testing.delete(two);
    testing.printAll();
    }
}
