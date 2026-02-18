package BurgerShop.model;


public class Node {

    private BurgerOrder order;
    private Node next;
    
    public Node(BurgerOrder order) {
        this.order = order;
    }

    /**
     * @return the order
     */
    public BurgerOrder getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(BurgerOrder order) {
        this.order = order;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
}
