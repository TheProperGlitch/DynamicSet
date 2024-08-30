public class Element {

    Integer value;
    Element lchild;
    Element rchild;
    Element prev;
    int key;

    Element(Integer input, int key){
        value = input;
    }

    void setPrev(Element input){
        prev = input;
    }

    void setKey(int input){
    key = input;
    }

    int getKey(){
        return key;
    }

    void setting(Element input){
        if (input.getKey() > key) {
            if (lchild == null){
                lchild = input;
                lchild.setPrev(this);
            }
            else lchild.setting(input);
        } else {
            if (rchild == null){
                rchild = input;
                rchild.setPrev(this);
            }
            else rchild.setting(input); 
        }
        
    }

    Element searching(int input){
        if (input == key) return this;
        else {
            if (input > key) return lchild.searching(input);
            else return rchild.searching(input);
        }
    }


    void deleting(Element input){
        if 
        if (next == input) next = next.getNext();
        else next.deleting(input);
    }

}
