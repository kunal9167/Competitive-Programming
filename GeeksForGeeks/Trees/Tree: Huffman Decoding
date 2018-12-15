
void decode(String s, Node root) {
        Node x=root;
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='0')
                x=x.left;
            else
                x=x.right;
            if(x.right==null && x.left==null)
            {
                s2=s2+x.data;
                x=root;
            }
        }
        System.out.println(s2);
    }
