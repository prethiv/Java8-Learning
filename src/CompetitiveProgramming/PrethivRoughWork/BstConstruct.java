package CompetitiveProgramming.PrethivRoughWork;


import java.util.Scanner;

public class BstConstruct {

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        else{
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }

    public static Node insertIntoTree(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            if(data<= root.key){
                root.left=insertIntoTree(root.left,data);
            }
            else{
                root.right=insertIntoTree(root.right,data);
            }
            return root;
        }
    }

    public static void main(String[] args) {

        Node root =new Node(1);
//        root.root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inorder(root);

        Node root1= null;
        Scanner scanner = new Scanner(System.in);
        int noOfnodes = scanner.nextInt();
        for(int i=0;i<noOfnodes;i++){
            int temp =scanner.nextInt();
            root1=insertIntoTree(root1,temp);
        }
        inorder(root1);


    }


}
