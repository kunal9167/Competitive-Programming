// Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
   static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode x = head;
        DoublyLinkedListNode y = head.next;
        while(x!=null)
        {
            
            DoublyLinkedListNode t= x.prev;
            x.prev=x.next;
            x.next=t;
            
            if(y==null)
                break;
            x=y;
            y=y.next;
            
        }
        head=x;
        
        return head;
    }
