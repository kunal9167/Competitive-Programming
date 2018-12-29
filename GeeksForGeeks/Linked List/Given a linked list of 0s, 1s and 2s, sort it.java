/*
  Sort the list of 0's,1's and 2's
  The input list will have at least one element  
  Node is defined as 
  class Node {
 int value;
  Node next;
  Node(int value) {
   this.value = value;
  }
}
*/
class GFG
{
    void linksort(Node head)
    {
        int z=0,o=0,t=0;
        while(head!=null)
        {
            if(head.value==0)
                z++;
            else if(head.value==1)
                o++;
            else
                t++;
            head=head.next;
        }
        while(z!=0)
        {
            System.out.print(0+" ");
            z--;
        }
        while(o!=0)
        {
            System.out.print(1+" ");
            o--;
        }
        while(t!=0)
        {
            System.out.print(2+" ");
            t--;
        }
    }  
}
