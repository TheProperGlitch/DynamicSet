public class Element {

    Integer value;
    Element lchild;
    Element rchild;
    Element prev;
    int key;

    Element(Integer input, int keyin){
        value = input;
        key = keyin;
    }

    void setPrev(Element input){
        prev = input;
    }

    Element getPrev(){
        return prev;
    }

    void setLeft(Element input){
        lchild = input;
    }

    Element getLeft(){
        return lchild;
    }

    void setRight(Element input){
        rchild = input;
    }

    Element getRight(){
        return rchild;
    }

    void setKey(int input){
    key = input;
    }

    int getKey(){
        return key;
    }

    void setting(Element input){
        System.out.println(key);
        System.out.println(input.getKey());
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



}
