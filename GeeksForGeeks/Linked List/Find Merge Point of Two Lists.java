static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode x=head1;
        SinglyLinkedListNode y=head2;
        int f=0;
        int d=0;
        while(x!=null || y!=null)
        {
            if(x==null)
            {
                y=y.next;
                d++;
                f=0;
            }else if(y==null){
                x=x.next;
                d++;
                f=1;
            }
            else{
                x=x.next;
                y=y.next;
                
            }
        }
        x=head1;
        y=head2;
        while(d!=0)
        {
            if(f==0)
                y=y.next;
            else
                x=x.next;
            d--;
        }
        while(x!=null && y!=null && x!=y)
        {
            x=x.next;
            y=y.next;
        }
        return x.data; 
}
