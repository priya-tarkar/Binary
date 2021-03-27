package implementation;

public class BST {
    Node root;
    public BST()
    {
        root=null;
    }

    public void insertion(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            while (temp != null) {
                if (temp.data > key) {
                    if (temp.left == null) {
                        temp.left = node;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (temp.data < key) {
                    if (temp.right == null) {
                        temp.right = node;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    System.out.println("duplicate r not allow");
                    break;
                }
            }

        }
    }
    public void preorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        System.out.print("\t"+temp.data);
        preorder(temp.left);
        preorder(temp.right);
    }

    public void inorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        inorder(temp.left);
        System.out.print("\t"+temp.data);
        inorder(temp.right);


    }
    public void postorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print("\t"+temp.data);
    }

    public void traverse()
    {
        System.out.println("preorder traverse");
        preorder(root);
        System.out.println();
        System.out.println("inorder traverse");
        inorder(root);
        System.out.println();
        System.out.println("postorder traverse");
        postorder(root);
    }
}
