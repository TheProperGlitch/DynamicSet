public class Main {
    public static void main(String[] args) {
        DynamicSet d = new DynamicSet();
        Element a = new Element(0,0);
        Element b = new Element(1,1);
        d.insert(a);
        d.insert(b);  
        d.search(1);
    }
}
