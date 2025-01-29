import java.util.*;
class tree{
    int data;
    tree left;
    tree right;
    tree(int data)
    {
        this.data=data;

    }
}
public class binarytree {
    public static void main(String[] args) {
        tree root=new tree(1);
        root.left=new tree(2);
        root.left.left=new tree(0);
        print(root );
    }
    public static void print(tree root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        print(root.left);

    }//rthyrtutydududtyyut
    
}