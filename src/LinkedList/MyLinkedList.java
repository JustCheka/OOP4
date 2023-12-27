package LinkedList;

public class MyLinkedList<E> implements MyList<E>{
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size;

    public MyLinkedList(){
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<E>(null, null, lstNode);
        this.size = 0;
    }

    @Override
    public void addFirst(E element) {
        Node<E> next = fstNode;
        next.setCurrentElement(element);
        fstNode = new Node<>(null, null, fstNode);
        next.setPrevElement(fstNode);
        size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(element);
        lstNode = new Node<>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> target = fstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);

        }
        return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }

    @Override
    public int size() {
        return size;
    }


    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement){
            this.currentElement = currentElement;
            this.prevElement = prevElement;
            this.nextElement = nextElement;
        }

        public E getCurrentElement(){
            return currentElement;
        }

        public void setCurrentElement(E currentElement){
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement(){
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement){
            this.nextElement = nextElement;
        }

        public void setPrevElement(Node<E> prevElement){
            this.prevElement = prevElement;
        }
    }


}
