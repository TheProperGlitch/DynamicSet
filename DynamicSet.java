public class DynamicSet {
    Element head;
    Element tail;

    public void insert(Element value){
        if (head == null) head = value;
        else head.setting(value);
    }

    public Element search(int input){
        return head.searching(input);
    }

    public void delete(Element input){
        if (!(input == head)){
            if(input.getPrev().getLeft() == input) input.getPrev().setLeft(null);
            else input.setRight(null);
            if(!(input.getLeft() == null)) input.getPrev().setting(input.getLeft());
            input.getPrev().setting(input.getRight());
        } else head = null;
    }
    
}
