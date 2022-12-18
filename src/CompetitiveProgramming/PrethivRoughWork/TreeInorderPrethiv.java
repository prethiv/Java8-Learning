package CompetitiveProgramming.PrethivRoughWork;

class Node1{
    int key;
    Node1 left,right;
    Node1(int key){
        this.key=key;
        left=null;
        right=null;
    }
}

public class TreeInorderPrethiv {

    public static void inorder(Node1 root){
        if(root==null){
            return;
        }
        else{
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node1 root =new Node1(1);
//        root.root = new Node(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);

        inorder(root);

    }


}
