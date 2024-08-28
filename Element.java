public class Element {

    Integer value;
    Element next;
    Element prev;
    int key;

    Element(Integer input){
        value = input;
    }

    void setPrev(Element input){
        prev = input;
    }

    void setKey(int input){
    key = input;
    }

    void setting(Element input){
        if (next == null){
            next =input;
            next.setPrev(this);
        }
        else next.setting(input);
        
    }

    void printing(){
        System.out.print(value.toString() + ", ");
        if (!(next == null)) next.printing(); 
    }

    Element searching(int input){
        if (input == key) return this;
        else return next.searching(input);
    }

    Element getNext(){
        return next;
    }

    void deleting(Element input){
        if (next == input) next = next.getNext();
        else next.deleting(input);
    }

}
