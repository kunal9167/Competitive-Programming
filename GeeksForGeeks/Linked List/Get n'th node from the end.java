static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        
	SinglyLinkedListNode x=head;
        int n=0;
        while(x!=null)
        {
            n++;
            x=x.next;    
        }
        int r=n-positionFromTail-1;
        x=head;
        for(int i=0;i<r;i++)
            x=x.next;
        
        return x.data;
   }
