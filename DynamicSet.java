public class DynamicSet {
    Element head;
    Element tempa;

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
            else input.getPrev().setRight(null);
            if(!(input.getLeft() == null)) input.getPrev().setting(input.getLeft());
            if(!(input.getRight() == null)) input.getPrev().setting(input.getRight());
        } else {
            tempa = head;
            head = null;
            if (tempa.getLeft() != null) insert(tempa.getLeft());
            if (tempa.getRight() != null) insert(tempa.getRight());
        }
    }
    
}
