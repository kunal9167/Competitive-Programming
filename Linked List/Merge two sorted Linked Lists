static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
     SinglyLinkedListNode x=null,y=null;
        if(head1.data<head2.data)
                {
                    x=y=head1;
                    head1=head1.next;
                }
                else
                {
                    x=y=head2;
                    head2=head2.next;
                }
        while(head1!=null && head2!=null)
        {
            
            if(head1.data<head2.data)
            {
                x.next=head1;
                head1=head1.next;
                x=x.next;
            }
            else
            {
                x.next=head2;
                head2=head2.next;
                x=x.next;
            }
        }
        if(head1==null)
        {
            if(x==null)
                return head2;
            x.next=head2;
        }
        else
        {
            if(x==null)
                return head1;
            x.next=head1;
        }
        return y;

    }
