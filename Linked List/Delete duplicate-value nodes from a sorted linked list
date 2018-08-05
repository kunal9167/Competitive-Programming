static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        
	SinglyLinkedListNode x = head;
        while(x.next!=null)
        {
            if(x.data==x.next.data)
            {
                x.next=x.next.next;
                continue;
            }
            x=x.next;
        }
        return head;
    }
