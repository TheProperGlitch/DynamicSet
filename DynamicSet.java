public class DynamicSet {
    Element head;
    Element tail;

    void insert(Element value){
        if (head == null) head = value;
        else head.setting(value);
    }

    void printAll(){
        System.out.println();
        if (!(head == null)) head.printing();
    }

    Element search(int input){
        return head.searching(input);
    }

    void delete(Element input){
        head.deleting(input);
    }
    
}
