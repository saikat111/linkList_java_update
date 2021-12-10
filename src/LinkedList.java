class LinkList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }
    void insert(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }
    void print(){
        int count =0;
        int ac = 0;
        Node tnode = head;
        while (tnode != null){
            count++;
            tnode = tnode.next;
        }
        Node tnode2 = head;
        int array[] = new int[count];
        while (tnode2 != null){
            array[ac] = tnode2.data;
            ac++;
            tnode2 = tnode2.next;
        }
        for (int i = array.length-1; i >= 0 ; i--){
            System.out.println(array[i]);
        }
    }
    void printFromStart(){
        Node p = head;
        while (p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    Boolean search(Node head , int key){
        Node current = head;
        while (current != null){
            if(current.data == key)
                return true;
            current = current.next;

        }
        return false;
    }
    public static void main(String args[]){
        LinkList linkList = new LinkList();
        linkList.insert(22);
        linkList.insert(25);
        linkList.insert(222);
        linkList.insert(2222);
        linkList.print();
        System.out.println("From start");
        linkList.printFromStart();
        System.out.println(linkList.search(linkList.head, 22));
    }
}
